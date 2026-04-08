public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        int[] numeros2 = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }
        for (int num : numeros2) {
            System.out.println(num);
        }
        for (int num : numeros) {
            System.out.println(num);
        }

        String [] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Ichigo";
        nomes[2] = "Sukuna";

        for (int nomesAnime = 0; nomesAnime < nomes.length; nomesAnime++) {
            System.out.println(nomes[0] + nomes[1] + nomes[2]);
            System.out.println(nomes[1]);
            System.out.println(nomes[2]);
        }
    }
}
