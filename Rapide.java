public abstract class Rapide extends Restaurant{
  protected boolean emporte;

  //Constructeur
  public Rapide(){}

  public Rapide(String nom, int nb_p){
    super(nom,nb_p);
    emporte = Math.random()<0.5;
  }

  public Rapide(String nom){
    super(nom);
    emporte = Math.random()<0.5;
  }
  
  //Affichage
  public String toString(){
    return super.toString();
  }
 
  //Accesseur
  public boolean getOuvert(double h){
    return ((10.5<=h)&&(h<=23.5));
  }
  
  public boolean getEmporte(){
    return emporte;
  }

  public void setEmporte(boolean e){
    emporte = e;
  }

  public abstract Plat[] getPlat();
}