package PetTypes;


/**
 * @class Pet
 * Abstract class to represent a pet
 * Contains pet details and implements PetInterface
 */
public abstract class Pet implements PetInterface{

    protected String animalName;
    protected String animalClass;
    protected int animalAge;
    protected String animalColour;
    protected float animalWeight;


    /**
     * Pet Constructor
     * Takes the details of the pet
     * @param _animalName
     * @param _animalClass
     * @param _animalAge
     * @param _ownerName
     * @param _animalWeight
     * @param _animalColour
     */
    public Pet(String _animalName, String _animalClass, int _animalAge, String _ownerName, float _animalWeight, String _animalColour){
        animalName = _animalName;
        animalClass = _animalClass;
        animalAge = _animalAge;
        animalWeight = _animalWeight;
        animalColour = _animalColour;
    }

    /**
     * Method to be overridded to subsequent animals
     */
    public void makeAnimalNoise(){}

    /**
     * @return String with the animals details
     * Part of the interface
     */
    public String returnDetailsString(){
        return "| Name : " + animalName + " | Class : " + animalClass + " | Age : " + animalAge + " | Colour : " + animalColour + " | Weight : " + animalWeight + " |";
    }

    /**
     * @param _newAge Sets the animals age to the new age
     * Must be older than the old value and non negative
     */
    public void setAnimalAge(int _newAge){
        if(_newAge > -1 && _newAge > animalAge){
            animalAge = _newAge;
        }
    }

}
