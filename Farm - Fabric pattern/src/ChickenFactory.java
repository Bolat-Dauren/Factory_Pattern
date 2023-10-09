class ChickenFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Chicken();
    }
}