package metodoreduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Init {
    public static void main(String[] args) {
        ArrayList<Integer> arrayEnteros = new ArrayList<Integer>();
        
        arrayEnteros.add(3);
        arrayEnteros.add(4);
        arrayEnteros.add(25);
        arrayEnteros.add(7);
        arrayEnteros.add(14);
        
        Optional<Integer> resultado = arrayEnteros
                .stream()
                .map(z -> String.valueOf(z).length())
                .reduce((z,i) -> z + i);
        
        if (resultado.isPresent()) {
            System.out.println(resultado.get());
        }
        
        resultado.ifPresent(System.out::println);
        
    }
}
