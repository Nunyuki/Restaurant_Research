public class Menu {
    private Plat[] platFrancais = {new Plat("Poulet",7.4), new Plat("Porc",8.3), new Plat("Boeuf",10.6), new Plat("Crevette",12) , new Plat("Brocolis",8.2), new Plat("Patate",9), new Plat("Poisson",10.5), new Plat("Soupe",9), new Plat("Agneau", 14), new Plat("Spaghetti",6.5)};
    private Plat[] platAsiatique = {new Plat("Riz",4), new Plat("Nouille",5.4), new Plat("Boeuf",9.2), new Plat("Crevette",12.5) , new Plat("Brocolis",6.5), new Plat("Patate",8.2), new Plat("Poisson",13.5), new Plat("Soupe",9), new Plat("Poulet", 9.2), new Plat("Porc",8.5)};
    private Plat[] platAfricain = {new Plat("Poulet",6),new Plat("PetitsPois",3),new Plat("Saucisse",6),new Plat("Carotte",4),new Plat("Boulette",9),new Plat("Brocoli",4.5),new Plat("Patate",5.5),new Plat("Ravitoto",10.5), new Plat("Courgette",6), new Plat("Soupe",12)};
    private Plat[] platTraiteur = {new Plat("Boeuf",2.1), new Plat("Poulet", 1.95), new Plat("Porc", 1.95), new Plat("Calamar",3.1), new Plat("Poisson", 2.3), new Plat("Riz", 1.3), new Plat("Crevette", 2.9), new Plat("Vermicelle", 1.3), new Plat("Patate", 1.3), new Plat("Canard", 2.95)};
    private Plat[] platStreetFood = {new Plat("Churros",6), new Plat("Crepe",4), new Plat("HotDog",5.6), new Plat("Sandwich",8) , new Plat("Gauffre",5.2)};
    private Plat[] platFastFood = {new Plat("Burger", 8.3), new Plat("Frite", 2.5), new Plat("Nugget", 4), new Plat("Wrap", 7), new Plat("Poulet", 9.5), new Plat("Grec", 6.5), new Plat("Pizza", 7), new Plat("HotDog", 4), new Plat("Tacos", 8), new Plat("Panini",5)};
    private Plat[] platSushi = {new Plat("Matin - Enfant", 10.70), new Plat("Matin - Adulte", 12.70), new Plat("Soir - Enfant", 15.70), new Plat("Soir - Adulte", 17.70)};
    private Plat[] platBarbecue = {new Plat("Matin - Enfant", 9.70), new Plat("Matin - Adulte", 10.70), new Plat("Soir - Enfant", 16.70), new Plat("Soir - Adulte", 17.70)};
    private Plat[] platFondue = {new Plat("Matin - Enfant", 15.70), new Plat("Matin - Adulte", 18.70), new Plat("Soir - Enfant", 17.70), new Plat("Soir - Adulte", 19.70)};

    //Constructeur
    public Menu(){}
    
    //Accesseur
    public Plat[] getPlatFrancais(){
        return platFrancais;
    }

    public Plat[] getPlatAsiatique(){
        return platAsiatique;
    }

    public Plat[] getPlatfricain(){
        return platAfricain;
    }

    public Plat[] getPlatTraiteur(){
        return platTraiteur;
    }

    public Plat[] getPlatFastFood(){
        return platFastFood;
    }

    public Plat[] getPlatSushi(){
        return platSushi;
    }

    public Plat[] getPlatBarbecue(){
        return platBarbecue;
    }

    public Plat[] getPlatFondue(){
        return platFondue;
    }

    public Plat[] getPlatSteetFood(){
        return platStreetFood;
    }
}
