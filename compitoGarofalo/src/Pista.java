import java.util.concurrent.Semaphore;

public class Pista {
    
    private Semaphore access;

    public Pista(int posti){

        access = new Semaphore(posti, true);

    }

    public void iniziaGara(String name, int laps) throws InterruptedException {

        if(!(laps <= 15 && laps > 0))
            return;

        access.acquire();

        System.out.println(name + " entra in pista, rimangono " + access.availablePermits() + " posti liberi in pista;");
        int time = 0;

        for(int i = 0; i < laps; i++){

            int sleepTime = (int)(Math.random() * 2000) + 4000;
            Thread.sleep(sleepTime);
            System.out.println(name + " ha percorso il giro n " + (i+1));
            time += sleepTime;
        }

        System.out.println(name + " esce dalla pista, tempo effettuato: " + time);

        access.release();

    }
}
