import java.util.Scanner; //importando la utilidad de scanner

public class NumeroFlotanteSolinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creando la utilidad de scanner

        System.out.print("Ingrese un número float: ");
        float numero = scanner.nextFloat(); //creando una variable de tipo float que contiene el scanner

        // Obtener la parte entera y la parte decimal
        int parteEntera = (int) numero; //creando una variable de tipo entero que contiene el numero float convertido a entero
        float parteDecimal = numero - parteEntera; //creando una variable de tipo flotante que tendra el valor del numero ingresado
        // restandole la parte entera para que solo quede la parte decimal del numero ingresado

        // Imprimiendo la parte entera y la parte decimal
        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);

    }
}

