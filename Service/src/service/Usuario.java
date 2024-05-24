package service;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author YOLIMAR
 */
public class Usuario {

    private String nombre;
    private String apellidos;
    private String email;
    private int telefono;
    private String usuario;
    private String contrasena;

    /**
     * Constructores de variables que agregaremos en la tabla Campos que usuario
     * debe rellenar todos los campos son obligatorios
     *
     * @param nombre del usuario.
     * @param apellidos del usuario / puede ser uno o dos.
     * @param email del usuario.
     * @param telefono del usuario.
     * @param usuario del usuario para poder loguearse cuando quiera entrar al
     * sistema.
     * @param contrasena del usuario, que debe crear combinando números y
     * letras.
     */
    public Usuario(String nombre, String apellidos, String email, int telefono, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Usuario() {
       
    }

     /**
     * Setters asignamos o cambiamos su valor de las variables.
     *
     * @param nombre asignaremos o cambiaremos el valor de la variable
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setters asignamos o cambiamos su valor de las variables.
     *
     * @param apellidos asignaremos o cambiaremos el valor de la variable
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Setters asignamos o cambiamos su valor de las variables.
     *
     * @param email asignaremos o cambiaremos el valor de la variable
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Setters asignamos o cambiamos su valor de las variables.
     *
     * @param telefono asignaremos o cambiaremos el valor de la variable
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Setters asignamos o cambiamos su valor de las variables.
     *
     * @param usuario asignaremos o cambiaremos el valor de la variable
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Setters asignamos o cambiamos su valor de las variables.
     *
     * @param contrasena asignaremos o cambiaremos el valor de la variable
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Getters obtenemos los datos de las variables.
     *
     * @return el nombre como un string, valor tipo cadena
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getters obtenemos los datos de las variables.
     *
     * @return apellidos como un string, valor tipo cadena
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Getters obtenemos los datos de las variables.
     *
     * @return email como un string, valor tipo cadena
     */
    public String getEmail() {
        return email;
    }

    /**
     * Getters obtenemos los datos de las variables.
     *
     * @return telefono como un string, valor tipo cadena
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Getters obtenemos los datos de las variables.
     *
     * @return usuario como un string, valor tipo cadena
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Getters obtenemos los datos de las variables.
     *
     * @return contrasena como un string, valor tipo cadena
     */
    public String getContrasena() {
        return contrasena;
    }
    
    /**
     * Método Guardar que usamos en la clase inicio para guardar archivos.
     *
     * @return nombre,apellidos, email, usuario, contrasena como un string,
     * valor tipo cadena, y telefono como entero.
     */
    void guardar(PrintWriter escribe) {
        escribe.println(nombre);
        escribe.println(apellidos);
        escribe.println(email);
        escribe.println(telefono);
        escribe.println(usuario);
        escribe.println(contrasena);
    }

    /**
     * Método Cargar los datos.
     *@param almacen
     * @return nombre,apellidos, email, usuario, contrasena como un string,
     * valor tipo cadena, y telefono como entero.
     */
   public Usuario cargar (BufferedReader almacen){
        String nom, apel, ema, usua, cont;
        int tel;
       try {
           nom = almacen.readLine();
           apel = almacen.readLine();
           ema = almacen.readLine();
           tel = Integer.parseInt(almacen.readLine());
           usua= almacen.readLine();
           cont = almacen.readLine();
           return new Usuario(nom, apel, ema, tel, usua, cont);
        } catch (Exception e) {
            
        }
        return null;
    }
}
