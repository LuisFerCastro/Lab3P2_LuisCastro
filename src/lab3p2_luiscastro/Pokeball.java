/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_luiscastro;

/**
 *
 * @author lfern
 */
public class Pokeball {
    private String color;
    private int num_serie;
    private int eficiencia;

    public Pokeball(String color, int num_serie, int eficiencia) {
        this.color = color;
        this.num_serie = num_serie;
        this.eficiencia = eficiencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {
        return "Pokeball: " + "Color = " + color + ", Num_serie = " + num_serie + ", Eficiencia = " + eficiencia;
    }
    
    
}
