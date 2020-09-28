package hilos_prueba;

public class Carrera extends Thread {

    int limite;
    Interfaz ventana;

    public Carrera(int limite, Interfaz ventana) {
        this.limite = limite;
        this.ventana = ventana;
        this.start();
    }

    public void run() {
        try {
            int posConejo = ventana.posconejo;
            int posTortuga = ventana.postortuga;
            while ((posConejo < limite) || (posTortuga < limite)) {
                if (posConejo > limite) {
                    break;
                }
                ventana.MoverConejo();
                ventana.MoverTortuga();

                Thread.sleep(1000);

                posConejo = ventana.posconejo;
                posTortuga = ventana.postortuga;
                System.out.println(posConejo);
                System.out.println(posTortuga);

            }

        } catch (InterruptedException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

}
