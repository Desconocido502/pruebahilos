package hilos_prueba;

//Clase Runneable
public class Liebre implements Runnable {

        String nombre, color;

    public Liebre(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    @Override
    public void run() {
        try {
            System.out.println("Soy una liebre y me llamo: " + nombre);
            int i = 0;
            while (i < 10) {
                System.out.println("Salto de conejo: " + (i + 1));
                Thread.sleep(500);
                i++;
            }
            System.out.println("Termino la liebre de color: " + color );
        } catch (InterruptedException ex) { 
            System.out.println(ex.getStackTrace());
        }
    }

}
