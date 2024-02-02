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
                    System.out.println("Ingrese que tipo de Pokemon desea ingresar: ");
                    System.out.println("1. Fire Type.");
                    System.out.println("2. Water Type.");
                    System.out.println("3. Grass Type.");
                    System.out.println("Ingrese su opcion: ");
                    int opcionPok = leer.nextInt();
                    while(opcionPok > 3 || opcionPok < 1){
                        System.out.println("Opcion invalida! Ingrese de nuevo.");
                        opcionPok = leer.nextInt();
                    }
                    System.out.println("Ingrese el nombre del Pokemon: ");
                    String nombre = leerS.nextLine();
                    
                    System.out.println("Ingrese el numero de entrada en la Pokedex del Pokemon: ");
                    int num_pokedex = leer.nextInt();
                    
                    System.out.println("Ingrese la naturaleza del Pokemon: Timido/Energetico/Misterioso");
                    String naturaleza = leerS.nextLine();
                    
                    while(!naturaleza.equalsIgnoreCase("Timido") && !naturaleza.equalsIgnoreCase("Energetico")&& !naturaleza.equalsIgnoreCase("Misterioso")){
                        System.out.println("Naturaleza no valida! ");
                        System.out.println("Ingrese la naturaleza del Pokemon: Timido/Energetico/Misterioso");
                        naturaleza = leerS.nextLine();
                    }
                    if(opcionPok == 1){
                        System.out.println("Ingrese la potencia de llamas del Pokemon (numero entero): ");
                        int potencia_llamas = leer.nextInt();
                        FireType fuego = new FireType(potencia_llamas, nombre, num_pokedex, naturaleza, false);
                        pokemon.add(fuego);
                    }else if (opcionPok == 2){
                        System.out.println("El Pokemon puede vivir fuera del agua?");
                        System.out.println("1. Si.");
                        System.out.println("2. No.");
                        int opcion_vivir = leer.nextInt();
                        while(opcion_vivir > 2|| opcion_vivir < 1){
                            System.out.println("Opcion invalida! Ingrese de nuevo.");
                            opcion_vivir = leer.nextInt();
                        }
                        boolean vivir;
                        if(opcion_vivir == 1){
                            vivir = true;
                        }else{
                            vivir = false;
                        }
                        System.out.println("Ingrese la velocidad en que puede nadar en el agua: (numero entero)");
                        int velocidad = leer.nextInt();
                        WaterType water = new WaterType(vivir, velocidad, nombre, num_pokedex, naturaleza, false);
                        pokemon.add(water);
                    }else{
                        System.out.println("Ingrese el habitat del Pokemon: ");
                        String habitat = leerS.nextLine();
                        System.out.println("Ingrese su dominio sobre las plantas (1-100): ");
                        int dominio = leer.nextInt();
                        while(dominio > 100 || dominio < 1){
                            System.out.println("Dominio invalido! Ingrese de nuevo: ");
                            dominio = leer.nextInt();
                        }
                        GrassType grass = new GrassType(habitat, dominio, nombre, num_pokedex, naturaleza,false);
                    }
                    
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
