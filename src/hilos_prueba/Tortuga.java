package hilos_prueba;

//Metodo Thread
public class Tortuga extends Thread {

    public Tortuga(){
        this.start();
    }
    public void run() {
        try {
            System.out.println("Soy una tortuga");
            int i = 0;
            while (i < 10) {
                System.out.println("Paso de tortuga: " + (i + 1));

                Thread.sleep(3000);
                i++;
            }
            System.out.println("Termino la tortuga");
        } catch (InterruptedException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

}
