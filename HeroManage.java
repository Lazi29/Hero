public class HeroMannage{
    public static void main(String[] args){
    public ArrayList<Hero> heroes;

    public HeroMannage() {
        heroes = new ArrayList<>();
    }

    // Method to add a hero
    public void addHero(String name, int powerLevel) {
        heroes.add(new Hero(name, powerLevel));
    }

    // Method to remove a hero by name
    public void removeHero(String name) {
        heroes.removeIf(hero -> hero.name.equals(name));
    }

    // Method to sort heroes by power level
    public void sortHeroesByPowerLevel() {
        Collections.sort(heroes, Comparator.comparingInt(hero -> hero.powerLevel));
    }

    // Method to display all heroes
    public void displayHeroes() {
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }

    public static void main(String[] args) {
        HeroManager manager = new HeroManager();
        manager.addHero("Superman", 100);
        manager.addHero("Batman", 85);
        manager.addHero("Wonder Woman", 95);

        System.out.println("Heroes before sorting:");
        manager.displayHeroes();

        manager.sortHeroesByPowerLevel();
        System.out.println("\nHeroes after sorting by power level:");
        manager.displayHeroes();

        manager.removeHero("Batman");
        System.out.println("\nHeroes after removing Batman:");
        manager.displayHeroes();



        /*
        Hero hero1 = new Hero("Super-Girl", 100, HeroTeam.JUSTICE_LIGUE);
        Hero hero2 = new Hero("Spider-Man", 90, HeroTeam.AVENGERS);
        Hero hero3 = new Hero("Super-Man", 101, HeroTeam.FANTASTIC_FOUR);

       System.out.println(hero1);
       System.out.println(hero2);
       System.out.println(hero3);

        */
   
        }
    }
}