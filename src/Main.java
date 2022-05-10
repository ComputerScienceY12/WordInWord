import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word1 = "";
        String word2 = "";
        Scanner scanner = new Scanner(System.in);

        while (word1.equals("")) {
            System.out.println("Enter word 1");
            String temp = scanner.nextLine();
            if (temp.indexOf(' ') == -1) word1 = temp.toLowerCase();
        }

        while (word2.equals("")) {
            System.out.println("Enter word 2");
            String temp = scanner.nextLine();
            if (temp.indexOf(' ') == -1) word2 = temp.toLowerCase();
        }

        String[] word1Letters = word1.split("");
        ArrayList<String> word2Letters = new ArrayList<>(Arrays.asList(word2.split("")));

        boolean failed = false;
        for (String letter : word1Letters)
            if (word2Letters.contains(letter)) word2Letters.remove(letter);
            else failed = true;

        if (failed) System.out.println("Failed");
        else System.out.println("Success");
    }
}