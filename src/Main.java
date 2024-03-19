import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> combinedList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введите 5 строк: ");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }
        System.out.println("Список А");
        for (String str : listA) {
            System.out.println(str);
        }

        System.out.println("Введите 5 строк: ");
        for (int i = 0; i < 5; i++) {
            String input = scanner1.nextLine();
            listB.add(input);
        }
        System.out.println("Список B");
        for (String str : listB) {
            System.out.println(str);
        }

        for (int i = 0; i < 5; i++) {
            combinedList.add(listA.get(i));
            combinedList.add(listB.get(4 - i));
        }

        Collections.sort(combinedList, Comparator.comparingInt(String::length));

        System.out.println("Список C");
        for (String str : combinedList) {
            System.out.println(str);
        }
    }
}