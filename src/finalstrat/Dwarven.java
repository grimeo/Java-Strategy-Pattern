package finalstrat;

public class Dwarven extends Hero{
    Dwarven(){
        super();
        assassinate = new AssassinateCreeps();
        attack = new AttackCreeps();
        shrapnel = new ShrapnelToCreeps();
    }
    
    public void engage(){
        doAttack();
        doShrapnel();
        doUlti();
    }
}
