package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String fullName = "Salustiano Souza Pires Jr.";
        String cpf = "349.354.348-48";
        String end = "Rua Cajobi, 2 - Carapicuíba-SP";
        double salario = 10000.00;
        String relatorio = "Eu " + fullName + ", portador do CPF: "+cpf+", morador do endereço: "+end+".\nDeclaro que " +
                "recebi o salário no valor de R$"+salario+" da empresa em questão.";

        System.out.println(relatorio);

        System.out.println("\nEu " + fullName + ", portador do CPF: "+cpf+", morador do endereço: "+end+".\nDeclaro que " +
                "recebi o salário no valor de R$"+salario+" da empresa em questão.");
    }
}
