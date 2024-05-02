package inheritance.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while (!"Beast!".equals(line)){

            try {
                switch (line) {
                    case "polymorphism.animals.Dog":
                        String[] tokens = scanner.nextLine().split("\\s+");
                        animals.Dog dog = new animals.Dog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(dog);
                        break;
                    case "polymorphism.animals.polymorphism.wildFarm.Cat":
                        tokens = scanner.nextLine().split("\\s+");
                        inheritance.animals.Cat cat = new inheritance.animals.Cat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(cat);
                        break;
                    case "Frog":
                        tokens = scanner.nextLine().split("\\s+");
                        animals.Frog frog = new animals.Frog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(frog);
                        break;
                    case "Kitten":
                        tokens = scanner.nextLine().split("\\s+");
                        inheritance.animals.Kitten kitten = new inheritance.animals.Kitten(tokens[0], Integer.parseInt(tokens[1]));
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        tokens = scanner.nextLine().split("\\s+");
                        inheritance.animals.Tomcat tomcat = new inheritance.animals.Tomcat(tokens[0], Integer.parseInt(tokens[1]));
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }

            line = scanner.nextLine();
        }
    }
}
