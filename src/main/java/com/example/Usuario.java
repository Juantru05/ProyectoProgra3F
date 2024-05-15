package com.example;

import java.util.HashMap;
import java.util.Scanner;

public class Usuario {
    private String nombre;
    private String contrasena;
    private static  HashMap<String, String> usuriosReguistrados = new HashMap<>();

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        agregarUsuario(nombre,contrasena);
    }

    //metodos get y set para nombre y contraseña
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    //metodo para agregar usuario al Hashmap
    private  void agregarUsuario(String nombre, String contrasena){
        usuriosReguistrados.put(nombre, contrasena);
    }

    //metodo para verificar contraseña
    public boolean verificarContrasena(String contrasenaIngresada){
        return  this.contrasena.equals(contrasenaIngresada);
    }

    public  static void  agregarNuevoUsuario(String nombre, String contrasena){
        if (!usuriosReguistrados.containsKey(nombre)){
            usuriosReguistrados.put(nombre, contrasena);
            System.out.println(" Usuario agregado: " + nombre);
        } else {
            System.out.println("El usuario ya existe");
        }
    }

    public  void crearUsuario(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de nuevo usuario");
        System.out.print("Ingrese el nombre de usuario: ");
        String nombre = scanner.nextLine();


        System.out.print("Ingrese la contraseña : ");
        String contrasena = scanner.nextLine();

        Usuario.agregarNuevoUsuario(nombre, contrasena);

        scanner.close();

    }


}




