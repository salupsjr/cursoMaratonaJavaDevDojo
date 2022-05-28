package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Valores default(padrões) de cada tipo de array
        // int = 0, float = 0.0, long =, double =, short =
        // boolean = false
        // byte =
        // char = ' '

        System.out.println("Valores default(padrões) de cada tipo de array. \n");

        int [] idades = new int[1];

        System.out.println("Int = " + idades[0]);
        System.out.println("\n");

        float [] salarios = new float[1];

        System.out.println("Float = " + salarios[0] );
        System.out.println("\n");

        long [] publico = new long[1];

        System.out.println("Long = " + publico[0]);
        System.out.println("\n");

        double [] preco = new double[1];

        System.out.println("Double = " + preco[0]);
        System.out.println("\n");

        short [] ponto = new short[1];

        System.out.println("Short = " + ponto[0]);
        System.out.println("\n");

        boolean [] isNight = new boolean[1];

        System.out.println("Boolean = " + isNight[0] );
        System.out.println("\n");

        char [] sexo = new char[1];

        System.out.println("Char = " + sexo[0] );
        System.out.println("\n");

        String [] frase = new String[1];

        System.out.println("String = " + frase[0]);
        System.out.println("\n");
    }
}
