package lotr;

public class Hobbit extends Character{
    public Hobbit() {
        super();
        this.power = 0;
        this.hp = 3;
    }

    public void kick(Character victim){
        toCry();
    }

    private void toCry(){
        System.out.println("*Hobbit cryes like a... Hobbit!*");
    }

    public boolean isAlive(){
        return this.getHp() > 0;
    }
}
