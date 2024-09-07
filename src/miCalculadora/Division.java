package miCalculadora;
import java.util.Scanner;

public class Division {
  private Scanner scanner;
  private Operaciones operaciones;
  public Division (Scanner scanner, Operaciones operaciones){
      this.scanner=scanner;
      this.operaciones=operaciones;
  }

    public void mostrarDivision(){
        System.out.print("Ingrese el primer valor");
        float num1 = scanner.nextFloat();

        System.out.print("Ingrese el segundo valor: ");
        float num2 = scanner.nextFloat();
if (num1 == 0){
    System.out.println("----------------------------");
    System.out.println("Cero no puede dividirse");
    System.out.println("----------------------------");

}
    else {
    float resultado;
    resultado = num1 / num2;
    System.out.println("----------------------------");
    System.out.println("La division es: " + resultado);
    System.out.println("----------------------------");
}
    }



}
