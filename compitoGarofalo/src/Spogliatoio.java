public class Spogliatoio {
    
    public Spogliatoio(){

    }

    public void indossaTuta(String name) throws InterruptedException {


        System.out.println(name + " entra nello spogliatoio e indossa la tuta");
        Thread.sleep(500);
        System.out.println(name + " esce dallo spogliatoio");
    }

    public void rimuoviTuta(String name) throws InterruptedException {

        System.out.println(name + " entra nello spogliatoio e si leva la tuta");
        Thread.sleep(500);
        System.out.println(name + "esce dallo spogliatoio");
    }
}
