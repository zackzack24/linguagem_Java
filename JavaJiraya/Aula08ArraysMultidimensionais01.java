// import java.util.Arrays;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // int[] dias = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
        // 19, 20, 21, 22, 23, 24, 25, 26,
        // 27, 28, 29, 30 };
        // String[] meses = {"Janeiro", "Fevereiro", "Março", "Abrilo", "Maio", "Junho",
        // "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        // int [][] mesesEDias = new int[1][30];

        // System.out.println(Arrays.toString(dias));
        // System.out.println(Arrays.toString(meses));
        // System.out.println(Arrays.toString(mesesEDias));

        // Object[][] numeroMes = new Object[11][13];
        // numeroMes[0][0] = "Janeiro";
        // numeroMes[0][1] = 1;
        // System.out.println(numeroMes[0][0] + " é o mês " + numeroMes[0][1]);
        // numeroMes[0][1] = "Fevereiro";
        // numeroMes[0][2] = 2;
        // System.out.println(numeroMes[0][1] + " é o mês " + numeroMes[0][2]);
        // numeroMes[0][2] = "Março";
        // numeroMes[0][3] = 3;
        // System.out.println(numeroMes[0][2] + " é o mês " + numeroMes[0][3]);
        // numeroMes[0][3] = "Abril";
        // numeroMes[0][4] = 4;
        // System.out.println(numeroMes[0][3] + " é o mês " + numeroMes[0][4]);
        // numeroMes[0][4] = "Maio";
        // numeroMes[0][5] = 5;
        // System.out.println(numeroMes[0][4] + " é o mês " + numeroMes[0][5]);
        // numeroMes[0][5] = "Junho";
        // numeroMes[0][6] = 6;
        // System.out.println(numeroMes[0][5] + " é o mês " + numeroMes[0][6]);
        // numeroMes[0][6] = "Julho";
        // numeroMes[0][7] = 7;
        // System.out.println(numeroMes[0][6] + " é o mês " + numeroMes[0][7]);
        // numeroMes[0][7] = "Agosto";
        // numeroMes[0][8] = 8;
        // System.out.println(numeroMes[0][7] + " é o mês " + numeroMes[0][8]);
        // numeroMes[0][8] = "Setembro";
        // numeroMes[0][9] = 9;
        // System.out.println(numeroMes[0][8] + " é o mês " + numeroMes[0][9]);
        // numeroMes[0][9] = "Outubro";
        // numeroMes[0][10] = 10;
        // System.out.println(numeroMes[0][9] + " é o mês " + numeroMes[0][10]);
        // numeroMes[0][10] = "Novembro";
        // numeroMes[0][11] = 11;
        // System.out.println(numeroMes[0][10] + " é o mês " + numeroMes[0][11]);
        // numeroMes[0][11] = "Dezembro";
        // numeroMes[0][12] = 12;
        // System.out.println(numeroMes[0][11] + " é o mês " + numeroMes[0][12]);

        System.out.println("-----------TESTE--------------");


        int [][] numeroMes2 = new int[11][13];
        numeroMes2[0][0] = 1;
        numeroMes2[0][1] = 1;
        System.out.println(numeroMes2[0][0] + " é o mês " + numeroMes2[0][1]);
        numeroMes2[0][1] = 2;
        numeroMes2[0][2] = 2;
        System.out.println(numeroMes2[0][1] + " é o mês " + numeroMes2[0][2]);
        numeroMes2[0][2] = 3;
        numeroMes2[0][3] = 3;
        System.out.println(numeroMes2[0][2] + " é o mês " + numeroMes2[0][3]);
        numeroMes2[0][3] = 4;
        numeroMes2[0][4] = 4;
        System.out.println(numeroMes2[0][3] + " é o mês " + numeroMes2[0][4]);
        numeroMes2[0][4] = 5;
        numeroMes2[0][5] = 5;
        System.out.println(numeroMes2[0][4] + " é o mês " + numeroMes2[0][5]);
        numeroMes2[0][5] = 6;
        numeroMes2[0][6] = 6;
        System.out.println(numeroMes2[0][5] + " é o mês " + numeroMes2[0][6]);
        numeroMes2[0][6] = 7;
        numeroMes2[0][7] = 7;
        System.out.println(numeroMes2[0][6] + " é o mês " + numeroMes2[0][7]);
        numeroMes2[0][7] = 8;
        numeroMes2[0][8] = 8;
        System.out.println(numeroMes2[0][7] + " é o mês " + numeroMes2[0][8]);
        numeroMes2[0][8] = 9;
        numeroMes2[0][9] = 9;
        System.out.println(numeroMes2[0][8] + " é o mês " + numeroMes2[0][9]);
        numeroMes2[0][9] = 10;
        numeroMes2[0][10] = 10;
        System.out.println(numeroMes2[0][9] + " é o mês " + numeroMes2[0][10]);
        numeroMes2[0][10] = 11;
        numeroMes2[0][11] = 11;
        System.out.println(numeroMes2[0][10] + " é o mês " + numeroMes2[0][11]);
        numeroMes2[0][11] = 12;
        numeroMes2[0][12] = 12;
        System.out.println(numeroMes2[0][11] + " é o mês " + numeroMes2[0][12]);

        System.err.println("LINHA");

        for (int i = 0; i < numeroMes2.length; i++) {
            for (int j = 0; j < numeroMes2[i].length; j++) {
                System.out.println(numeroMes2[i][j]);
            }
        }

        System.out.println("LINHA");

        for (int[] arrBase : numeroMes2) {
            for (Object num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
