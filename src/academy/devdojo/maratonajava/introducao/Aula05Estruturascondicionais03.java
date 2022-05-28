package academy.devdojo.maratonajava.introducao;

public class Aula05Estruturascondicionais03 {
    public static void main(String[] args) {
        // Operador ternário

        double salario = 16000;

        String result = salario > 10000 ? "Doação pode ser feita":"Doação não pode ser feita";

        System.out.println(result);

        // Op. ternário if else

        int idade = 38;

        String podeVotar = idade < 16 ? "Não poderá votar em 2022." : idade <= 17 || idade >= 85 ? "Voto opcional." : "FORA BOLSONARO!!!";

        System.out.println(podeVotar);


    }
}
