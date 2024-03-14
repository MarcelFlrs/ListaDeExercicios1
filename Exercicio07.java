public class Exercicio07 {
    public static void executar() {
        int numero = Prompt.lerInteiro("Digite um número: ");

        if (numero > 100 && numero < 200) {
            System.out.println("O número " + numero + " está no intervalo entre 100 e 200.");
        }else{
            System.out.println("O número " + numero +" está fora do intervalo de 100 a 200.");
        }
    }
}
