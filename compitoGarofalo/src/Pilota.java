public class Pilota extends Thread {
    
    private Spogliatoio spogliatoio;
    private Pista pista;

    public Pilota(String name, Spogliatoio spogliatoio, Pista pista) {

        super(name);
        this.spogliatoio = spogliatoio;
        this.pista = pista;
    }

    @Override
    public void run() {
        
        try {

            spogliatoio.indossaTuta(getName());

            pista.iniziaGara(getName(), 15);

            spogliatoio.rimuoviTuta(getName());
        }catch (InterruptedException e) {

        }
    }
}
