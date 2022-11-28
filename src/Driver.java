import PetTypes.Crocodile;
import PetTypes.Dog;
import PetTypes.Pet;
import java.util.LinkedList;

public class Driver {

    public static void main(String[] args) {

        // Static means it's not part of an object
        // Main method for pet shop

        // Array list of pets
        LinkedList<Pet> pets = new LinkedList<>();

        // Crocodile Object
        Crocodile timmy = new Crocodile("Timmy", "Reptile", 27, "Sam", 280f, "Black");

        // Adds timmy using polymorphism to the arraylist

        pets.add(timmy);

        // Crocodile Object

        Dog sam = new Dog("Sam", "Mammal", 8, "Dominick", 27.90f, "White");

        // See if the age can be set

        sam.setAnimalAge(9);

        // Adds sam using polymorphism to the arraylist

        pets.add(sam);

        // Loops through the pets and displays the details and makes each animal's specific noise

        for (Pet pet: pets) {
            System.out.println(pet.returnDetailsString());
            pet.makeAnimalNoise();
        }


    }


}
