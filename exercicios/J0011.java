import javax.swing.JOptionPane;

public class J0011 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String cidade = JOptionPane.showInputDialog("Digite sua cidade:");
        String idade = JOptionPane.showInputDialog("Digite sua idade:");
        // int respostaIdade = 0;
        // String respostaCidade = null;
        // int respostaNascimento = 0;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(cidade);

        System.out.print("Olá, meu nome é " + nome + ", sou natural de " + cidade + " e tenho " + nome + "anos");
    }
}
