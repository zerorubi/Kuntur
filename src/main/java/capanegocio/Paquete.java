/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capanegocio;

import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author rubiw
 */
public class Paquete {
    
    public ArrayList<Seguro> contiene = new ArrayList();
    public ArrayList<Hotel> pertenece = new ArrayList();
    public ArrayList<GuiaTuris> corresponde = new ArrayList();
    public ArrayList<TransporteViaje> tiene = new ArrayList();
    public RentaCoche posee;
    public RegistroProve incluir;
    public Reserva competer;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Time getTiempo() {
        return tiempo;
    }

    public void setTiempo(Time tiempo) {
        this.tiempo = tiempo;
    }
    private String nombre;
    private String destino;
    private String origen;
    private double costo;
    private Time tiempo;
}
