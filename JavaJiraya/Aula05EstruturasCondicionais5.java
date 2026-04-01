public class Aula05EstruturasCondicionais5 {
    public static void main(String[] args) {
        int dias = 5;

        switch (dias) {
            case 1:
                System.out.println("Domingo, final de semana.");
                break;
            case 2:
                System.out.println("Sábado, final de semana.");
                break;
            case 3:
                System.out.println("Segunda, dia útil");
                break;
            case 4:
                System.out.println("Terça, dia útil");
                break;
            case 5:
                System.out.println("Quarta, dia útil");
                break;
            case 6:
                System.out.println("Quinta, dia útil");
                break;
            case 7:
                System.out.println("Sexta, dia útil");
                break;
            default:
                System.out.println("O senhor deseja verificar alguma outra questão?");
                break;
        }

        byte dia = 6;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");

                break;

            default:
                break;
        }
    }
}
