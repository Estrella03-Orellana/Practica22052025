public class Main {
 public static void main(String[] args) {
    //se creo la instancia de la clase Operacion
        Operacion op = new Operacion();
        
        //Mando a llamar el metodo Sumar, con diferentes tipos de datos
        int result1 = op.Sumar(5, 10);
        System.out.println("Resultado de la suma de enteros: " + result1);
        
        //Llamo al metodo Sumar con dos numeros decimales y guardo el resultado en una variable
        double result2 = op.Sumar(5.5, 10.5);
        System.out.println("Resultado de la suma de dobles: " + result2);
        
        //Metodo Sumar con tres enteros
        //Llamo al metodo Sumar con tres enteros y guardo el resultado en una variable
        int result3 = op.Sumar(5, 10, 15);
        System.out.println("Resultado de la suma de tres enteros: " + result3);
        
        // Metodo Sumar con un numero negativo, para que de error 
        int result4 = op.Sumar(-5, 10);
        System.out.println("Resultado de la suma con un número negativo: " + result4);
        
        op.imprimirNumeroImpares(7);
    }

    
}
