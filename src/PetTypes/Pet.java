package PetTypes;


/**
 * @class class Pet
 * Abstract class to represent a pet
 * Contains pet details and implements PetInterface
 */
public abstract class Pet implements PetInterface{

    private String animalName;
    private String animalClass;
    private int animalAge;
    private String animalColour;
    private float animalWeight;


    /**
     * Is a pet
     * @param _animalName the name of animal
     * @param _animalClass the class of the animal
     * @param _animalAge the age of the animal
     * @param _ownerName the name of the owner
     * @param _animalWeight the weight of the animal
     * @param _animalColour the colour of the animal
     */
    public Pet(String _animalName, String _animalClass, int _animalAge, String _ownerName, float _animalWeight, String _animalColour){
        animalName = _animalName;
        animalClass = _animalClass;
        animalAge = _animalAge;
        animalWeight = _animalWeight;
        animalColour = _animalColour;
    }

    /**
     * Method to be overridden to subsequent animals
     */
    public abstract void makeAnimalNoise();

    /**
     * @return String with the animals details
     * Part of the interface
     */
    public String returnDetailsString(){
        return "| Name : " + animalName + " | Class : " + animalClass + " | Age : " + animalAge + " | Colour : " + animalColour + " | Weight : " + animalWeight + " |";
    }

    /**
     * Increases the animals age by one
     */
    public void increaseAge(){
        animalAge++;
    }

    /**
     * @param _newAge Sets the animals age to the new age
     * Must be older than the old value and non-negative
     */

    public void setAnimalAge(int _newAge){
        if(_newAge > -1 && _newAge > animalAge){
            animalAge = _newAge;
        }
    }

    /**
     * @return Animal Name
     */
    public String getAnimalName(){
        return animalName;
    }

    /**
     * @return Animal Colour
     */
    public String getAnimalColour(){
        return animalColour;
    }

    /**
     * @return Animal Age
     */
    public int getAnimalAge(){
        return animalAge;
    }

    /**
     * @return Animal Weight
     */

    public float getAnimalWeight(){
        return animalWeight;
    }

    /**
     * @return Animal Class4
     */

    public String getAnimalClass(){
        return animalClass;
    }

}
