public class StreetFood extends Rapide{
  private Plat[] plat;
  
  //Accesseur
  public StreetFood(){}

  public StreetFood(String nom, int nbp, Plat[] p){
    super(nom,0);
    super.emporte=true;
    plat=p;
  
    for(int i=0;i<plat.length;i++){
      plat[i]=p[i].clone();
    }
  }
    
  public StreetFood(String nom, Plat[] p){
    super(nom);
    super.emporte=true;
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
  
  public StreetFood clone(){
    return new StreetFood(nom,plat);
  }
}  