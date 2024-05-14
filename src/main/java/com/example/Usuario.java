package com.example;

public class Usuario {

    private String nombreUsuario;
    private double contraseña;

    public Usuario(String nombreUsuario, double contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public void setNombreUsuario(){
        this.nombreUsuario = nombreUsuario;
    }
    public double getContraseña(){
        return contraseña;
    }

    public void setContraseña(double contraseña) {
        this.contraseña = contraseña;
    }
}


