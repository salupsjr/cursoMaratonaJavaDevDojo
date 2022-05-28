package academy.devdojo.maratonajava.introducao;

public class Aula05Estruturascondicionais04 {
    public static void main(String[] args) {
        // EU QUERO SABER QUANTO DE IMPOSTO TEREI QUE PAGAR NA HOLANDA EM 22 BASEADO NO MEU SALARIO ANULA
        //Income	Tax rate (%)
        //Below €69,398	37.07%
        //Above €68,398	49.5%


        double salarioAnual = 1.000;//29.398;
        double salarioDeduzido;

        if (salarioAnual < 69.398){
            salarioDeduzido = salarioAnual*37.07/100;
            System.out.println("O imposto cobrado será de 37.07%. Você terá que pagar $" + salarioDeduzido);

        } else{
            salarioDeduzido = salarioAnual*49.5/100;
            System.out.println("O imposto cobrado será de 49.5%. Você terá que pagar $" + salarioDeduzido);
        }


    }
}
