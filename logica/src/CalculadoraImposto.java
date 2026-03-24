/*
* Classe que calcula a porcentagem de algum salário 
*/

public class CalculadoraImposto {
      public static void main(String[] args) {
            float salario = 2500.00F;
            float porcentagem = 30;
            float porcentagemSalario = salario * porcentagem / 100;
            System.out.println("O salário é  " + porcentagemSalario);
      }

}
