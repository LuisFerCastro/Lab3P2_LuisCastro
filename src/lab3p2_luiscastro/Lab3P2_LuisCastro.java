/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_luiscastro;

import java.util.ArrayList;
import java.util.Random;
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
                    System.out.println("Agregar Pokemon.");
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
                        System.out.println("Ingrese el numero: ");
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
                        System.out.println("Ingrese la velocidad en que puede nadar en el agua (numero entero):");
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
                        pokemon.add(grass);
                    } 
                    break;
                case 2:
                    System.out.println("Agregar Pokebola.");
                    System.out.println("Ingrese el color de la Pokebola:");
                    String color = leerS.nextLine();
                    System.out.println("Ingrese el numero de serie de la Pokebola:");
                    int num_serie = leer.nextInt();
                    boolean igual = false;
                    if(pokeballs.isEmpty()){
                        igual = false;
                    }else{
                        for (int i = 0; i < pokeballs.size(); i++) {
                            if(pokeballs.get(i).getNum_serie()== num_serie){
                                igual = true;
                                break;
                            }
                        }
                    }
                    
                    while(igual == true){
                        int cont = 0;
                        System.out.println("El numero de serie ya existe. Ingrese de nuevo:");
                        num_serie = leer.nextInt();
                        for (int i = 0; i < pokeballs.size(); i++) {
                            if(pokeballs.get(i).getNum_serie()== num_serie){
                                igual = true;
                                cont++;
                                break;
                            }
                            if (cont == 0){
                                igual = false;
                            }
                        }
                    }
                    System.out.println("Ingrese el numero de eficiencia de la Pokebola (1-3): ");
                    int eficiencia = leer.nextInt();
                    while(eficiencia > 3 || eficiencia < 1){
                        System.out.println("Eficiencia invalida! Ingrese de nuevo:");
                        eficiencia = leer.nextInt();
                    }
                    Pokeball pokeball = new Pokeball(color, num_serie, eficiencia);
                    pokeballs.add(pokeball);
                    break;

                case 3:
                    if(pokemon.isEmpty()){
                        System.out.println("No hay pokemones para listar!");
                    }else{
                        System.out.println("Lista de Pokemones: ");
                        for (int i = 0; i < pokemon.size(); i++) {
                            if(pokemon.get(i)instanceof FireType){
                                System.out.println(pokemon.get(i));
                            }
                        }
                        for (int i = 0; i < pokemon.size(); i++) {
                            if(pokemon.get(i)instanceof WaterType){
                                System.out.println(pokemon.get(i));
                            }
                        }
                        for (int i = 0; i < pokemon.size(); i++) {
                            if(pokemon.get(i)instanceof GrassType){
                                System.out.println(pokemon.get(i));
                            }
                        }
                    }
                    System.out.println("");
                    break;
                case 4:
                    if(pokemon.isEmpty()){
                        System.out.println("No hay pokemon en la lista!");
                    }else{
                        System.out.println("Ingrese el tipo de pokemon que desea eliminar: ");
                        System.out.println("1. Fire Type.");
                        System.out.println("2. Water Type.");
                        System.out.println("3. Grass Type.");
                        System.out.println("Ingrese su opcion:");
                        int opcion_elim = leer.nextInt();
                        
                        while(opcion_elim > 3||opcion_elim < 0){
                            System.out.println("Opcion invalida! Ingrese de nuevo: ");
                            opcion_elim = leer.nextInt();
                        }
                        if(opcion_elim == 1){
                            int cont = 0;
                            for (int i = 0; i < pokemon.size(); i++) {
                                if(pokemon.get(i)instanceof FireType){
                                    System.out.println(i+". "+pokemon.get(i));
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No se han encontrado pokemones tipo Fire, devolviendo al menu.");
                                break;
                            }
                            System.out.println("Ingrese el index que desea eliminar (0 en adelante): ");
                            int index_elim = leer.nextInt();
                            while(index_elim < 0 || index_elim >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_elim = leer.nextInt();
                            }
                            while(pokemon.get(index_elim)instanceof GrassType||pokemon.get(index_elim)instanceof WaterType){
                                System.out.println("El pokemon escojido no es un fire type! Ingrese de nuevo: ");
                                index_elim = leer.nextInt();
                                while(index_elim < 0 || index_elim >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_elim = leer.nextInt();
                                }
                            }
                            pokemon.remove(index_elim);
                        }else if(opcion_elim == 2){
                            int cont = 0;
                            for (int i = 0; i < pokemon.size(); i++) {
                                if(pokemon.get(i)instanceof WaterType){
                                    System.out.println(i+". "+pokemon.get(i));
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No se han encontrado pokemones tipo Water, devolviendo al menu.");
                                break;
                            }
                            System.out.println("Ingrese el index que desea eliminar (0 en adelante): ");
                            int index_elim = leer.nextInt();
                            while(index_elim < 0 || index_elim >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_elim = leer.nextInt();
                            }
                            while(pokemon.get(index_elim)instanceof GrassType||pokemon.get(index_elim)instanceof FireType){
                                System.out.println("El pokemon escojido no es un water type! Ingrese de nuevo: ");
                                index_elim = leer.nextInt();
                                while(index_elim < 0 || index_elim >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_elim = leer.nextInt();
                                }
                            }
                            pokemon.remove(index_elim);
                        }else{
                            int cont = 0;
                           for (int i = 0; i < pokemon.size(); i++) {
                                if(pokemon.get(i)instanceof GrassType){
                                    System.out.println(i+". "+pokemon.get(i));
                                    cont++;
                                }
                            } 
                           if(cont==0){
                               System.out.println("No se han encontrado pokemones tipo Grass, devolviendo al menu.");
                               break;
                           }
                           System.out.println("Ingrese el index que desea eliminar (0 en adelante): ");
                            int index_elim = leer.nextInt();
                            while(index_elim < 0 || index_elim >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_elim = leer.nextInt();
                            }
                            while(pokemon.get(index_elim)instanceof WaterType||pokemon.get(index_elim)instanceof FireType){
                                System.out.println("El pokemon escojido no es un grass type! Ingrese de nuevo: ");
                                index_elim = leer.nextInt();
                                while(index_elim < 0 || index_elim >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_elim = leer.nextInt();
                                }
                            }
                            pokemon.remove(index_elim);
                        }
                    }
                    
                    break;
                case 5:
                    if(pokeballs.isEmpty()||pokemon.isEmpty()){
                        System.out.println("La lista de pokebolas o la lista de pokemons esta vacia! No se puede realizar esta operacion!");
                    }else{
                        System.out.println("Lista de pokebolas: ");
                        for (int i = 0; i < pokeballs.size(); i++) {
                            System.out.println(i+". "+pokeballs.get(i));
                        }
                        System.out.println("Escoja la pokebola que desea (0 en adelante): ");
                        int index_poke = leer.nextInt();
                        while(index_poke < 0|| index_poke >= pokeballs.size()){
                            System.out.println("Index fuera de rango! Ingrese de nuevo:");
                            index_poke = leer.nextInt();
                        }
                        Random rand = new Random();
                        int indice_pokemon = rand.nextInt(pokemon.size());
                        while(pokemon.get(indice_pokemon).isAtrapado() == true){
                            indice_pokemon = rand.nextInt(pokemon.size());
                        }
                        System.out.println("EL POKEMON "+pokemon.get(indice_pokemon).getNombre()+" HA APARECIDO!");
                        System.out.println("Que desea realizar?");
                        System.out.println("1. Usar pokebola.");
                        System.out.println("2. Huir.");
                        System.out.println("Ingrese su opcion: ");
                        int op_hacer = leer.nextInt();
                        while(op_hacer > 2 || op_hacer < 0){
                            System.out.println("Opcion invalida! Ingrese de nuevo: ");
                            op_hacer = leer.nextInt();
                        }
                        if(op_hacer == 1){
                            int efic = pokeballs.get(index_poke).getEficiencia();
                            if(efic == 3){
                                pokemon.get(indice_pokemon).setAtrapado(true);
                                pokemon.get(indice_pokemon).setPoke(pokeballs.get(index_poke));
                                pokeballs.remove(index_poke);
                                System.out.println("El pokemon ha sido atrapado! La pokeball se ha usado.");
                            }else if(efic == 2){
                                int prob = rand.nextInt(3)+1;
                                System.out.println(prob);
                                if(prob == 1 || prob == 2){
                                    System.out.println("El pokemon ha sido atrapado! La pokeball se ha usado.");
                                    pokemon.get(indice_pokemon).setAtrapado(true);
                                    pokemon.get(indice_pokemon).setPoke(pokeballs.get(index_poke));
                                }else{
                                    System.out.println("No se ha podido capturar el pokemon.");
                                }
                                pokeballs.remove(index_poke);
                            }else{
                                int prob2 = rand.nextInt(3)+1;
                                System.out.println(prob2);
                                if(prob2 == 1){
                                    System.out.println("El pokemon ha sido atrapado! La pokeball se ha usado.");
                                    pokemon.get(indice_pokemon).setAtrapado(true);
                                    pokemon.get(indice_pokemon).setPoke(pokeballs.get(index_poke));
                                }else{
                                    System.out.println("No se ha podido capturar el pokemon.");
                                }
                                pokeballs.remove(index_poke);
                            }
                        }else{
                            System.out.println("Ha huido. Regresando a menu.");
                            break;
                        }
                    }
                    break;
                case 6:
                    if(pokemon.isEmpty()){
                        System.out.println("No hay pokemons para modificar!");
                    }else{
                        System.out.println("Escoja el tipo de pokemon que desea modificar: ");
                        System.out.println("1. Fire Type.");
                        System.out.println("2. Water Type.");
                        System.out.println("3. Grass Type.");
                        System.out.println("Ingrese su opcion: ");
                        int opcion_pok = leer.nextInt();
                        while(opcion_pok > 3 ||opcion_pok < 0){
                            System.out.println("Opcion invalida! Ingrese de nuevo:");
                            opcion_pok = leer.nextInt();
                        }
                        if(opcion_pok == 1){
                            int cont = 0;
                            for (int i = 0; i < pokemon.size(); i++) {
                                if(pokemon.get(i)instanceof FireType && pokemon.get(i).isAtrapado()==true){
                                    System.out.println(i+". "+pokemon.get(i));
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No hay pokemon de tipo fuego a modificar.");
                                break;
                            }
                            System.out.println("Ingrese el pokemon que desea modificar: ");
                            int index_mod = leer.nextInt();
                            while(index_mod < 0 || index_mod >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_mod = leer.nextInt();
                            }
                            while(pokemon.get(index_mod)instanceof GrassType||pokemon.get(index_mod)instanceof WaterType||pokemon.get(index_mod).isAtrapado()==false){
                                System.out.println("El pokemon escojido no es un fire type o no ha sido atrapado! Ingrese de nuevo: ");
                                index_mod = leer.nextInt();
                                while(index_mod< 0 || index_mod >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_mod = leer.nextInt();
                                }
                            }
                            System.out.println("Que desea modificar?");
                            System.out.println("1. Nombre.");
                            System.out.println("2. Numero de entrada en la pokedex.");
                            System.out.println("3. Potencia de llamas.");
                            int opcion_submenu1 = leer.nextInt();
                            while(opcion_submenu1 > 3|| opcion_submenu1 < 0){
                                System.out.println("Opcion invalida! Ingrese de nuevo:");
                                opcion_submenu1 = leer.nextInt();
                            }
                            if(opcion_submenu1 == 1){
                                System.out.println("Ingrese el nuevo nombre: ");
                                String nuevo_nombre = leerS.nextLine();
                                ((FireType)pokemon.get(index_mod)).setNombre(nuevo_nombre);    
                            }else if(opcion_submenu1 == 2){
                                System.out.println("Ingrese el nuevo numero: ");
                                int nuevo_num = leer.nextInt();
                                ((FireType)pokemon.get(index_mod)).setNum_pokedex(nuevo_num);
                            }else{
                                System.out.println("Ingrese la nueva potencia de llamas: ");
                                int potencia = leer.nextInt();
                                ((FireType)pokemon.get(index_mod)).setPotencia_llamas(potencia);
                            }
                        }else if(opcion_pok == 2){
                           int cont = 0;
                            for (int i = 0; i < pokemon.size(); i++) {
                                if(pokemon.get(i)instanceof WaterType && pokemon.get(i).isAtrapado()==true){
                                    System.out.println(i+". "+pokemon.get(i));
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No hay pokemon de tipo agua a modificar.");
                                break;
                            } 
                            System.out.println("Ingrese el pokemon que desea modificar: ");
                            int index_mod = leer.nextInt();
                            while(index_mod < 0 || index_mod >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_mod = leer.nextInt();
                            }
                            while(pokemon.get(index_mod)instanceof GrassType||pokemon.get(index_mod)instanceof FireType||pokemon.get(index_mod).isAtrapado()==false){
                                System.out.println("El pokemon escojido no es un water type o no ha sido atrapado! Ingrese de nuevo: ");
                                index_mod = leer.nextInt();
                                while(index_mod< 0 || index_mod >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_mod = leer.nextInt();
                                }
                            }
                            System.out.println("Que desea modificar?");
                            System.out.println("1. Nombre.");
                            System.out.println("2. Numero de entrada en la pokedex.");
                            System.out.println("3. Puede vivir fuera del agua.");
                            int opcion_submenu = leer.nextInt();
                            while(opcion_submenu > 3|| opcion_submenu < 0){
                                System.out.println("Opcion invalida! Ingrese de nuevo:");
                                opcion_submenu = leer.nextInt();
                            }
                             if(opcion_submenu == 1){
                                System.out.println("Ingrese el nuevo nombre: ");
                                String nuevo_nombre = leerS.nextLine();
                                ((WaterType)pokemon.get(index_mod)).setNombre(nuevo_nombre);    
                            }else if(opcion_submenu == 2){
                                System.out.println("Ingrese el nuevo numero: ");
                                int nuevo_num = leer.nextInt();
                                ((WaterType)pokemon.get(index_mod)).setNum_pokedex(nuevo_num);
                            }else{
                                System.out.println("Puede vivir en agua? ");
                                System.out.println("Ingrese el numero: ");
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
                                ((WaterType)pokemon.get(index_mod)).setFuera_agua(vivir);
                            }
                        }else{
                            int cont = 0;
                            for (int i = 0; i < pokemon.size(); i++) {
                                if(pokemon.get(i)instanceof GrassType && pokemon.get(i).isAtrapado()==true){
                                    System.out.println(i+". "+pokemon.get(i));
                                    cont++;
                                }
                            }
                            if(cont == 0){
                                System.out.println("No hay pokemon de tipo grass a modificar.");
                                break;
                            } 
                            System.out.println("Ingrese el pokemon que desea modificar: ");
                            int index_mod = leer.nextInt();
                            while(index_mod < 0 || index_mod >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_mod = leer.nextInt();
                            }
                            while(pokemon.get(index_mod)instanceof WaterType||pokemon.get(index_mod)instanceof FireType||pokemon.get(index_mod).isAtrapado()==false){
                                System.out.println("El pokemon escojido no es un grass type o no ha sido atrapado! Ingrese de nuevo: ");
                                index_mod = leer.nextInt();
                                while(index_mod< 0 || index_mod >= pokemon.size()){
                                System.out.println("Index fuera de rango! Ingrese de nuevo!");
                                index_mod = leer.nextInt();
                                }
                            }
                            System.out.println("Que desea modificar?");
                            System.out.println("1. Nombre.");
                            System.out.println("2. Numero de entrada en la pokedex.");
                            System.out.println("3. Habitat.");
                            int opcion_submenu = leer.nextInt();
                            while(opcion_submenu > 3|| opcion_submenu < 0){
                                System.out.println("Opcion invalida! Ingrese de nuevo:");
                                opcion_submenu = leer.nextInt();
                            }
                            if(opcion_submenu == 1){
                                System.out.println("Ingrese el nuevo nombre: ");
                                String nuevo_nombre = leerS.nextLine();
                                ((GrassType)pokemon.get(index_mod)).setNombre(nuevo_nombre);    
                            }else if(opcion_submenu == 2){
                                System.out.println("Ingrese el nuevo numero: ");
                                int nuevo_num = leer.nextInt();
                                ((GrassType)pokemon.get(index_mod)).setNum_pokedex(nuevo_num);
                            }else{
                                System.out.println("Ingrese el nuevo habitat: ");
                                String habitat_nuevo = leerS.nextLine();
                                ((GrassType)pokemon.get(index_mod)).setHabitat(habitat_nuevo);
                            }
                        }   
                    }
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
