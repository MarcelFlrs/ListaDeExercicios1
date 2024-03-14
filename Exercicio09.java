public class Exercicio09 {
    public static void executar() {
        int A = Prompt.lerInteiro("Digite o primeiro número: ");
        int B = Prompt.lerInteiro("Digite o segundo número: ");

        int maiorNum;
        if (A > B) {
             maiorNum = A;
        }else{
             maiorNum = B;
        }

        if (A == B) {
            System.out.println("Os números são iguais!");
        }else{
            System.out.println("Os números são diferentes, e o maior número é: " + maiorNum);
        }
        
    }
}
