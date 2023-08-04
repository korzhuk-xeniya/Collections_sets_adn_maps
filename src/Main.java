import java.util.ArrayList;
import java.util.List;

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
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6));
        for (int number = 0; number < nums.size(); number++) {
            if (nums.get(number) % 2 == 0) {
                System.out.println(nums.get(number));
            }
        }
    }
    public static void task3() {
        System.out.println("Задание 3");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    }
    public static void task4() {
        System.out.println("Задание 4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
    }
}

