/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Danilore
 */
public class Departamento {
    private String id;
    private String nombre;
    private long poblacion_estimada;
    private double tarifa;

    public Departamento() {
    }

    public Departamento(String id, String nombre, long poblacion_estimada, double tarifa) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion_estimada = poblacion_estimada;
        this.tarifa = tarifa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPoblacion_estimada() {
        return poblacion_estimada;
    }

    public void setPoblacion_estimada(long poblacion_estimada) {
        this.poblacion_estimada = poblacion_estimada;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    

    
}
