import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i = num.nextInt();

        if (i > 500 && i < 1000) {
            System.out.print("if()");
        } else if (i == 69 || i == 96) {
            System.out.print("else if()");
        } else {
            System.out.print("else()");
        }

        System.out.print(" | ");

        switch (i) {
            case 1 -> {
                System.out.println("i = 1");
            }
            case 2 -> {
                System.out.print("i = 2");
            }
            case 3 -> {
                System.out.print("i = 3");
            }
            default -> {
                System.out.print("default()");
            }
        }
    }
}
