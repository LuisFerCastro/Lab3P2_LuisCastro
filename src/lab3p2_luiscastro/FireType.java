/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luiscastro;

/**
 *
 * @author lfern
 */
public class FireType extends Pokemon {
   private int potencia_llamas;

    public FireType(int potencia_llamas, String nombre, int num_pokedex, String naturaleza, boolean atrapado) {
        super(nombre, num_pokedex, naturaleza, atrapado);
        this.potencia_llamas = potencia_llamas;
    }

    public int getPotencia_llamas() {
        return potencia_llamas;
    }

    public void setPotencia_llamas(int potencia_llamas) {
        this.potencia_llamas = potencia_llamas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Potencia_llamas = " + potencia_llamas;
    }

   
   
}
