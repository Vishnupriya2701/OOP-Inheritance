public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Vertebrates", "basic", 300);
        Dog dog = new Dog();
        doAnimalStuff(animal,"Medium");
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie,"fast");

        Dog retiever = new Dog("Labrador retriever", 65,"Floppy","Swimmer");
        doAnimalStuff(retiever,"slow");

        Fish goldie = new Fish("Goldfish",0.25,2,3);
        doAnimalStuff(goldie,"fast");

    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("*******");
    }

}