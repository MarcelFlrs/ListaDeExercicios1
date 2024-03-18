public class Exercicio15 {
    public static void executar() {
        double P1[]={Prompt.lerDecimal("Digite o valor x1 do Ponto 1: "), Prompt.lerDecimal("Digite o valor y1 do Ponto 1: ")};
        double P2[]={Prompt.lerDecimal("Digite o valor x2 do Ponto 2: "), Prompt.lerDecimal("Digite o valor y2 do Ponto 2: ")};

        for (int i = 0; i < P1.length; i++) {
            System.out.println(P1[i]);
        }
        for (int i = 0; i < P2.length; i++) {
            System.out.println(P2[i]);
        }
        
        double d = Math.pow(P2[0] - P1[1],2) + Math.pow(P2[1] - P1[0],2);
        double raiz = Math.sqrt(d);


        System.out.println("Distancia: " + raiz);
    }
}
