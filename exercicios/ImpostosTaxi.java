public class ImpostosTaxi {
    public static void main(String[] args) {
        double salario = 50000;
        double imposto1 = 10 / 100;
        double imposto2 = 20 / 100;
        double imposto3 = 30 / 100;
        String pessoa = "Felipe";
        float idade = 19;
        double calculoImposto1;
        double calculoImposto2;
        double calculoImposto3;

        String testandoSalario1 = salario > 5000 && idade >= 18 ? "Doarei " + imposto1 : "Não doarei";
        String testandoSalario2 = salario > 10000 && idade >= 18 ? "Doarei " + imposto2 : "Não doarei";
        String testandoSalario3 = salario > 15000 && idade >= 18 ? "Doarei " + imposto3 : "Não doarei";

        // System.out.println(testandoSalario1);

        if (salario >= 5000 && pessoa == "Felipe") {
            System.out.println(testandoSalario1);
        } else {
            System.out.println("Sem Imposto");
        }

        if (salario > 10000 && pessoa == "Felipe") {
            System.out.println(testandoSalario2);
        } else {
            System.out.println("Sem Imposto");
        }

        if (salario > 15000 && pessoa == "Felipe") {
            System.out.println(testandoSalario3);
        } else {
            System.out.println("Sem Imposto");
        }

        System.out.println("LINHA");

        if (salario >= 5000) {
            calculoImposto1 = imposto1 * salario;
            System.out.println("Doarei " + imposto1);
            System.out.println(calculoImposto1);
        } else if (salario >= 5000 && salario <= 10000) {
            calculoImposto2 = imposto2 * salario;
            System.out.println(calculoImposto2);
            System.out.println("Doarei " + imposto2);
        } else if (salario >= 10000 && salario >= 15000) {
            calculoImposto3 = imposto3 * salario;
            System.out.println(calculoImposto3);
            System.out.println("Doarei " + imposto3);
        }

    }
}
