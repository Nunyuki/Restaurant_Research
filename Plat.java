public class Plat{
  private String nom;
  private double prix;
  
  //Constructeur
  public Plat(String n, double p){
    nom=n;
    prix=p;
  }
  
  //Accesseur
  public void setPrix(double p){
    prix = p;
  }

  public double getPrix(){
    return prix;
  }
  
  //Fonction
  public Plat clone(){
    return new Plat(nom,prix+Math.random()*1-0.5);
  }
  
  //Affichage
  public String toString(){
    return nom+": "+String.format("%.2f",prix)+"Euros";
  }
}