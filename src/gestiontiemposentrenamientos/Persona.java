/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontiemposentrenamientos;

import java.util.Date;

/**
 *
 * @author Pablo Ugalde Trejos
 */
public class Persona {
    public Persona() {}
    private int identificacion; //variable para numero de identificacion
    private String nombre; //variable para nombre
    private String apellido; //variable para apellido1
    private char sexo; //variable para sexco
    private int edad; //variable para edad
    private Date fechanacimiento; //variable para la fecha de nacimiento
    private Atleta atleta; //variable para atleta

    public int getIdentificacion() {return identificacion;}
    public void setIdentificacion(int identificacion) {this.identificacion = identificacion;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public char getSexo() {return sexo;}
    public void setSexo(char sexo) {this.sexo = sexo;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public Date getFechanacimiento() {return fechanacimiento;}
    public void setFechanacimiento(Date fechanacimiento) {this.fechanacimiento = fechanacimiento;}
    public Atleta getAtleta() {return atleta;}
    public void setAtleta(Atleta atleta) {this.atleta = atleta;}
}
