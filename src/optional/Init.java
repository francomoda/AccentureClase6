package optional;

import java.util.Optional;

public class Init {
    
    public static Optional<Integer> verificar(Integer x) {
        if (x % 11 == 0) {
            return Optional.of(x);
        }
        return Optional.empty();
    }
    public static boolean verificar66(Integer x) {
        if (x == 66) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {        
        java.util.stream.Stream.iterate(0, i -> i + 2)
                // .limit(1000)                
                .map( z -> verificar(z) )
                .filter( z -> z.isPresent() )
                .map(z -> "HOLA:" + z.get())
                .limit(50)
                .forEach( z -> System.out.println(z) );
    }
}
