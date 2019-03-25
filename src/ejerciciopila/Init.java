package ejerciciopila;

public class Init {
    public static void main(String[] args) {
        try {
            new java.util.Random(37).nextInt();
            
            
            new Pila().m1(10);
            System.out.println("Intento exitoso sale por OK");
        }
        catch (Mayor100Exception ex) {
            System.out.println("Mayor a 100");
        }
        catch (Mayor200Exception ex) {
            System.out.println("Mayor a 200");
        }        
        catch (RuntimeException ex) {
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Fallo algo pero la aplicacion continua");
        }
        catch (Throwable t) {
        }
        finally {
            System.out.println("Continua");
            System.out.println("Sigue siguiendo");
        }
    }
}
