package abstraction.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final String GOLD = "Gold";
    private static final String GEM = "Gem";
    private static final String CASH = "Cash";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] items = scanner.nextLine().split("\\s+");
        LinkedHashMap<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();

        for (int i = 0; i < items.length; i += 2) {
            String name = items[i];
            long count = Long.parseLong(items[i + 1]);

            String itemCategory = categorizeItem(name);

            if (itemCategory.isEmpty() || exceedsBagCapacity(bag, bagCapacity, count)) {
                continue;
            }
            switch (itemCategory) {
                case GEM:
                case CASH:
                    if (!isValidToAdd(bag, itemCategory, count)) {
                        continue;
                    }
                    break;
            }

            addToBag(bag, name, itemCategory, count);
        }

        printBagContents(bag);
    }

    private static String categorizeItem(String name) {
        if (name.length() == 3) {
            return CASH;
        } else if (name.toLowerCase().endsWith("gem")) {
            return GEM;
        } else if (name.equalsIgnoreCase("gold")) {
            return GOLD;
        }
        return "";
    }

    private static boolean exceedsBagCapacity(Map<String, LinkedHashMap<String, Long>> bag, long capacity, long count) {
        return capacity < bag.values().stream().map(Map::values)
                .flatMap(Collection::stream).mapToLong(e -> e).sum() + count;
    }

    private static boolean isValidToAdd(Map<String, LinkedHashMap<String, Long>> bag, String itemType, long count) {
        if (!bag.containsKey(itemType)) {
            return bag.containsKey(GOLD) && count <= sumValuesOfItemType(bag, GOLD);
        } else {
            if(itemType.equals(GEM)) {
                return sumValuesOfItemType(bag, GEM) + count <= sumValuesOfItemType(bag, GOLD);
            }else {
                return sumValuesOfItemType(bag, CASH) + count <= sumValuesOfItemType(bag, GEM);
            }
        }
    }

    private static long sumValuesOfItemType(Map<String, LinkedHashMap<String, Long>> bag, String itemType) {
        return bag.get(itemType).values().stream().mapToLong(Long::longValue).sum();
    }

    private static void addToBag(Map<String, LinkedHashMap<String, Long>> bag, String name, String itemType, long count) {
        bag.putIfAbsent(itemType, new LinkedHashMap<>());
        bag.get(itemType).put(name, bag.get(itemType).getOrDefault(name, 0L) + count);
    }

    private static void printBagContents(Map<String, LinkedHashMap<String, Long>> bag){
        for (var entry : bag.entrySet()) {
            Long sumValues = sumValuesOfItemType(bag, entry.getKey());
            System.out.println(String.format("<%s> $%s", entry.getKey(), sumValues));
            entry.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
        }
    }
}