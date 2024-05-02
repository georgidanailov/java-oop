package polymorphism.animals;

class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Oscar", "Whiskas");
        Animal dog = new Dog("Rocky", "polymorphism.wildFarm.Meat");
        System.out.println(cat.explainSelf());
        System.out.println(dog.explainSelf());
    }

}
