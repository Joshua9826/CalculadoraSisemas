package SI2;
public class calculadoraS {
    public static void main (String[] args) {
        operacion operacion1 = new operacion();
        System.out.println("La suma es: " + operacion1.sum(5, 3));
        System.out.println("La resta es: " + operacion1.rest(5, 3));    
        System.out.println("La multiplicacion es: " + operacion1.multip(5, 3));
        System.out.println("La division es: " + operacion1.div (5, 3));
        System.out.println("La exponensiacion es: " + operacion1.exp (5, 3));
    }
    
}
