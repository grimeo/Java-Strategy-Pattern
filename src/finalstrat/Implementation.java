package finalstrat;

public class Implementation {
    
}
class AssassinateHero implements Assassinate{

    @Override
    public void assasinate() {
        System.out.println("assassinated enemy hero.");
    }
    
}

class AssassinateCreeps implements Assassinate{

    @Override
    public void assasinate() {
        System.out.println("assassinated enemy creeps.");
    }
    
}

class AttackCreeps implements Attack{

    @Override
    public void attack() {
        System.out.println("attacked the creeps");
    }
    
}

class AttackHero implements Attack{

    @Override
    public void attack() {
        System.out.println("attacked the hero");
    }
    
}

class ShrapnelToCreeps implements Shrapnel{

    @Override
    public void shrapnel() {
        System.out.println("shrapneled enemy creeps");
    }
    
}

class ShrapnelToHero implements Shrapnel{

    @Override
    public void shrapnel() {
        System.out.println("shrapneled enemy hero");
    }
    
}