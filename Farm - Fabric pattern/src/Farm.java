public class Farm {
    public static void main(String[] args) {

        AnimalFactory cowFactory = new CowFactory();
        Animal cow = cowFactory.createAnimal();
        cow.makeSound();

        AnimalFactory chickenFactory = new ChickenFactory();
        Animal chicken = chickenFactory.createAnimal();
        chicken.makeSound();
    }
}
