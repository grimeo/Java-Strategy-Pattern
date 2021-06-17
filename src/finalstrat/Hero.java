package finalstrat;

public class Hero {
    
    private String name;
    private int level;
    
    Assassinate assassinate;
    Shrapnel shrapnel;
    Attack attack;
    
    
    //setters and getters
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    
    public void setLevel(int newLevel){
        level = newLevel;
    }
    public int getLevel(){
        return level;
    }
    
   
    public void doUlti(){
        assassinate.assasinate();
    }
    
    public void doAttack(){
        attack.attack();
    }
    
    public void doShrapnel(){
        shrapnel.shrapnel();
    }
    
    
    
    //strategy pattern
    public void setUlti( Assassinate assassinate){
        this.assassinate = assassinate;
    }
    
    public void setAttack(Attack attack){
        this.attack = attack;
    }
    
    public void setShrapnel(Shrapnel shrapnel){
        this.shrapnel = shrapnel;
    }
}
