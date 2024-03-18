public class Exercicio13 {
    public static void executar() {
        double num1 = Prompt.lerDecimal("Digite o primeiro valor: ");
        double num2 = Prompt.lerDecimal("Digite o segundo valor: ");

        int op = Prompt.lerInteiro("Digite a operação: \n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");

        switch (op) {
            case 1: System.out.println("Operação selecionada: Adição\nResultado: " + (num1 + num2));
                break;
            case 2: System.out.println("Operação selecionada: Subtração\nResultado: " + (num1 - num2));
                break;
            case 3: System.out.println("Operação selecionada: Multiplicação\nResultado: " + (num1 * num2));
                break;
            case 4: if (num1 == 0 || num2 == 0) {
                        System.out.println("Erro: Tentativa de divisão por zero");
                        break;
                    }else{
                        System.out.println("Operação selecionada: divisão\nResultado: " + (num1 / num2));
                        break;
                    } 
            default: System.out.println("Operador não definido");
                break;
        }
    }
}
