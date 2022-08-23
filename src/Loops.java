public class Loops {
    public static void main(String[] args) {
        System.out.print("for: \n");
        for(int i = 0; i <= 5; i++) {
            System.out.print("i = " + i + '\n');
        }

        System.out.print("\nwhile: \n");
        int i = 0;
        while (i <= 5) {
            System.out.print("i = " + i + '\n');
            i++;
        }

        System.out.print("\ndo-while: \n");
        int j = 5;
        do {
            System.out.print("do() " + j + "\n");
            j--;
        } while (j >= 1);
    }
}
