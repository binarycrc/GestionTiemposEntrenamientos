/*
 * Copyright (C) 2019 Pablo Ugalde Trejos
 * UNIVERSIDAD ESTATAL A DISTANCIA
 * 00824 Programacion Intermedia
 */
package gestiontiemposentrenamientos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Pablo Ugalde Trejos
 */
public class Persona {
    public Persona() {}
    public Persona(int identificacion,String nombre,String apellido,char sexo,int edad,Date fechanacimiento) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.fechanacimiento = fechanacimiento;
    }    
    /*********************************/
    /* Atributos de la clase Persona */
    /*********************************/
    private int identificacion; //variable para numero de identificacion
    private String nombre; //variable para nombre
    private String apellido; //variable para apellido1
    private char sexo; //variable para sexco
    private int edad; //variable para edad
    private Date fechanacimiento; //variable para la fecha de nacimiento
    private Atleta atleta; //variable para atleta

    //metodo para retornar identificacion
    public int getIdentificacion() {return identificacion;}
    //metodo para asignar identificacion
    public void setIdentificacion(int identificacion) {this.identificacion = identificacion;}
    //metodo para retornar nombre
    public String getNombre() {return nombre;}
    //metodo para asignar nombre
    public void setNombre(String nombre) {this.nombre = nombre;}
    //metodo para retornar apellido
    public String getApellido() {return apellido;}
    //metodo para asignar apellido
    public void setApellido(String apellido) {this.apellido = apellido;}
    //metodo para retornar sexo
    public char getSexo() {return sexo;}
    //metodo para asignar sexo
    public void setSexo(char sexo) {this.sexo = sexo;}
    //metodo para retornar edad
    public int getEdad() {return edad;}
    //metodo para asignar edad
    public void setEdad(int edad) {this.edad = edad;}
    //metodo para asignar edad calculado con la fecha de nacimiento
    public void setEdadDiff(Date fechanacimiento) {
        Calendar bdate = Calendar.getInstance();
        bdate.setTime(fechanacimiento);
        
        Calendar cdate = Calendar.getInstance();
        cdate.setTime(new Date());
        int diff = cdate.get(Calendar.YEAR)-bdate.get(Calendar.YEAR);
        this.edad = diff;
    }
    //metodo para retornar fecha de nacimiento
    public Date getFechanacimiento() {return fechanacimiento;}
    //metodo para retornar fecha de nacimiento como string
    public String getFechanacimientoStrFormat() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
        String strDate = dateFormat.format(fechanacimiento);  
        return strDate;
    }
    //metodo para asignar fecha de nacimiento
    public void setFechanacimiento(Date fechanacimiento) {this.fechanacimiento = fechanacimiento;}
    //metodo para asignar atleta
    public void setAtleta(Atleta atleta){this.atleta = atleta;}
    //metodo para retornar atleta
    public Atleta getAtleta(){ return atleta;}
    //metodo para asignar atleta
    public void guardar(){
        
    }
    
}
