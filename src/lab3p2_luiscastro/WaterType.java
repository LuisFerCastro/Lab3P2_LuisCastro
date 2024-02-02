/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luiscastro;

/**
 *
 * @author lfern
 */
public class WaterType extends Pokemon {
    private boolean fuera_agua;
    private int velocidad;

    public WaterType(boolean fuera_agua, int velocidad, String nombre, int num_pokedex, String naturaleza, boolean atrapado, Pokeball poke) {
        super(nombre, num_pokedex, naturaleza, atrapado);
        this.fuera_agua = fuera_agua;
        this.velocidad = velocidad;
    }

    public boolean isFuera_agua() {
        return fuera_agua;
    }

    public void setFuera_agua(boolean fuera_agua) {
        this.fuera_agua = fuera_agua;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "WaterType{" + "fuera_agua=" + fuera_agua + ", velocidad=" + velocidad + '}';
    }
    
    
}
