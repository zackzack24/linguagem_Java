public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            double arredondarValorTotal = Math.round(valorParcela);
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " Valor " + arredondarValorTotal);           
            }

        }

    }

}
