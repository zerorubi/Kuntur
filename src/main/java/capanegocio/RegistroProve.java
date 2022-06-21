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
public class RegistroProve {
    
    public Administrador administra;
    public ArrayList<Paquete> incluir = new ArrayList();
    public ArrayList<Proveedor> abarcar = new ArrayList();
    
    private String id;
    private String tipoPaquete;
    private String nombreProveedores;
    private int nroPaquetes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    public String getNombreProveedores() {
        return nombreProveedores;
    }

    public void setNombreProveedores(String nombreProveedores) {
        this.nombreProveedores = nombreProveedores;
    }

    public int getNroPaquetes() {
        return nroPaquetes;
    }

    public void setNroPaquetes(int nroPaquetes) {
        this.nroPaquetes = nroPaquetes;
    }
}
