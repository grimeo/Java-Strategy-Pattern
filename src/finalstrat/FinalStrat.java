package finalstrat;

public class FinalStrat {

    public static void main(String[] args) {
        
        Dwarven snipe = new Dwarven();
        snipe.setName("kardel");
        snipe.setLevel(25);
        
        System.out.println("Name: " + snipe.getName() );
        System.out.println("Level: " + snipe.getLevel() );
        
        snipe.engage();
        
        //the strategy pattern
        System.out.println("\nTargeting the enemy hero.");
        
        snipe.setAttack(new AttackHero());
        snipe.setShrapnel(new ShrapnelToHero());
        snipe.setUlti(new AssassinateHero());
        
        snipe.engage();
    }
    
}
