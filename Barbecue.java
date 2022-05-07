public class Barbecue extends Buffet{
  private Plat[] plat;
  
  //Constructeur
  public Barbecue(){}

  public Barbecue(String nom, int nbp, Plat[] p){
    super(nom,nbp);
    plat=new Plat[p.length];
    
    for(int i=0;i<plat.length;i++){
      plat[i]=p[i].clone();
    }
  }
      
  public Barbecue(String nom, Plat[] p){
    super(nom);
    plat=new Plat[p.length];

    for(int i=0;i<plat.length;i++){
      plat[i]=p[i].clone();
    }
  }
  
  //Accesseur
  public Plat[] getPlat(){
    if(plat[0]==null){
      return null;
    }
    else{
      return plat;
    }
  }

  //Affichage
  public String toString(){
    return super.toString();
  }
    
  public String afficherMenu(){
    String s=super.toString()+"\nMenu:\n";

    for(int i=0;i<plat.length;i++){
      if (plat[i]!=null)
      s+=plat[i]+"\n";
    }

    return s;
  }
    
  //Fonction
  public void triPrixPlat(){
    Plat[] p=new Plat[(plat.length)/2];
    int k=0;

    if(super.matin){
      for (int i=0; i<((plat.length)/2); i++){
        if(plat[i].getPrix()<=RechercheResto.getPrix()){
          p[k]=plat[i];
          k++;
        } 
      }
      plat=p;
    }

    else{
      for (int i=((plat.length)/2); i<plat.length; i++){
        if(plat[i].getPrix()<=RechercheResto.getPrix()){
          p[k]=plat[i];
          k++;
          } 
        }
      plat=p;
    }
  }
    
  public Barbecue clone(){
    return new Barbecue(nom,plat);
  }
}