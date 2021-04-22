/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;
/**
 *
 * @author David Nava
 */
public class DatosAlumnos {
    String Nombre;
    String APaterno;
    String AMaterno;
    String Edad;
    String Sexo;
    String Numero;
    String Direccion;
    String Telefono;
    public DatosAlumnos(String Nombre,String APaterno,String AMaterno,String Edad,
                       String Sexo,String Numero,String Direccion,String Telefono){
    this.Nombre=Nombre;
    this.APaterno=APaterno;
    this.AMaterno=AMaterno;
    this.Edad=Edad;
    this.Sexo=Sexo;
    this.Numero=Numero;
    this.Direccion=Direccion;
    this.Telefono=Telefono;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAPaterno() {
        return APaterno;
    }

    public void setAPaterno(String APaterno) {
        this.APaterno = APaterno;
    }

    public String getAMaterno() {
        return AMaterno;
    }

    public void setAMaterno(String AMaterno) {
        this.AMaterno = AMaterno;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
}
