package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores  aritméticos
        // +,-,*,/
        int num1 = 10;
        double num2 = 50;
        var result = num2/num1;
        System.out.println(result);

        // Operadores Relacionais
        // módulo = % = resto da divisão
        double resto  = 20 % 2;

        System.out.println("O resto da divisão(%) de 20 por 2 é igual a " + resto);

        // < menor, > maior, == igual, <= menor igual, >= maior igual, != Diferente
        boolean menorquedez = 9 < 10;
        boolean maiorquedez = 20 > 10;
        boolean dezigualadez = 10 == 10;
        boolean menorigualadez = 10 <= 10;
        boolean menorigualadez2 = 15 <= 10;
        boolean maiorigualadez = 10 >= 10;
        boolean maiorigualadez2 = 210 >= 10;
        boolean diferentedez = 7 != 10;
        System.out.println("9 < 10? "+ menorquedez);
        System.out.println("20 > 10? "+ maiorquedez);
        System.out.println("10 é igual(==) a 10? "+ dezigualadez);
        System.out.println("10 <= 10? "+menorigualadez);
        System.out.println("15 <= 10? "+ menorigualadez2);
        System.out.println("10 >= 10? "+ maiorigualadez);
        System.out.println("210 >= 10? "+ maiorigualadez2);
        System.out.println("7 é diferente(!=) de 10" + diferentedez);

        // Operadores lógicos
        // AND(E) = &&, OR(OU) = ||, NOT(NEGAÇÃO/NÃO) = !

        int idade = 21;
        double salario = 2000;

        boolean aumentoSalario = idade > 18 && salario < 3000;

        System.out.println(aumentoSalario);

        double valorContaCorrente = 500.01;
        double valorContaPoupanca = 50000.01;
        double valorPlay5 = 5000.01;

        boolean podeComprarPlay5 = valorContaCorrente > valorPlay5 || valorContaPoupanca > valorPlay5;

        System.out.println("O que você tem em conta pode comprar um Play 5? Resposta: " + podeComprarPlay5);

        //Operadores de incremento
        // ++, --

        int contador = 0;
        contador++; // contador = contador + 1
        System.out.println("Contador iniciado em 0 com o incremento ++ passa a valer: " + contador);
        contador += 5;
        System.out.println("Adicionei 5 ao contador assim: contador += 5, agora o contador vale: " + contador);
        contador -= 1;
        System.out.println("Tirei 1 do contador assim: contador -= 1, agora o contador vale: " + contador);
        contador--;
        System.out.println("Tirei 1 do contador com o decremento assim: contador--, agora o contador vale: " + contador);


    }
}
