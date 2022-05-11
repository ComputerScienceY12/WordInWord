import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word 1");
        String[] word1Letters = scanner.nextLine().toLowerCase().split("");
        System.out.println("Enter word 2");
        ArrayList<String> word2Letters = new ArrayList<>(Arrays.asList(scanner.nextLine().toLowerCase().split("")));

        boolean failed = false;
        for (String letter : word1Letters) if (word2Letters.contains(letter)) word2Letters.remove(letter); else failed = true;

        System.out.println(failed ? "Failed" : "Success");
    }
}