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
public class RentaCoche {
    
    public ArrayList<Paquete> posee = new ArrayList();
    
    private String tipoCarro;
    private Time tiempo;

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public Time getTiempo() {
        return tiempo;
    }

    public void setTiempo(Time tiempo) {
        this.tiempo = tiempo;
    }

}
