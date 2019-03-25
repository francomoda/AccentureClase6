package ruletaparimpar;

import java.util.Random;

public class Init {
    public static int cantApostado = 0;
    public static int cantGanado = 0;
    public static int maximoApostado = 0;
    
    public static int randomizar() {
        return new Random().nextInt(37);
    }
    public static void jugar(int cantFichas) {
        int nro = randomizar();
        
        cantApostado += cantFichas;
        
        if (nro == 0) {
            System.out.println("Perdi por 0, debo jugar el doble");
            jugar(cantFichas * 2);
            return;
        }
        if (nro % 2 == 0) {
            System.out.println("Perdi por par, debo jugar el doble");
            jugar(cantFichas * 2);
            return;
        }
        System.out.println("Gane, impar, pero tuve que apsotar: " + cantFichas);
        cantGanado += (cantFichas * 2);
        if (cantFichas > maximoApostado) {
            maximoApostado = cantFichas;
        }
    }
    public static void main(String... s) throws InterruptedException {
        for (;;) {
            jugar(1);
            System.out.println("Cantidad apostado: " + cantApostado);
            System.out.println("Cantidad ganado:" + cantGanado);
            System.out.println("Maximo Apostado: " + maximoApostado);
            System.out.println("------------------------------------");
            Thread.sleep(4000);
        }
    }
}
