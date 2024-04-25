package interfacesAndAbstraction.defineInterfacePerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Birthable> birthableList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String object = tokens[0];

            switch (object){
                case "interfacesAndAbstraction.defineInterfacePerson.Citizen":
                    //"interfacesAndAbstraction.defineInterfacePerson.Citizen {name} {age} {id} {birthdate}"
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthdate = tokens[4];

                    Citizen citizen = new Citizen(name, age, id, birthdate);
                    birthableList.add(citizen);
                    break;
                case "interfacesAndAbstraction.defineInterfacePerson.Pet":
                    //"interfacesAndAbstraction.defineInterfacePerson.Pet {name} {birthdate}"
                    name = tokens[1];
                    birthdate = tokens[2];

                    Pet pet = new Pet(name, birthdate);
                    birthableList.add(pet);
                    break;
            }


            input = scanner.nextLine();
        }

        String year = scanner.nextLine();
        birthableList.stream()
                .filter(birthable -> birthable.getBirthDate().endsWith(year))
                .forEach(birthable -> System.out.println(birthable.getBirthDate()));

    }
}
