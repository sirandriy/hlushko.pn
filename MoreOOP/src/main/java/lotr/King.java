package lotr;

import java.util.concurrent.ThreadLocalRandom;

public class King extends Nobel{
    public King() {
        super();
        this.min_possible_power = 5;
        this.max_possible_power = 15;
        this.power = getRandomPowerInGivenRange(min_possible_power, max_possible_power);
        this.hp  = ThreadLocalRandom.current().nextInt(min_possible_power, max_possible_power + 1);
    }
}
