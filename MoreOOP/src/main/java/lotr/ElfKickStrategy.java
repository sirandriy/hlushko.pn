package lotr;

public class ElfKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character victim) {
        if (victim.getPower() <= attacker.getPower()) {
            victim.setHp(0);
            System.out.println("*Elf wildly assassinates " + victim.getClass().getSimpleName() + "!*");
        } else {
            victim.setPower(victim.getPower() - 1);
            System.out.println("*Elf poisoned " + victim.getClass().getSimpleName() + "! Minus 1 power from " + victim.getClass().getSimpleName() + "*");
        }
    }
}

// Create similar KickStrategy implementations for other character types

