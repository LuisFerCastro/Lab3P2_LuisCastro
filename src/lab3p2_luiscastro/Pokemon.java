/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luiscastro;

/**
 *
 * @author lfern
 */
public class Pokemon {
    protected String nombre;
    protected int num_pokedex;
    protected String naturaleza;
    protected boolean atrapado = false;
    protected Pokeball poke;

    public Pokemon(String nombre, int num_pokedex, String naturaleza, boolean atrapado) {
        this.nombre = nombre;
        this.num_pokedex = num_pokedex;
        this.naturaleza = naturaleza;
        this.atrapado = atrapado;
    }

    public Pokemon(Pokeball poke) {
        this.poke = poke;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public Pokeball getPoke() {
        return poke;
    }

    public void setPoke(Pokeball poke) {
        this.poke = poke;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", num_pokedex=" + num_pokedex + ", naturaleza=" + naturaleza + ", atrapado=" + atrapado + ", poke=" + poke + '}';
    }
    
}
