package miCalculadora;

import java.util.Scanner;

public class Operaciones {
    private Scanner scanner;
public Operaciones(Scanner scanner){
    this.scanner=scanner;
        }

public void mostrarOperaciones(){
    while(true){
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Salir");
        System.out.println("----------------------------");
        System.out.print("Ingrese una opcion: ");
        int opcion=scanner.nextInt();
        System.out.println("----------------------------");
     switch (opcion){

         case 1:
             Suma suma = new Suma(scanner, this);
             suma.mostrarSuma();
             break;
         case 2:
             Resta resta = new Resta(scanner, this);
             resta.mostrarResta();
             break;
         case 3:
             Multiplicacion multiplicacion = new Multiplicacion(scanner, this);
             multiplicacion.mostrarMultiplicacion();
             break;
         case 4:
             Division division = new Division(scanner, this);
             division.mostrarDivision();
             break;
         case 5:
         System.out.println("Saliendo del programa");
             return;
         default:
             System.out.println("opcion invalida,digite otra opcion");
             break;

     }

         }

    }




}
