package abstraction.trafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"GREEN RED YELLOW"
        Color[] colors = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Color::valueOf).toArray(Color[]::new);

        int n = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLightList = new ArrayList<>();
        for(Color color : colors) {
            //new traffic light, which is currently in this color
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLightList.add(trafficLight);
        }
        //List of Traffic Lights

        for (int i = 1; i <= n; i++) {
            //change the color of every traffic light
            for (TrafficLight trafficlight : trafficLightList) {
                trafficlight.changeColor();
                System.out.print(trafficlight.getColor() + " ");
            }
            System.out.println();
        }
    }
}
