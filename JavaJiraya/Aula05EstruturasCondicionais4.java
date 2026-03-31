public class Aula05EstruturasCondicionais4 {
    public static void main(String[] args) {
        int diasDaSemana = 2;
        switch (diasDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

        String sexo = "F";
        switch (sexo) {
            case "M":
                System.out.println("Homem");
                break;
            case "F":
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

        String ambição = "Sim";
        switch (ambição) {
            case "Sim":
                System.out.println("Você será bem sucedido e sua família terá orgulho de você");
                break;
            case "Não":
                System.out.println("Você não merece estar entre nós.");
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
