public class Exercicio18 {
    public static void executar() {
        double nota1 = Prompt.lerDecimal("Digite sua primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite sua segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite sua terceira nota: ");

        double media = (nota1 + nota2 + nota3)/ 3;
        System.out.println("Média: " + media);
    }
}
