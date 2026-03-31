public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 19;
        boolean deMaior = idade >= 18;
        boolean deMenor = idade <= 18;

        if (deMaior) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }
        if (deMenor) {
            System.out.println("Você é menor de idade");
        } else {
            System.out.println("Você é maior de idade ");
        }
    }
}
