package PetTypes.DogTypes;

import PetTypes.Dog;

public class Pomeranian extends Dog {

    public Pomeranian(String _animalName, String _animalClass, int _animalAge, String _ownerName, float _animalWeight, String _animalColour, String _breed){
        super  ( _animalName,  _animalClass, _animalAge, _ownerName, _animalWeight, _animalColour, _breed);
    }

    @Override
    public void makeAnimalNoise(){
        System.out.println("SMOL BARK");
    }

}
