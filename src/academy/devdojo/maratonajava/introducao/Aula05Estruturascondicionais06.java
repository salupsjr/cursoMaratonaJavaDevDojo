package academy.devdojo.maratonajava.introducao;

public class Aula05Estruturascondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // considere 1 como domingo

        int diaDaSemana = 5;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Hoje é Domingo, não é dia útil.");
                break;
            case 2:
                System.out.println("Hoje é Segunda, é dia útil.");
                break;
            case 3:
                System.out.println("Hoje é Terça, é dia útil.");
                break;
            case 4:
                System.out.println("Hoje é Quarta, é dia útil.");
                break;
            case 5:
                System.out.println("Hoje é Quinta, é dia útil.");
                break;
            case 6:
                System.out.println("Hoje é Sexta, é dia útil.");
                break;
            case 7:
                System.out.println("Hoje é Sabado, não é dia útil.");
                break;
            default:
                System.out.println("Digite um dia válido.");
                break;

        }
    }
}
