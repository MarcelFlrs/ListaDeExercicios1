public class Exercicio20 {
    public static void executar() {
        double tempoViagem = Prompt.lerInteiro("Digite o tempo de viagem em horas: ");
        double velMedia = Prompt.lerInteiro("Digite a velocidade média da viagem em Km/h: ");

        double distancia = tempoViagem * velMedia;
        double litros = distancia / 12;

        System.out.println("A quantidade de combustível gasta é de " + litros + " L");

    }
}
