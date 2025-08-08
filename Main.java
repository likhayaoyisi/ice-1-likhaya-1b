public class Main {

    public static void main(String[] args) {

        int[][] myNumbers = { {20,50,10}, {80,25,15}, {60,100,15}, {40,75,45} };
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}