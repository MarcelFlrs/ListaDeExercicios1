public class Exercicio19 {
    public static void executar() {
        double raio = Prompt.lerDecimal("Digite o raio do cilindro"); 
        double altura = Prompt.lerDecimal("Digite a altura do cilindro"); 

        double volume = 3.14 * Math.pow(raio, 2) * altura;

        System.out.println("O volume do cilindro é: " + volume);
    }
}
