package inheritance.animals;

 class Tomcat extends Cat {

    private static final String GENDER = "Male";

    public Tomcat(String name, int age) {
        super();
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
