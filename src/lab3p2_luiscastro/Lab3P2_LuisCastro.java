/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_luiscastro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lfern
 */
public class Lab3P2_LuisCastro {
static Scanner leer = new Scanner(System.in);
static Scanner leerS = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemon = new ArrayList();
        ArrayList<Pokeball> pokeballs = new ArrayList();
        System.out.println("*****Menu*****");
        System.out.println("1. Crear Pokemon.");
        System.out.println("2. Crear Pokebola.");
        System.out.println("3. Listar Pokemon.");
        System.out.println("4. Eliminar Pokemon");
        System.out.println("5. Capturar Pokemon.");
        System.out.println("6. Modificar Pokemon.");
        System.out.println("7. Salir.");
        System.out.println("Ingrese su opcion: ");
        int opcion = leer.nextInt();
        while(opcion != 7){
            switch(opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }//FIN SWITCH OPCION
            System.out.println("*****Menu*****");
            System.out.println("1. Crear Pokemon.");
            System.out.println("2. Crear Pokebola.");
            System.out.println("3. Listar Pokemon.");
            System.out.println("4. Eliminar Pokemon");
            System.out.println("5. Capturar Pokemon.");
            System.out.println("6. Modificar Pokemon.");
            System.out.println("7. Salir.");
            System.out.println("Ingrese su opcion: ");
            opcion = leer.nextInt();
        }//FIN WHILE
    }
    
}
