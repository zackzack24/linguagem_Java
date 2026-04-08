// import java.util.Arrays;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int [6][];

        arrayInt[0] = new int [2];
        arrayInt[1] = new int [4];
        arrayInt[2] = new int [6];
        arrayInt[3] = new int [8];
        arrayInt[4] = new int [10];
        arrayInt[5] = new int [12];

        for(int[] arrayBase: arrayInt) {
            System.out.println("\n------");
            for (int num: arrayBase) {
                System.out.print(num + "" );
            }
        }

        int [][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for(int[] arrayBase: arrayInt2) {
            System.out.println("\n------");
            for (int num: arrayBase) {
                System.out.print(num + "" );
            }
        }

    }
}
