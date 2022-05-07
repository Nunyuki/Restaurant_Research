public class RechercheResto{
  private Restaurant[] restos;
  private static double horaire;
  private int nbPersonnes;
  private static int addresto=0; // Nombre de restaurants utilisée dans la fonction void ajouter() pour ajouter un restaurant à un indice j, incrémentée à chaque appel de ajouter()
  private int distance;
  private static double prix;
  private static final RechercheResto recherche = new RechercheResto(); //Singleton
  
  //Singleton
  private RechercheResto() {
    int nbr=Restaurant.getNbRestaurant();
    restos = new Restaurant[nbr];
    horaire = Math.random()*24;
    nbPersonnes = 1;
    distance=1;
  }

  public static RechercheResto recherche(){
    return recherche;
  }

  //Accesseurs
  public void setNbResto(){
    restos = new Restaurant[Restaurant.getNbRestaurant()];
  }
  
  public void setDistance(int d){
    distance =d;
  }

  public int getDistance(){
    return distance;
  }

  public void setNbPersonnes(int n) {
    nbPersonnes = n;
  }

   public double getNbPersonnes(){
    return nbPersonnes;
  }

  public void setHoraire(double h) {
    horaire = h;
    if (horaire > 24 || horaire < 0){
      horaire = 0;
    }
  }

  public String getHoraireActuelle() {
    int h = (int)horaire;
    double m = (horaire-h)*60;

    if(m>=10){
      return ""+h+"h"+String.format("%.0f",m);
    }

    else{
      return ""+h+"h"+"0"+String.format("%.0f",m);
    }
  }

  public static double getHoraire(){
    return horaire;
  }

  public void setPrix(double p){
    prix=p;
  }

  public static double getPrix(){
    return prix;
  }
  
  public void nbplaces(){
    int nbr=Restaurant.getNbRestaurant();

    for(int i=0;i<nbr;i++){
      if(horaire<=14 && horaire>=12){
        int p=(int)(Math.random()*10+10);
        restos[i].setNbPlacesLibres(p);
      }      
    }
  }

 

  

  //Affichage
  public String toString(){
    boolean b=false; // si aucun restaurant ne s'affiche
    String s="";

    for(int i=0;i<restos.length;i++){
      if (restos[i]!=null){
        s+=restos[i]+"\n";
        b=true;
      }
    }

    if (!b) {
      System.out.println("Oups! Il n'y a aucun restaurant correspondant à vos exigences... ");
      System.out.println("Retentez votre chance!");
      System.exit(0);
    }
    return s;
  }

  public String menu(){
    String s="";

    for(int i=0; i<restos.length;i++){
      if (restos[i]!=null)
      s+=restos[i].afficherMenu()+"\n"+"\n";
    }

    return s;
  }
 

  //Fonctions
  public void ajouter(Restaurant r){
    restos[addresto]=r;
    addresto++;
  }

  public void triPers(){
    int nbr=Restaurant.getNbRestaurant();
    int k=0;
    Restaurant[] r = new Restaurant[nbr];

    for(int i=0;i<nbr;i++){
      if((restos[i]!=null)&&(getNbPersonnes()<=restos[i].getNbPlacesLibres())){
        r[k]=restos[i];
        k++;
        System.out.println(restos[i].toStringPlace());
      }
    }
    restos=r;
  }

  public void triDistance(){
    int nbr=Restaurant.getNbRestaurant();
    int k=0;
    Restaurant[] r = new Restaurant[nbr];

    for(int i=0;i<nbr;i++){
      if (restos[i]!=null){
        if(restos[i].getLieu()<=getDistance()){
          r[k]=restos[i];
          k++;
          System.out.println(restos[i].toStringDis());
        }
      }
    }
    restos=r;
  }

  public void triOuvert(){
    int k=0;
    int nbr=Restaurant.getNbRestaurant();
    Restaurant[] r = new Restaurant[nbr];

    for(int i=0;i<nbr;i++){
      if (restos[i]!=null){
        if(restos[i].getOuvert(horaire)){
          r[k]=restos[i];
          k++;
        }
      }
    }
    restos=r;
  } 

  public void triPrix(){
    int nbr=Restaurant.getNbRestaurant();
    int k=0;
    Restaurant[] r = new Restaurant[nbr];
    
    for(int i=0; i<restos.length; i++){
      if (restos[i]!=null){
        restos[i].triPrixPlat();
        if(restos[i].getPlat()!=null){
          r[k]=restos[i];
          k++;
          System.out.println();
        }
      }
    }
    restos = r;
  }

  public void triResto(int l){
    int k=0;
    int nbr=Restaurant.getNbRestaurant();
    Restaurant[] r = new Restaurant[nbr];
    Traditionnel testt=new Francais();
    Rapide testr= new FastFood();
    Buffet testb=new Sushi();

    switch(l){

      // Traditionnel
      case 1:
        System.out.println("Voici la liste des restaurants traditionnels disponibles.");
        for(int i=0; i<restos.length; i++){
          if (restos[i]!=null){
            if (restos[i].getClass().getSuperclass()==testt.getClass().getSuperclass()){
              r[k]=restos[i];
              k++;
            }
          }
        }

        break;
      
      // Rapide
      case 2:
      System.out.println("Voici la liste des restaurants rapides disponibles.");
      for(int i=0; i<restos.length; i++){
        if (restos[i]!=null){
          if (restos[i].getClass().getSuperclass()==testr.getClass().getSuperclass()){
            r[k]=restos[i];
            k++;
          }
        }
      }
      break;

      // Buffet
      case 3:
      System.out.println("Voici la liste des restaurants de type buffet disponibles.");
      for(int i=0; i<restos.length; i++){
        if (restos[i]!=null){
          if (restos[i].getClass().getSuperclass()==testb.getClass().getSuperclass()){
            r[k]=restos[i];
            k++;
          }
        }
      }
      break;

    }
    restos=r;
  }

  public void triEmporter(){
    int k=0;
    int nbr=Restaurant.getNbRestaurant();
    Restaurant[] r = new Restaurant[nbr];
    
    for (int i=0; i<restos.length; i++){
      if (restos[i]!=null){
        if (((Rapide)restos[i]).getEmporte()){
          r[k]=restos[i];
          k++;
        }
      }
    }  
    restos=r;
  }

}