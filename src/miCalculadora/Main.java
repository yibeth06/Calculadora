package miCalculadora;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //declarar scanner
        Scanner scanner= new Scanner (System.in);

        //declara lo q son operaciones
        //abajo lo llama
        Operaciones operaciones= new Operaciones(scanner);
        operaciones.mostrarOperaciones();
    }
}