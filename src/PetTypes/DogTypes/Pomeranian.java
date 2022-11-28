package PetTypes.DogTypes;

import PetTypes.Dog;

public class Pomeranian extends Dog {

    private String breed;

    public Pomeranian(String _animalName, String _animalClass, int _animalAge, String _ownerName, float _animalWeight, String _animalColour, String _breed){
        super  ( _animalName,  _animalClass, _animalAge, _ownerName, _animalWeight, _animalColour);
        breed = _breed;
    }

    @Override
    public void makeAnimalNoise(){
        System.out.println("SMOL BARK");
    }

    public String getBreed(){
        return breed;
    }

}
