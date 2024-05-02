package inheritance.animals;

class Cat extends animals.Animal {
    public Cat(String name, int age, String gender) {
        super();
    }

    public Cat() {

    }

    @Override
    public String produceSound() {
        return "Meow meow";
    }
}
