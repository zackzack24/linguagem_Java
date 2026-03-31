public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        double salario = 3500;
        // String mensagemDeDoacao = "Doação de 500 reais concluída!";
        // String mensagemDeNaoDoacao = "Não poderei Doar!";
        String resultado = salario > 5000 ? "Doação de 500 reais concluída!" : "Não poderei Doar!";

        // if(salario >= 5000) {
        // resultado = mensagemDeDoacao;
        // } else {
        // resultado = mensagemDeNaoDoacao;
        // }
        System.out.println(resultado);
    }

}
