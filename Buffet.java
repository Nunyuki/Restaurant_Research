public abstract class Buffet extends Restaurant implements MenuRestos{
  protected boolean matin;
  
  //Constructeur
  public Buffet(){}
        
  public Buffet(String nom, int nb_p){
    super(nom,nb_p);
    
    if(11<=RechercheResto.getHoraire() && RechercheResto.getHoraire()<=15){
      matin = true;
    }
    else{
      matin=false;
    }
  }
      
  public Buffet(String nom){
    super(nom);
  }
  
  //Affichage
  public String toString(){
    return super.toString();
  }
  
  //Accesseur
  public boolean getOuvert(double h){
    return ((11<=h)&&(h<=15)||(18.5<=h)&&(h<=24));
  }
      
  public abstract Plat[] getPlat();
}