package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado.
        //  Condição valor parcela >= 1000

        double carValue = 30000d;
        int numberOfInstallments = 1;

        /*while (carValue / numberOfInstallments >= 1000){
            double valueOfInstallments = carValue / numberOfInstallments;
            System.out.println("Quantidade de parcelas: " + numberOfInstallments + " Valor parcela: " +
                    "" + valueOfInstallments);
            if (valueOfInstallments < 1000) {
                break;
            }
            numberOfInstallments++;
        }*/

        for (int parcela = 1; parcela < carValue; parcela++) {
            double valueOfInstallments = carValue / parcela;
            if (valueOfInstallments < 1000) {
                break;
            }
            System.out.println("Quantidade de parcelas: " + parcela + " Valor parcela: " +
                    "" + valueOfInstallments);
        }
    }
}
