/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luiscastro;

/**
 *
 * @author lfern
 */
public class GrassType extends Pokemon {
    private String habitat;
    private int dominio_plantas;

    public GrassType(String habitat, int dominio_plantas, String nombre, int num_pokedex, String naturaleza, boolean atrapado) {
        super(nombre, num_pokedex, naturaleza, atrapado);
        this.habitat = habitat;
        this.dominio_plantas = dominio_plantas;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDominio_plantas() {
        return dominio_plantas;
    }

    public void setDominio_plantas(int dominio_plantas) {
        this.dominio_plantas = dominio_plantas;
    }

    @Override
    public String toString() {
        return super.toString()+ " Habitat = " + habitat + ", Dominio_plantas = " + dominio_plantas;
    }
    
    
}
