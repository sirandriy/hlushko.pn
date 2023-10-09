package lotr;

public class NobleKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character victim) {
        if (attacker instanceof Nobel) {
            Nobel nobleAttacker = (Nobel) attacker;
            int newPower = nobleAttacker.getPower() + 1;
            nobleAttacker.setPower(newPower);
            int damage = nobleAttacker.getPower();
            victim.setHp(victim.getHp() - damage);
            System.out.println("*A hit from " + attacker.getClass().getSimpleName() + ". Minus " + damage + " from " + victim.getClass().getSimpleName() + "'s hp!*");
        } else {
            System.out.println("Invalid attacker type for Nobel KickStrategy.");
        }
    }
}
