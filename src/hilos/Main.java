package hilos;

public class Main {

    public static void main(String[] args) {
       /* Hilo_Auxiliar hilo1 = new Hilo_Auxiliar(Thread.MAX_PRIORITY);
        Hilo_Auxiliar hilo2 = new Hilo_Auxiliar(Thread.MAX_PRIORITY);
        Hilo_Auxiliar hilo3 = new Hilo_Auxiliar(Thread.MAX_PRIORITY);
        Hilo_Auxiliar hilo4 = new Hilo_Auxiliar(Thread.MAX_PRIORITY);
        Hilo_Auxiliar hilo5 = new Hilo_Auxiliar(Thread.MAX_PRIORITY);

        Hilo_Auxiliar hilo11 = new Hilo_Auxiliar(Thread.NORM_PRIORITY);
        Hilo_Auxiliar hilo12 = new Hilo_Auxiliar(Thread.NORM_PRIORITY);
        Hilo_Auxiliar hilo13 = new Hilo_Auxiliar(Thread.NORM_PRIORITY);
        Hilo_Auxiliar hilo14 = new Hilo_Auxiliar(Thread.NORM_PRIORITY);
        Hilo_Auxiliar hilo15 = new Hilo_Auxiliar(Thread.NORM_PRIORITY);

        Hilo_Auxiliar hilo6 = new Hilo_Auxiliar(Thread.MIN_PRIORITY);
        Hilo_Auxiliar hilo7 = new Hilo_Auxiliar(Thread.MIN_PRIORITY);
        Hilo_Auxiliar hilo8 = new Hilo_Auxiliar(Thread.MIN_PRIORITY);
        Hilo_Auxiliar hilo9 = new Hilo_Auxiliar(Thread.MIN_PRIORITY);
        Hilo_Auxiliar hilo10 = new Hilo_Auxiliar(Thread.MIN_PRIORITY);
        */

        Hilo_Auxiliar[] hiloarray = new Hilo_Auxiliar[15];
        for (int i = 0; i <15 ; i++) {
            if (i<=5){
                hiloarray[i]= new Hilo_Auxiliar(Thread.MAX_PRIORITY);

            }
            else if(i<10){
                hiloarray[i]= new Hilo_Auxiliar(Thread.NORM_PRIORITY);
            }
            else {
                hiloarray[i]= new Hilo_Auxiliar(Thread.MIN_PRIORITY);
            }

        }

        for (int i = 0; i <15 ; i++) {
            hiloarray[i].start();
            Thread.yield();
        }



    }
}
