package lotr;

public class GameManager {
    public void fight(Character character1, Character character2){
        Character initiator = character1;
        Character defender = character2;

        System.out.println(initiator.toString() + " vs " + defender.toString());
        if (initiator.getClass().getSimpleName().equals("Hobbit") && defender.getClass().getSimpleName().equals("Hobbit")){
            System.out.println("Hobbits do not fight with each other!");
        } else {
            while (initiator.isAlive() && defender.isAlive()){
                initiator.kick(defender);
                System.out.println(initiator + " vs " + defender);
                Character temp = initiator;
                initiator = defender;
                defender = temp;
            }
        }
        if (initiator.getClass().getSimpleName().equals("Hobbit") && defender.getClass().getSimpleName().equals("Hobbit")){
            System.out.println("Hobbits are the winners!");
        } else if (initiator.isAlive()){
            System.out.println(initiator.getClass().getSimpleName() + " is the winner of the fight!");
        } else if(defender.isAlive()){
            System.out.println(defender.getClass().getSimpleName() + " is the winner of the fight!");
        } else {
            System.out.println("Well, seems that something went wrong... Anyway!");
        }

    }

    public static void main(String[] args) {
        GameManager my_manager = new GameManager();
        CharacterFactory factory = new CharacterFactory();
        my_manager.fight(factory.createCharacter(), factory.createCharacter());
    }
}
