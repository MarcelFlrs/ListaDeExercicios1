
public class Exercicio01 {
    
    public static void executar() {
        int numero = Prompt.lerInteiro( "Digite um número: ");
        if ( numero <= 10) {
            System.out.println("Número menor ou igual a 10!");
        }else {
            System.out.println("Número maior do que 10!");
        }

    }
}
