package ejerciciopila;

class Mayor100Exception extends Exception {}
class Mayor200Exception extends Exception {}


public class Pila {
    void m1(int x) throws Exception {
        System.out.println("antes de llamar a m2");
        m2(x+1);
        System.out.println("despues de llamar a m2");
    }
    
    void m2(int x) throws Exception {
        System.out.println("antes de llamar a m3");
        m3(x+1);
        System.out.println("despues de llamar a m3");
    }
    
    void m3(int x) throws Exception {
        System.out.println("antes de llamar a m4");
        m4(x+1);
        System.out.println("despues de llamar a m4");        
    }
    
    void m4(int x) throws Exception {
        System.out.println("antes de llamar a m5");
        m5(x+1);
        System.out.println("despues de llamar a m5");
    }
    
    void m5(int x) throws Exception {
        System.out.println("antes de llamar a m6");
        m6(x+1);
        System.out.println("despues de llamar a m6");
    }
    
    void m6(int x) throws Exception {
        System.out.println("llegue a m6");
        System.out.println("Valor de x: " + x);
        
        if (x > 200) {
            throw new Mayor200Exception();
        }
        if (x > 100) {
            throw new Mayor100Exception();
        }
        if (x > 50) {
            throw new RuntimeException("UHUUUUU");
        }
    }
}
