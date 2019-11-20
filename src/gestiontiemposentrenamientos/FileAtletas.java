/*
 * Copyright (C) 2019 Pablo Ugalde Trejos
 * UNIVERSIDAD ESTATAL A DISTANCIA
 * 00824 Programacion Intermedia
 */
package gestiontiemposentrenamientos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Ugalde Trejos
 */
public class FileAtletas {

    private static String archivo = "ControlEntrenamiento.dat";
    private final File file = new File(archivo);//// crea un objeto File con base en el valor de la variable archivo
    private Scanner lectura;//La clase Scanner se utiliza en forma extensa para recibir datos del teclado y también puede leer datos de un archivo
    private Formatter escritura;// La clase Formatter permite mostrar datos con formato en la pantalla, o enviarlos a un archivo

    public void crear_archivo() {
        try {
            if (file.exists()) {// si existe el nombre, muestra información sobre él
                FileAtletas archivos = new FileAtletas();//Crear el objeto de la clase Archivo Records
                archivos.abrir_archivoLectura();
                archivos.LeerRecords();//leer la lista
                archivos.cerrarArchivoLectura();
            } else {
                JOptionPane.showMessageDialog(null, "El archivo con el nombre: " + file.getName() + " se creara" + "\nEn la ruta: \n" + file.getAbsolutePath());
                PrintWriter writer = new PrintWriter(archivo, "UTF-8");
                writer.close();
            }
        } catch (SecurityException securityException) {
            System.err.println("No tiene acceso de escritura a este archivo.\n"+securityException.toString());
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {// Si no puede encontrarse el archivo, ocurre una excepción tipo FileNotFoundException
            System.err.println("Error al crear el archivo.\n"+filesNotFoundException.toString());
            System.exit(1);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FileAtletas.class.getName()).log(Level.SEVERE, null, ex);
        } // fin de catch // fin de catch

    }

    public void abrir_archivoLectura() {
        try {
            lectura = new Scanner(file);//vincula al archivo txt
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public void abrir_archivoEscritura() {
        try {
            escritura = new Formatter(file);//vincula al archivo txt       
        } catch (SecurityException securityException) {
            System.err.println("No tiene acceso de escritura a este archivo.\n"+securityException.toString());
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {// Si no puede encontrarse el archivo, ocurre una excepción tipo FileNotFoundException
            System.err.println("Error al crear el archivo.\n"+filesNotFoundException.toString());
            System.exit(1);
        } // fin de catch
    }

    public void LeerRecords() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Vista.ListaAtletas.clear();
            while (lectura.hasNext()) {// elementos de lectura
                Atleta atleta = new Atleta();// crea el contenido del jugador
                atleta.setIdentificacion(lectura.nextInt());
                atleta.setNombre(lectura.next());
                atleta.setApellido(lectura.next());
                atleta.setSexo(lectura.next().charAt(0));
                atleta.setEdad(lectura.nextInt());
                atleta.setFechanacimiento(dateFormat.parse(lectura.next()));
                atleta.setIdatleta(lectura.nextInt());
                atleta.setNivel(Atleta.Nivel.valueOf(lectura.next()));
                Vista.ListaAtletas.add(atleta);
            }
        } catch (NoSuchElementException elementException) {//si los datos se encuentran en el formato incorrecto
            System.err.println("El archivo no esta bien formado.\n"+elementException.toString());
            lectura.close();
            System.exit(1);
        } catch (IllegalStateException stateException) {// Si el objeto Scanner se cerró antes de introducir los datos, se produce una excepción tipo IllegalStateException
            System.err.println("Error al leer del archivo.\n"+stateException.toString());
            System.exit(1);
        } catch (ParseException ex) {
            Logger.getLogger(FileAtletas.class.getName()).log(Level.SEVERE, null, ex);
        } // fin de catch // fin de catch
    }

    public void escribirRecords() {
        try {
            for (Atleta elemento : Vista.ListaAtletas) {
                escritura.format(" %d %s %s %s %d %s %d %s " + System.lineSeparator()
                        , elemento.getIdentificacion()
                        , elemento.getNombre()
                        , elemento.getApellido()
                        , elemento.getSexo()
                        , elemento.getEdad()
                        , elemento.getFechanacimientoStrFormat()
                        , elemento.getIdatleta()
                        , elemento.getNivel()
                );
            }
        } catch (FormatterClosedException formatterClosedException) {//Se produce una excepción no verificada cuando el formateador se ha cerrado.
            System.err.println("Error al escribir en el archivo.\n"+formatterClosedException.toString());
        } // fin de catch 
        catch (NoSuchElementException elementException) {
            System.err.println("Datos en el Formato Incorrecto.\n"+elementException.toString());//si los datos se encuentran en el formato incorrecto
        } // fin de catch
    }

    public void cerrarArchivoLectura() {
        try {
            if (lectura != null) {
                lectura.close();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public void cerrarArchivoEscritura() {
        try {
            if (escritura != null) {//cerrar los archivos
                escritura.close();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
}
