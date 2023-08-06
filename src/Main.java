import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Коллекции");
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 7));
        for (int number = 0; number < nums.size(); number++) {
            if (nums.get(number) % 2 == 1) {
                System.out.println(nums.get(number));
            }
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 10, 2, 3, 4, 4, 5, 5, 6));
        List<Integer> numbers = new ArrayList<>();
        for (int number = 0; number < nums.size(); number++) {
            if (nums.get(number) % 2 == 0) {
                for (int i = 0; i < nums.size(); i++) {
                    if (!numbers.contains(nums.get(number))) {
                        numbers.add(nums.get(number));
                    }
                }
            }
        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }

    public static void task3() {
        System.out.println("Задание 3");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        List<String> words = new ArrayList<>();
        for (int number = 0; number < strings.size(); number++) {
            for (int word = 0; word < strings.size(); word++) {
                if (!words.contains(strings.get(number))) {
                    words.add(strings.get(number));
                }
            }
        }
        System.out.println(words);
    }

    public static void task4() {
        System.out.println("Задание 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> numbersMap = new HashMap<>();
        Integer counter = 1;
        for (int number = 0; number < strings.size(); number++) {
            for (int word = 0; word < strings.size(); word++) {
                if (!numbersMap.containsKey(strings.get(number))) {
                    numbersMap.put(strings.get(number), counter++);
                }
            }
        }
        System.out.println(numbersMap);
    }
}

