import java.util.Scanner;

public class InputUserData {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        // int i = num.nextInt();
        // int i = num.nextFloat();
        String str = num.nextLine();
        System.out.print("My variable is " + str);
    }
}
