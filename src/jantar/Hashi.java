package jantar;

/**
 * @author Pedro Thales
 */
public class Hashi extends Thread implements Runnable {

    int contador = 1;

    Filosofo primeiroFilosofo;
    Filosofo segundoFilosofo;
    Filosofo terceiroFilosofo;
    Filosofo quartoFilosofo;
    Filosofo quintoFilosofo;

    public Hashi(Filosofo primeiroFilosofo, Filosofo segundoFilosofo,
            Filosofo terceiroFilosofo, Filosofo quartoFilosofo,
            Filosofo quintoFilosofo) {

        this.primeiroFilosofo = primeiroFilosofo;
        this.segundoFilosofo = segundoFilosofo;
        this.terceiroFilosofo = terceiroFilosofo;
        this.quartoFilosofo = quartoFilosofo;
        this.quintoFilosofo = quintoFilosofo;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                primeiroFilosofo.setTemHashi(true);
                Thread.sleep(2000);
                primeiroFilosofo.setTemHashi(false);

                segundoFilosofo.setTemHashi(true);
                Thread.sleep(2000);
                segundoFilosofo.setTemHashi(false);

                terceiroFilosofo.setTemHashi(true);
                Thread.sleep(2000);
                terceiroFilosofo.setTemHashi(false);

                quartoFilosofo.setTemHashi(true);
                Thread.sleep(2000);
                quartoFilosofo.setTemHashi(false);

                quintoFilosofo.setTemHashi(true);
                Thread.sleep(2000);
                quintoFilosofo.setTemHashi(false);
                primeiroFilosofo.setTemHashi(true);
            }
        } catch (InterruptedException ex) {
            System.out.println("Finalizado !!!");
        }

    }

}
