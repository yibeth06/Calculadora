package miCalculadora;
import java.util.Scanner;
public class Multiplicacion {
    private Scanner scanner;
    private Operaciones operaciones;
    public Multiplicacion (Scanner scanner, Operaciones operaciones){
        this.scanner=scanner;
        this.operaciones=operaciones;
    }
    public void mostrarMultiplicacion() {
        System.out.print("Ingrese el primer valor: ");
        float num1 = scanner.nextFloat();

        System.out.print("Ingrese el segundo valor: ");
        float num2 = scanner.nextFloat();

        float resultado;
        resultado = num1 * num2;
        System.out.println("----------------------------");
        System.out.println("La multiplicacion es: "+ resultado);
        System.out.println("----------------------------");

    }
}