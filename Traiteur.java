public class Traiteur extends Rapide{
  private Plat[] plat;
  
  //Constructeur
  public Traiteur(){}

  public Traiteur(String nom, int nbp, Plat[] p){
    super(nom,nbp);
    plat=new Plat[p.length];

    for(int i=0;i<plat.length;i++){
      plat[i]=p[i].clone();
    }
  }
    
  public Traiteur(String nom, Plat[] p){
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
    return super.toString()+"\n";
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
    Plat[] p=new Plat[plat.length];
    int k=0;

    for (int i=0; i<plat.length; i++){
      if(plat[i].getPrix()<=RechercheResto.getPrix()){
        p[k]=plat[i];
        k++;
      } 
    }
    plat=p;
  }
  
  public Traiteur clone(){
    return new Traiteur(nom,plat);
  }
}  