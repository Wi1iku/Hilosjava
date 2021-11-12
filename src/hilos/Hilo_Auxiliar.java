package hilos;

public class Hilo_Auxiliar extends Thread{

    public Hilo_Auxiliar(int prioridad){
       this.setPriority(prioridad);
    }

    @Override
    public void run() {

        System.out.println("Prioridad en "+this.getName()+" es: "+this.getPriority());
    }
}
