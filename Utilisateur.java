// import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilisateur{
  public static Scanner scanner= new Scanner(System.in);

  public static void scanS(String s) throws Erreur {
    if ((!(s.equals("Oui")))&&(!(s.equals("Non"))))
      throw new Erreur("Erreur.");
  }

  public static int loopI(){
    Scanner in;
    boolean b=true;
    int s=0;
    while(b){
      try {
			  in= new Scanner(System.in);
        s=in.nextInt();
			  System.out.println("Ok ^^");
          b=false;
		  } 
    catch (Exception e) {
			System.out.println("Veuillez insérer un entier.");
		  }
	  }
    return s;
  }
   
  public static double loopD(){
    Scanner in;
    boolean b=true;
    double s=0;
    while(b){
      try {
			  in= new Scanner(System.in);
        s=in.nextDouble();
			  System.out.println("Ok");
          b=false;
		  } 
    catch (Exception e) {
			System.out.println("Veuillez insérer un réel.");
		  }
	  }
    return s;
  }

  public static String loopS(String s){
    boolean b=true;
    while(b){
      try{
        scanS(s);
        b=false;
      }
      catch (Erreur e){
        System.out.println("Erreur. Veuillez choisir entre (Oui) ou (Non) uniquement.");
        s=scanner.nextLine();
      }
    }
    return s;
  }

  public static void sys(RechercheResto r){
    String s = r.toString() ;for (int i=0;i<s.length();i++){
      System.out.print(s.charAt(i));
        if(s.charAt(i)=='\n') {
        try {
              Thread.sleep(100);
            }
            catch(InterruptedException e) {
              e.printStackTrace();
            }	
          }
        }
  }

  public static void main(String[] args) {
   
    // Création de différents restaurants
    Menu menu = new Menu();
    Francais fr1 = new Francais("Bonjour",50, menu.getPlatFrancais());
    Francais fr2 = fr1.clone();
    Francais fr3 = fr2.clone();
    Francais fr4 = fr3.clone();
    Francais fr5 = fr4.clone();

    Asiatique as1 = new Asiatique("Ohayo",50, menu.getPlatAsiatique());
    Asiatique as2 = as1.clone();
    Asiatique as3 = as2.clone();
    Asiatique as4 = as3.clone();
    Asiatique as5 = as4.clone();

    Africain af1 = new Africain("Hello",50, menu.getPlatfricain());
    Africain af2 = af1.clone();
    Africain af3 = af2.clone();
    Africain af4 = af3.clone();
    Africain af5 = af4.clone();

    FastFood ff1 =  new FastFood("Miam",50, menu.getPlatFastFood());
    FastFood ff2 = ff1.clone();
    FastFood ff3 = ff2.clone();
    FastFood ff4 = ff3.clone();
    FastFood ff5 = ff4.clone();

    StreetFood sf1 = new StreetFood("Krunch",50,menu.getPlatSteetFood());
    StreetFood sf2 = sf1.clone();
    StreetFood sf3 = sf2.clone();
    StreetFood sf4 = sf3.clone();
    StreetFood sf5 = sf4.clone();

    Traiteur tr1 = new Traiteur("HaoChi",50,menu.getPlatTraiteur());
    Traiteur tr2 = tr1.clone();
    Traiteur tr3 = tr2.clone();
    Traiteur tr4 = tr3.clone();
    Traiteur tr5 = tr4.clone();

    Sushi su1 = new Sushi("Itadakimasu", 50, menu.getPlatSushi());
    Sushi su2 = su1.clone();
    Sushi su3 = su2.clone();
    Sushi su4 = su3.clone();
    Sushi su5 = su4.clone();

    Barbecue ba1 = new Barbecue("AuFeu",50,menu.getPlatBarbecue());
    Barbecue ba2 = ba1.clone();
    Barbecue ba3 = ba2.clone();
    Barbecue ba4 = ba3.clone();
    Barbecue ba5 = ba4.clone();

    Fondue fo1 = new Fondue("SaChauffe",50,menu.getPlatFondue());
    Fondue fo2 = fo1.clone();
    Fondue fo3 = fo2.clone();
    Fondue fo4 = fo3.clone();
    Fondue fo5 = fo4.clone();

    // Tableau de restaurants
    RechercheResto r= RechercheResto.recherche();
    r.setNbResto();
    r.ajouter(fr1); r.ajouter(fr2); r.ajouter(fr3); r.ajouter(fr4); r.ajouter(fr5);
    r.ajouter(as1); r.ajouter(as2); r.ajouter(as3); r.ajouter(as4); r.ajouter(as5);
    r.ajouter(af1); r.ajouter(af2); r.ajouter(af3); r.ajouter(af4); r.ajouter(af5);
    r.ajouter(ff1); r.ajouter(ff2); r.ajouter(ff3); r.ajouter(ff4); r.ajouter(ff5);
    r.ajouter(sf1); r.ajouter(sf2); r.ajouter(sf3); r.ajouter(sf4); r.ajouter(sf5);
    r.ajouter(tr1); r.ajouter(tr2); r.ajouter(tr3); r.ajouter(tr4); r.ajouter(tr5);
    r.ajouter(su1); r.ajouter(su2); r.ajouter(su3); r.ajouter(su4); r.ajouter(su5);
    r.ajouter(ba1); r.ajouter(ba2); r.ajouter(ba3); r.ajouter(ba4); r.ajouter(ba5);
    r.ajouter(fo1); r.ajouter(fo2); r.ajouter(fo3); r.ajouter(fo4); r.ajouter(fo5);
    
    
    System.out.println("Bonjour! Bienvenu dans votre moteur de recherche de restaurants!");
    System.out.println("Vous avez le choix entre "+Restaurant.getNbRestaurant()+ " restaurants.");
    System.out.println("\n");


    // AFFICHAGE DES RESTAURANTS
    System.out.println("Voulez-vous afficher tous les restaurants disponibles?");
    System.out.println("Choisissez entre <Oui> ou <Non>:");
    String tous=scanner.nextLine();
   
    // Exception
    tous=loopS(tous);

    if (tous.equals("Oui")){ //System.out.println(r);
    sys(r);}
    if (tous.equals("Non")){ System.out.println("D'accord.");}


    // AIDE FILTRE
    System.out.println("\n");
    System.out.println("Il y a énormément de choix!! Voulez-vous de l'aide pour filtrer votre recherche?");
    System.out.println("Choisissez entre <Oui> ou <Non>.");
    String filtre=scanner.nextLine();

    // Exception
    filtre=loopS(filtre);
    if (filtre.equals("Oui")){ // On continue la recherche


    // HORAIRE
    System.out.println("\n");
    System.out.println("A quelle heure voulez-vous manger?");

    // Exception (si on saisit un nombre > 24, il sera automatiquement minuit!)
    double heure=loopD();
    r.setHoraire(heure);
    System.out.println("Il est "+r.getHoraireActuelle()+". Regardons les restaurants disponibles!");
    r.nbplaces();
    r.triOuvert();
    System.out.println("\n");
    sys(r);
    
    // A EMPORTER
    System.out.println("Tout d'abord, souhaitez-vous prendre à emporter?");
    System.out.println("Choisissez entre <Oui> ou <Non>.");
    String emp=scanner.nextLine();

    // Exception
    emp=loopS(emp);
    if (emp.equals("Oui")){
      r.triResto(2); // tri restaurants rapides
      r.triEmporter();
      System.out.println("\n");
      System.out.println("Voici une liste des restaurants proposant l'option à emporter.");
      sys(r);
    }

    // NOMBRE DE PERSONNES
    if (emp.equals("Non")){
    System.out.println("\n");
    System.out.println("Pour combien de personnes cherchez-vous une table?");

    // Exception
    int pers=loopI();
    System.out.println("Une table de " +pers+". C'est noté!");
    r.setNbPersonnes(pers);
    r.triPers();
    }
    

    // OPTION PERSONNALISEE
    System.out.println("Vous avez la possibilité de poursuivre le filtrage à l'aide d'autres paramètres.");
    System.out.println("Par rapport à quel paramètre souhaitez-vous filter votre recherche?");


    int n_max=4;
    for(int i=0; i<n_max; i++){

      // Evidemment, il est inutile de filtrer par rapport au type de restaurants si on prend à emporter.
      // Seuls les restaurants rapides offrent ce service. 
      System.out.println("<1> Distance - <2> Type de restaurant - <3> Budget - <4> Fin du filtre");

      // Exception
      int choix=loopI();
      if (choix==n_max) break; // Sortie de l'option personnalisée

      while(choix>4){
        System.out.println("Veuillez insérer une valeur inférieure à 5.");
        choix=loopI();
      }

      switch (choix){

          case 1: // DISTANCE
          System.out.println("\n");
          System.out.println("A quelle distance voulez-vous manger?");
        
          // Exception
          int dis=loopI();
          r.setDistance(dis);
          r.triDistance();
          System.out.println("\n");
          break;


          case 2: // TRI RESTAURANTS 
          System.out.println("\n");
          System.out.println("Trois types de restaurants se présentent à vous.");
          System.out.println("Quel type de restaurant recherchez-vous?");
          System.out.println("<1> Traditionnel - <2> Rapide - <3> Buffet");
          
          // Exception
          int l=loopI();
          r.triResto(l);
          System.out.println("\n");
          sys(r);
          break;


          case 3: // BUDGET
          System.out.println("\n");
          System.out.println("Quel est votre budget?");

          double money=loopD();
          r.setPrix(money);
          System.out.println("Votre budget est de "+RechercheResto.getPrix()+" euros.");
          r.triPrix();
          System.out.println("Les restaurants suivants offrent des plats compatibles avec votre budget.");
          sys(r);
          System.out.println("Voulez-vous afficher les menus?");
          System.out.println("Choisissez entre <Oui> ou <Non>:");
          String men=scanner.nextLine();
    
          // Exception
          men=loopS(men);
          if (men.equals("Oui")) System.out.println(r.menu()); 
          break;


          case 4: // SORTIE
          System.out.println("Voici quelques suggestions de restaurants.");
          sys(r);
          break;
        }
      }
    }
  
   
    System.out.println("Merci d'avoir choisi notre moteur de recherche! A bientôt!");
  
  }
}