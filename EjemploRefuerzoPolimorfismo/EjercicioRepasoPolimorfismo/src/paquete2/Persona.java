/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    
    public Persona(String n, String a, String ide, int ed){
        nombre = n;
        apellido = a;
        cedula = ide;
        edad = ed;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerApellido(String a){
        apellido = a;
    }
    
    public void establecerCedula(String n){
        cedula = n;
    }
    
    public void establecerEdad(int e) {
        edad = e;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public int obtenerEdad() {
        return edad;
    }
    
}
