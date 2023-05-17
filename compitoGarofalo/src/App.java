public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Spogliatoio spogliatoio = new Spogliatoio();
        Pista pista = new Pista(4);
        Pilota p1 = new Pilota("Gino", spogliatoio, pista);
        Pilota p2 = new Pilota("Brogi", spogliatoio, pista);
        Pilota p3 = new Pilota("Valdez", spogliatoio, pista);
        Pilota p4 = new Pilota("Gigu", spogliatoio, pista);
        Pilota p5 = new Pilota("Cricket", spogliatoio, pista);
        Pilota p6 = new Pilota("Nisken", spogliatoio, pista);
        Pilota p7 = new Pilota("Bure", spogliatoio, pista);
        Pilota p8 = new Pilota("LolloLasa", spogliatoio, pista);
        Pilota p9 = new Pilota("Bobone",spogliatoio, pista);
        Pilota p10 = new Pilota("Chaffei", spogliatoio, pista);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();
        p9.join();
        p10.join();
    }
}
