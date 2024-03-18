public class Exercicio18 {
    public static void executar() {
        double nota1 = Prompt.lerDecimal("Digite sua primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite sua segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite sua terceira nota: ");

        double mediaH = 3 / ((1/nota1) + (1/nota2) + (1/nota3));
        System.out.println("Média Harmônica: " + mediaH);
    }
}
