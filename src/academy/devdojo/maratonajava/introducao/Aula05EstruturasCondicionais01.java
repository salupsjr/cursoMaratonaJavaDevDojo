package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;

        if (idade >= 18){
            System.out.println("Maior de idade pode comprar bebida alcólica.");
        }

        boolean isMaiorDeIdade = idade >= 18;

        if (isMaiorDeIdade){
            System.out.println("Maior de idade pode comprar bebida alcólica.");
        }

        if (!isMaiorDeIdade){
            System.out.println("Menor de idade não pode comprar bebida alcólica.");
        }
    }
}
