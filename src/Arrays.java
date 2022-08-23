public class Arrays {
    public static void main(String[] args) {
        int[] arr_1 = new int[3];
        for (int i = 0; i < arr_1.length; i++) {
            arr_1[i] = i + 1;
        }
        System.out.print("arr_1: " + java.util.Arrays.toString(arr_1) + "\n");

        int[] arr_2 = new int[]{247, 747, 427};
        System.out.print("arr_2: " + java.util.Arrays.toString(arr_2) + "\n");

        int[][] double_arr_1 = new int[3][2];
        System.out.print("double_arr_1: " + java.util.Arrays.deepToString(double_arr_1) + "\n");

        int[][] double_arr_2 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int i = 0; i < double_arr_2.length; i++) {
            for (int j = 0; j < double_arr_2[0].length; j++) {
                System.out.println(double_arr_2[i][j]);
            }
        }

        System.out.print("double_arr_2: " + java.util.Arrays.deepToString(double_arr_2) + "\n");
    }
}
