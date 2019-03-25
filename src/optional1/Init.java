package optional1;

import java.util.Optional;

class Ticket {

    public Ticket(int minutos) {
        this.minutos = minutos;
    }
    
    public final int minutos;
}

public class Init {
    public static void mostrarMinutos(Ticket t) {
        System.out.println(t.minutos);
    }
    public static Optional<Ticket> obtenerTicket() {
        // return Optional.of(new Ticket(100));
        return Optional.empty();
    }
    public static void main(String[] args) {
        obtenerTicket()
                .filter( z -> (z.minutos > 2))
                .ifPresent( t -> mostrarMinutos(t));
                
    }
}
