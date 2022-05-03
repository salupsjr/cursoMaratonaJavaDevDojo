package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // São 8 os tipos primitivos
        // int, double, float, short, long, boolean, byte, char

        int age = 18;
        int testCasting = (int) 10000000000L;
        double salarioDouble = 7000.00;
        float salarioFloat = 10000.00F;
        short ponto = 5;
        long anosAFrente = 100000000;
        boolean verdadeiro = true;
        boolean falso = false;
        byte numPqn = 127;
        char sexo = 'M';
        String nome = "JR"; // STRING NÃO É UM TIPO PRIMITIVO R SIM DE REFERENCIA

        System.out.println("A idade é " + age + " anos");
        System.out.println("Forcei um long virar int e o número é " + testCasting + ".");
        System.out.println("Um dia vou ter um salário de R$" + salarioDouble + "!!");
        System.out.println("Ou até um salário de R$" + salarioFloat + ".");
        System.out.println(ponto + " digitos será pouco para o que Deus tem pre mim! Eu creio!");
        System.out.println("Não desistirei! Nem daqui há " + anosAFrente + " de anos");
        System.out.println("Isso tudo é " + verdadeiro + ".");
        System.out.println("This is not " + falso + ".");
        System.out.println("Vou ter um patrimonio de no minimo " + numPqn + " Milhões!");
        System.out.println("Pq sou " + sexo + " mesmo! kkkkkkkk");
        System.out.println("Olá meu nome é "+ nome);







    }
}
