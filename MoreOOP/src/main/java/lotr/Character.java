package lotr;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter
public abstract class Character {
    int power;
    int hp;
    KickStrategy kickStrategy;

    public void kick(Character victim) {
        if (kickStrategy != null) {
            kickStrategy.kick(this, victim);
        }
    }

    public void setHp(int hp){
        this.hp = (hp < 0) ? 0 : hp;
    }

    public String toString(){
        return "lotr" + "." + getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower() + "}";
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

}
