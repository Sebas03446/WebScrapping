/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

/**
 *
 * @author Familia
 */
public class ElementoC {
    String prefijo;
    String grupo;
    String periodo;
    String pesoAtómico;
    String densidad;
    String año;
    String descubridores;
    String origen;

    public ElementoC(String prefijo, String grupo, String periodo, String pesoAtómico, String densidad, String año, String descubridores, String origen) {
        this.prefijo = prefijo;
        this.grupo = grupo;
        this.periodo = periodo;
        this.pesoAtómico = pesoAtómico;
        this.densidad = densidad;
        this.año = año;
        this.descubridores = descubridores;
        this.origen = origen;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPesoAtómico() {
        return pesoAtómico;
    }

    public void setPesoAtómico(String pesoAtómico) {
        this.pesoAtómico = pesoAtómico;
    }

    public String getDensidad() {
        return densidad;
    }

    public void setDensidad(String densidad) {
        this.densidad = densidad;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDescubridores() {
        return descubridores;
    }

    public void setDescubridores(String descubridores) {
        this.descubridores = descubridores;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return prefijo+"     "+ grupo+"     "+periodo+"     "+pesoAtómico+"     "+densidad+"     "+año+"     "+descubridores+"     "+origen; //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
    
    
    
}
