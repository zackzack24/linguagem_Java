public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        count = 0;
        do {
            System.out.println("While " + ++count);
        } while (count < 10);
        for (int i = 0; i < 11; i++) {
            System.out.println("For " + i);
        }



        }
    }
