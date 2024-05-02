package polymorphism.animals;

class Cat extends Animal {

     Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nMEEOW", getName(), getFavouriteFood());
    }
}
