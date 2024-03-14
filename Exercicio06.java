public class Exercicio06 {
    public static void executar() {
        int TempC = Prompt.lerInteiro("Digite a temperatura em graus Celsius: ");
        int TempF = (9 * TempC + 160) / 5;

        System.out.println("A temperatura convertida para Fahrenheit é igual à: " + TempF);
    }
}
