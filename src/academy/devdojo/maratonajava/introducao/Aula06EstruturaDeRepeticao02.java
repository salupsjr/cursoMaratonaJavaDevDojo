package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        int quantos = 0;
        for (int count = 1; count < 1000001; count++){
            if (count % 2 == 0){
                System.out.println(count);
                quantos += 1;
            }
        }
        System.out.println("No total são: " + quantos + " números pares.");
    }
}
