package jantar;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Pedro Thales
 */
public class Filosofo implements Runnable {

    Refeicao refeicao;
    private int fome = 3;
    private boolean temHashi;
    //Fazer o hashi andar entre os filósofos criar uma classe hashi e fazer ela uma thread rodando de filosofo em filosofo.

    public Filosofo(Refeicao refeicao) {
        this.refeicao = refeicao;
    }

    @Override
    public void run() {
        String nomeFilosofo = Thread.currentThread().getName();
        while (refeicao.getRefeicao() > 0) {
            if (temHashi) {
                refeicao.comer(1, nomeFilosofo);
            } else {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public boolean isTemHashi() {
        return temHashi;
    }

    public void setTemHashi(boolean temHashi) {
        this.temHashi = temHashi;
    }

}
