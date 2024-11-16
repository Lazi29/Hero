public class HeroMannager{
    public static void main(String[] args){
        Hero hero1 = new Hero("Super-Girl", 100, HeroTeam.JUSTICE_LIGUE);
        Hero hero2 = new Hero("Spider-Man", 90, HeroTeam.AVENGERS);
        Hero hero3 = new Hero("Super-Man", 101, HeroTeam.FANTASTIC_FOUR);

       System.out.println(hero1);
       System.out.println(hero2);
       System.out.println(hero3);


    }
}