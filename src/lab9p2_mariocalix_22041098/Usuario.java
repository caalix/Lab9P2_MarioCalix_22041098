/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_mariocalix_22041098;

import java.util.Vector;

/**
 *
 * @author mario
 */
public class Usuario {

    private String nick, contrasena, nombre,edad;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public static int verificarUsuarioNuevo(String usuario) {
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(usuario)) {
                return i;
            }
        }
        return -1;
    }

    public static int verificarLogueo(String usuario, String contrasena) {
        Vector lista = mostrar();
        Usuario obj;
        for (int i = 0; i < lista.size(); i++) {
            obj = (Usuario) lista.elementAt(i);
            if (obj.getNick().equalsIgnoreCase(usuario) && obj.getContrasena().equalsIgnoreCase(contrasena)) {
                return i;
            }
        }
        return -1;
    }

    public static Vector mostrar() {
        return ListaaUsuario.mostrar();
    }
    
    
}
