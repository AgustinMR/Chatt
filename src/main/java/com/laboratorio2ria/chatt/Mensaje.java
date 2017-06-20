package com.laboratorio2ria.chatt;

import java.io.Serializable;
import java.util.Calendar;

public class Mensaje implements Serializable {
    
    private String grupo;
    private String contenido;
    private String hora;
    private String autor;

    public Mensaje() {
    }

    public Mensaje(String grupo) {
        this.grupo = grupo;
    }

    public Mensaje(String grupo, String contenido, String autor) {
        this.grupo = grupo;
        this.contenido = contenido;
        this.autor = autor;
        this.hora = (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) + ":" + Calendar.getInstance().get(Calendar.MINUTE));
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
}
