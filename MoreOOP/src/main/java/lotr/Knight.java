package lotr;
import java.util.concurrent.ThreadLocalRandom;

public class Knight extends Nobel{
    public Knight() {
        super();
        this.min_possible_power = 2;
        this.max_possible_power = 12;
        this.power = getRandomPowerInGivenRange(min_possible_power, max_possible_power);
        this.hp  = ThreadLocalRandom.current().nextInt(min_possible_power, max_possible_power + 1);
    }
}
