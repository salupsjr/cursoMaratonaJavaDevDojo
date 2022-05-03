package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 15;
        String categoria = "";
        if (idade <= 12){
            categoria = "Infantil";
        }else if (idade >= 13 && idade <= 17){
            categoria = "Juvenil";
        }else {
            categoria = "Adulto";
        }

        System.out.println(categoria);
    }
}
