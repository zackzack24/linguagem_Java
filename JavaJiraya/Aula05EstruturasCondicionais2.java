public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {
        int idade = 7;
        String categoria;

        if (idade < 15) {
            categoria ="Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria adulto";
        System.out.println(categoria);
    }
}
