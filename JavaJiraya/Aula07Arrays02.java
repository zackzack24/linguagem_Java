public class Aula07Arrays02 {

    public static void main(String[] args) {
        // System.out.println("int");
        // int[] idades = new int[3];
        // System.out.println(idades[0]);
        // System.out.println(idades[1]);
        // System.out.println(idades[2]);
        // System.out.println("char");
        // char[] idades1 = new char[3];
        // System.out.println(idades1[0]);
        // System.out.println(idades1[1]);
        // System.out.println(idades1[2]);
        // System.out.println("float");
        // float[] idades2 = new float[3];
        // System.out.println(idades2[0]);
        // System.out.println(idades2[1]);
        // System.out.println(idades2[2]);
        // System.out.println("string");
        // String[] idades3 = new String[3];
        // System.out.println(idades3[0]);
        // System.out.println(idades3[1]);
        // System.out.println(idades3[2]);


        String[] carros = new String [6];

        carros [0] = "Palio";
        carros [1] = "Gol";
        carros [2] = "Uno Deus Das Estradas";
        carros [3] = "Peugeot Bomba";
        carros [4] = "Citroen Lasanha";
        carros [5] = "Hillux Capotada";

        for (int posicaoDosCarros = 0; posicaoDosCarros < 6; posicaoDosCarros++) {
            System.out.println(carros[posicaoDosCarros]);
        } System.out.println("LINHA");
        for (int posicaoDosCarros = 0; posicaoDosCarros < carros.length; posicaoDosCarros++) {
            System.out.println(carros[posicaoDosCarros]);
        }
    } 
}
