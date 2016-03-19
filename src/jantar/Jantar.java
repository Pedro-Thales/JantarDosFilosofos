package jantar;

/**
 *
 * @author Pedro Thales
 */
public class Jantar {

    /**
     * @param args the command line arguments
     */
    static Refeicao refeicao = new Refeicao();

    public static void main(String[] args) {
        Filosofo primeiroFilosofo = new Filosofo(refeicao);
        Filosofo segundoFilosofo = new Filosofo(refeicao);
        Filosofo terceiroFilosofo = new Filosofo(refeicao);
        Filosofo quartoFilosofo = new Filosofo(refeicao);
        Filosofo quintoFilosofo = new Filosofo(refeicao);

        Hashi hashi = new Hashi(primeiroFilosofo, segundoFilosofo,
                terceiroFilosofo, quartoFilosofo, quintoFilosofo);

        Thread primeiro = new Thread(primeiroFilosofo, "Primeiro");
        Thread segundo = new Thread(segundoFilosofo, "Segundo");
        Thread terceiro = new Thread(terceiroFilosofo, "Terceiro");
        Thread quarto = new Thread(quartoFilosofo, "Quarto");
        Thread quinto = new Thread(quintoFilosofo, "Quinto");

        hashi.start();
        primeiro.start();
        segundo.start();
        terceiro.start();
        quarto.start();
        quinto.start();

        while (!hashi.isInterrupted()) {
            if (refeicao.getRefeicao() < 1) {
                hashi.interrupt();
            }
        }

    }

}
