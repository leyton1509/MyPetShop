package PetTypes;

/**
 * Dog class extending the pet class
 */
public class Dog extends Pet {

    /**
     * A representation of a dog
     * Is a pet
     * @param _animalName the name of animal
     * @param _animalClass the class of the animal
     * @param _animalAge the age of the animal
     * @param _ownerName the name of the owner
     * @param _animalWeight the weight of the animal
     * @param _animalColour the colour of the animal
     */
    public Dog(String _animalName, String _animalClass, int _animalAge, String _ownerName, float _animalWeight, String _animalColour){
        super  ( _animalName,  _animalClass, _animalAge, _ownerName, _animalWeight, _animalColour);
    }

    /**
     * Overrides the makeAnimalNoise method in Pet
     * Prints out bark
     */

    @Override
    public void makeAnimalNoise(){
        System.out.println("BARK");
    }

}
