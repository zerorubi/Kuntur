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
public class Horario {
    
    public ArrayList<TransporteViaje> concierne = new ArrayList();
    
    private Time horaSalida;
    private Time horaLlegada;
    private Time tiempoViaje;

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Time getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Time horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Time getTiempoViaje() {
        return tiempoViaje;
    }

    public void setTiempoViaje(Time tiempoViaje) {
        this.tiempoViaje = tiempoViaje;
    }
}
