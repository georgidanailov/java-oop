package animals;

public class Dog extends animals.Animal {
    public Dog(String name, int age, String gender) {
        super();
    }

    @Override
    public String produceSound() {
        return "Woof!";
    }
}
