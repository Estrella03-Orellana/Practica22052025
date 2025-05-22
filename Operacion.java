public class Operacion {

    // Aplicando sobrecarga de metodos, mismo nombre pero diferentes parametros
    // Ejemplo de sobrecarga de metodos

    public int Sumar(int a, int b) {
        if (a < 0 || b < 0) {
            System.out.println("No se puede realizar la operacion");
            return -1;
        }
        return a + b;

    }

    public double Sumar(double a, double b) {
        return a + b;
    }

    public int Sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int Restar(int a, int b) {
        return a - b;
    }

    public long Sumar(int a, long b) {
        return a + b;
    }

    public void sumar() {

    }

    //Metodo recursivo para imprimir los numeros impares
    // Se le pasa un numero entero y se imprimen los numeros impares desde ese numero hasta 0
    public void imprimirNumeroImpares(int a){
        if (a%2 == 1){
        System.out.println("El numero es impar " + a);
    }
    a--;
    if(a>0){
        imprimirNumeroImpares(a);
    }
    }
}
