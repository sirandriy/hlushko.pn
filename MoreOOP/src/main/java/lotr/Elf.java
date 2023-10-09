package lotr;

public class Elf extends Character{
    public Elf() {
        super();
        this.power = 10;
        this.hp = 10;
        this.kickStrategy = new ElfKickStrategy();
    }

    public void kick (Character victim){
        if (victim.getPower() <= this.getPower()){
            victim.setHp(0);
            System.out.println("*Elf wildly assassinates " + victim.getClass().getSimpleName() + "!*");
        } else {
            victim.setPower(victim.getPower() - 1);
            System.out.println("*Elf poisoned " + victim.getClass().getSimpleName() + "! Minus 1 power from " + victim.getClass().getSimpleName() + "*");
        }
    }

    public boolean isAlive(){
        return this.getHp() > 0;
    }
}
