public abstract class Restaurant{
  protected int nb_places;
  protected int nb_places_libres;
  protected boolean ouvert;
  protected String nom;
  private static int nb_restaurant=0;
  private int id;
  protected int lieu; // échelle de 1 à 10 selon la distance

  //Constructeur
  public Restaurant(){};

  public Restaurant(String n, int nbp){
    nom=n;
    nb_places=nbp;
    nb_places_libres=(int)(Math.random()*(nbp)+2);  
    nb_restaurant++;
    id=nb_restaurant;
    lieu=(int)(Math.random()*10+1);
  }

  public Restaurant(String n){
    this(n,(int)(Math.random()*(50)+20));
  }

  //Accesseur
  public int getLieu(){
    return lieu;
  }

  public static int getNbRestaurant(){
    return nb_restaurant;
  }

  public String getNom(){
    return nom;
  }

  public int getNbPlaces(){
    return nb_places;
  }

  public int getNbPlacesLibres(){
    return nb_places_libres;
  }

  public void setNbPlacesLibres(int n){
    nb_places_libres-=n;
    if(nb_places_libres<0) nb_places_libres = 0; 
  }

  //Affichage
  public String toString(){
    return "Restaurant "+getClass().getName()+": "+nom+id+ "\n";
    
  }
  
  public String toStringPlace(){
    return "Restaurant "+getClass().getName()+": "+nom+id+ "\nNombre de places libres: "+getNbPlacesLibres()+"\n";
  }

  public String toStringDis(){
    return "Restaurant "+getClass().getName()+": "+nom+id+ "\nNombre de places libres: "+getNbPlacesLibres()+"\nDistance: "+lieu +" km\n";
  }
  
  //Fonction
  public abstract boolean getOuvert(double h);

  public void triPrixPlat() {};

  public abstract Plat[] getPlat();
  
  public String afficherMenu(){
    String s="";
    return s;
  }

 
}