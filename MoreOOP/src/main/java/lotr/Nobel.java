package lotr;

import java.util.concurrent.ThreadLocalRandom;

public class Nobel extends Character{
    int max_possible_power;
    int min_possible_power;

    public Nobel(){
        super();
        this.power = getRandomPowerInGivenRange(min_possible_power, max_possible_power + 1);
        this.kickStrategy = new NobleKickStrategy();
    }

//    @Override
//    public void kick(Character victim) {
//        this.power = getPowerInCurrentNobelRange(this.getPower() + 1);
//        victim.setHp(victim.getHp() - this.getPower());
//        System.out.println("*A hit from " + this.getClass().getSimpleName() + ". Minus " + this.power + " from " + victim.getClass().getSimpleName() + "'s hp!*");
//    }

    @Override
    public boolean isAlive() {
        return this.hp > 0;
    }

    int getRandomPowerInGivenRange(int min_possible_power, int max_possible_power){
        return ThreadLocalRandom.current().nextInt(min_possible_power, max_possible_power);
    }

    int getPowerInCurrentNobelRange(int power){
        return ThreadLocalRandom.current().nextInt(0, power + 1);
    }

}
