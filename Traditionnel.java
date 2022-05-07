public abstract class Traditionnel extends Restaurant implements MenuRestos{

  //Constructeur
  public Traditionnel(){}

  public Traditionnel(String nom, int nb_p){
    super(nom,nb_p);
  }

  public Traditionnel(String nom){
    super(nom);
  }

  //Affichage
  public String toString(){
    return super.toString();
  }

  //Accesseur
  public boolean getOuvert(double h){
    return ((10<=h)&&(h<=15))||((18<=h)&&(h<=24));
  }
 
  public abstract Plat[] getPlat();  
}