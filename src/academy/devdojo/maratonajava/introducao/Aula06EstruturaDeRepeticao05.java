package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado.
        //  Condição valor parcela >= 1000

        double carValue = 30000d;

        for (int parcela = (int) carValue; parcela >= 1; parcela--) {
            double valueOfInstallments = carValue / parcela;
            if (valueOfInstallments < 1000) {
                continue;
            }
            System.out.println("Quantidade de parcelas: " + parcela + " Valor parcela: " +
                    "" + valueOfInstallments);
        }
    }
}
