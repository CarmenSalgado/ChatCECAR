/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cecar.modelo;

/**
 *
 * @author 1104427192
 */
public class Mensaje {
    
    private byte [] multimedia;
    private String texto;

    public Mensaje(byte[] multimedia, String texto) {
        this.multimedia = multimedia;
        this.texto = texto;
    }

    public byte[] getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(byte[] multimedia) {
        this.multimedia = multimedia;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

   
    
    
    
    
}
