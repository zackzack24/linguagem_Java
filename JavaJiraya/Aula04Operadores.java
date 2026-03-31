public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 1000;
        int numero02 = 5550;
        int somaN01N02 = numero01 + numero02;
        System.out.println(" Concatenar " + numero01 + numero02);
        System.out.println(" Somar " + somaN01N02);
        System.out.println(" Seu décimo terceiro é " + numero01 + " eu salário é " + numero02);

        int porcentagemDecimoTerceiro = numero02 * 10 / 100;

        System.out.println(" Seu décimo terceiro equivale a " + porcentagemDecimoTerceiro);

        int salarioMinimo = 1500;
        if (porcentagemDecimoTerceiro >= salarioMinimo) {
            System.out.println("O seu décimo terceiro é maior que um salário mínimo (" + salarioMinimo + ")");
        } else {
            System.out.println("O seu décimo terceiro é menor que um salário mínimo(" + salarioMinimo + ")");
        }
        ;

        boolean decimoTerceiroMenorQueSalarioMin = numero02 > salarioMinimo;
        boolean decimoTerceiroMaiorQueSalarioMin = salarioMinimo > numero02;

        System.out.println(decimoTerceiroMaiorQueSalarioMin);
        System.out.println(decimoTerceiroMenorQueSalarioMin);
    }
}

/*
 * 30 anos - 4612
 * idade > 30 - 3381
 * Graduados de Qualquer Idade - 2423
 */
class SalarioMinimoDespatriadosHolanda {

    public static void main(String[] args) {
        String sujeito = "Felipe";
        int idadeFelipe = 33;
        boolean felipeGraduado = false;
        int salarioNormal = 1600;
        int salarioTrintaAnos = 4612;
        int salarioMenosDeTrintaAnos = 3381;
        int salarioGraduado = 2423;

        if (idadeFelipe >= 30) {
            System.out.println("Olá " + sujeito + " você receberá " + salarioTrintaAnos + " Euros");
        } else {
            System.out.println("Olá " + sujeito + " você receberá " + salarioMenosDeTrintaAnos + " Euros");
        }
        if (felipeGraduado == true) {
            System.out.println("Você tem graduação e receberá " + salarioGraduado + " Euros");
        } else {
            System.out.println("Você não tem graduação e receberá " + salarioNormal + " Euros");
        }
    }
}

class PossoComprarUmPS5 {
    public static void main(String[] args) {
        float valorPS5 = 5000;
        double saldo = 5000;
        double saldoGuardado = 111720;
        valorPS5 += 7000;

        System.out.println(valorPS5);
        boolean vouComprarMeuPS5 = saldo > valorPS5 || saldoGuardado > valorPS5;
        boolean naoVouComprarMeuPS5 = valorPS5 > saldo;

        if (saldo > valorPS5) {
            System.out.println("Você pode comprar o seu Playstation 5");
        } else {
            System.out.println("Você não pode comprar um Playstation 5");
        }

        if (vouComprarMeuPS5) {
            System.out.println("Você pode comprar o seu Playstation 5");
        } else {
            System.out.println("Você não pode comprar um Playstation 5");
        }

        if (naoVouComprarMeuPS5) {
            System.out.println("Você não pode comprar um Playstation 5");
        }

        if (saldoGuardado >= valorPS5) {
            System.out.println("Você pode comprar o seu Playstation 5");
        } else {
            System.out.println("Você não pode comprar um Playstation 5");
        }
 
    }
}