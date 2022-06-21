/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

import java.util.ArrayList;

/**
 *
 * @author rubiw
 */
public class Hotel {
    
    public ArrayList<Paquete> pertenece = new ArrayList();
    
    private String nombre;
    private String ubicacion;
    private int nroHabitaciones;
    private int nroCama;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNroHabitaciones() {
        return nroHabitaciones;
    }

    public void setNroHabitaciones(int nroHabitaciones) {
        this.nroHabitaciones = nroHabitaciones;
    }

    public int getNroCama() {
        return nroCama;
    }

    public void setNroCama(int nroCama) {
        this.nroCama = nroCama;
    }
}
