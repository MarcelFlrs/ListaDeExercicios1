public class Exercicio05 {
    public static void executar() {
        int A = Prompt.lerInteiro("Digite o primeiro número: ");
        int B = Prompt.lerInteiro("Digite o segundo número: ");

        System.out.printf("Valor original das variáveis: A = %d e B = %d" , A , B);

        int aux = A;
        A = B;
        B = aux;

        System.out.printf("\nValor trocado: A = %d e B = %d" , A , B);
    }
}
