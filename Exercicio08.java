public class Exercicio08 {
    public static void executar() {
        int numero = Prompt.lerInteiro("Digite um número: ");

        if (numero >= 50) {
            System.out.println("Este número é maior ou igual a 50");
        }else{
            System.out.println("Este número é menor do que 50");
        }
    }
}
