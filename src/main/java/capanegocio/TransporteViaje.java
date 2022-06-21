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
public class TransporteViaje {
    public ArrayList<Asiento> corresponde = new ArrayList();
    public Empresa pertenece;
    public Horario concierne;
    public ArrayList<Paquete> tiene = new ArrayList();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private String tipo;
}
