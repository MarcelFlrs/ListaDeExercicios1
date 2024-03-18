public class Exercicio17 {
    public static void executar() {
        double nota1 = Prompt.lerDecimal("Digite sua primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite sua segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite sua terceira nota: ");

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        double mediaP = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1 + peso2 + peso3);
        System.out.println("Média ponderada: " + mediaP);
    }
}
