public class Exercicio14 {
    public static void executar() {
        int a1 = Prompt.lerInteiro("Digite o primeiro termo da PA: ");
        int n = Prompt.lerInteiro("Digite o n: ");
        int razao = Prompt.lerInteiro("Digite a razão: ");

        double an = a1 + (n - 1) * razao;

        System.out.println("O n-ésimo termo dessa progressão aritmética é: " + an);
    }
}
