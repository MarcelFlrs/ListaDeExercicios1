public class Exercicio04 {
    public static void executar() {
        int num1 = Prompt.lerInteiro("Digite o primeiro número: ");
        int num2 = Prompt.lerInteiro("Digite o segundo número: ");

        System.out.println("Soma = " + (num1 + num2));
        System.out.println("Subtração = " + (num1 - num2));
        System.out.println("Multiplicação = " + (num1 * num2));
        System.out.println("Divisão = " + (num1 / num2));
    }
}
