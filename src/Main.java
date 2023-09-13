// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "swimmer");
        doAnimalStuff(retriever, "slow");
        }

        public static void doAnimalStuff(Animal animal, String speed ){
           animal.makeNoise();
           animal.move(speed);
            System.out.println(animal);
            System.out.println("_ _ _ _");
        }
    }
