package lotr;
import java.lang.reflect.Constructor;
import java.util.Random;

public class CharacterFactory {
    private static final String[] characterTypes = {
            "Elf", "Hobbit", "Knight", "King"
    };
    public Character createCharacter() {
        Random random = new Random();
        String randomType = "lotr." + characterTypes[random.nextInt(characterTypes.length)];
        try {
            Class<?> characterClass = Class.forName(randomType);
            Constructor<?> constructor = characterClass.getDeclaredConstructor();
            return (Character) constructor.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Error creating character", e);
        }
    }

    public static void main(String[] args) {
        CharacterFactory my_fact = new CharacterFactory();
        Character rand_char = my_fact.createCharacter();
        System.out.println(rand_char.toString());
    }
}

