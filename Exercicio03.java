public class Exercicio03 {
    public static void executar() {
        int A = Prompt.lerInteiro("Digite o primeiro número: ");
        int B = Prompt.lerInteiro("Digite o segundo número: ");

        if (A > B) {
            System.out.println("O número " + A + " é maior que " + B + ".");
        }else if (A == B) {
            System.out.println("Sequência de números informados é inválida!");
        }else{
            System.out.println("O número " + B + " é maior que " + A + ".");
        }
    }
}
