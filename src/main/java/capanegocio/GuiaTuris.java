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
public class GuiaTuris {
    
    public ArrayList<Paquete> corresponde = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAnioExp() {
        return anioExp;
    }

    public void setAnioExp(int anioExp) {
        this.anioExp = anioExp;
    }
    private String nombre;
    private String apellidos;
    private String dni;
    private String idioma;
    private int anioExp;
}
