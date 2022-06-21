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
public class Seguro {
    
    public ArrayList<Paquete> contiene = new ArrayList();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private String tipo;
}
