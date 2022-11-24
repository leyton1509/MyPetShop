package PetTypes;

/**
 * Pet interface class to make sure pet implements methods
 * Must have a noise and a details string
 */
public interface PetInterface {
    /**
     * Void method to make implemented to make an animal noise
     */
     void makeAnimalNoise();

    /**
     * @return String of the details of the animal
     */
     String returnDetailsString();

}
