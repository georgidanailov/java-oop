package interfacesAndAbstraction.defineInterfacePerson;

public class Citizen implements Person, Identifiable, Birthable {

    String name;
    int age;
    String Id;
    String birthDate;


    public Citizen(String name, int age, String Id, String birthDate) {
        this.name = name;
        this.age = age;
        this.Id = Id;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getId() {
        return this.Id;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

}
