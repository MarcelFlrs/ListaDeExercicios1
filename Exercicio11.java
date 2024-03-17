public class Exercicio11 {
    public static void executar() {
        int num1 = Prompt.lerInteiro("Digite o primeiro número: ");
        int num2 = Prompt.lerInteiro("Digite o segundo número: ");
        int num3 = Prompt.lerInteiro("Digite o terceiro número: ");    
        int vetor[] = {num1,num2,num3};
        boolean troca;

        do{
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i+1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    troca = true;
                }
            }
        }while(troca);
        System.out.printf("\nNúmeros digitados, ordenados de forma crescente: %d - %d - %d ",vetor[0],vetor[1],vetor[2]);

    }
}
