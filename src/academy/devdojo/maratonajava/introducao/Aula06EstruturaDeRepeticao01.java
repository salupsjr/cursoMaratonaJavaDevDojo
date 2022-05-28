package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while; do-while; for
        int count = -1;
        while (count < 10){
            System.out.println("count com while é " + ++count);
        }

        System.out.println("\n");
        count = 0;
        do {
            System.out.println("Count com do-while está valendo " + count);
            count++;
        }while (count < 11);

        System.out.println("\n");
        for (int c = 0; c < 11; c++){
            System.out.println("O contador com o for está valendo " + c);
        }

    }
}
