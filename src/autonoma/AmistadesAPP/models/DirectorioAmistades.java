/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.AmistadesAPP.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sant9
 */
    public class DirectorioAmistades {
    private List<Amigo> amigos;

    public DirectorioAmistades() {
        this.amigos = new ArrayList<>();
    }

    public List<Amigo> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Amigo> amigos) {
        this.amigos = amigos;
    }

    public boolean agregarAmigo(Amigo amigo) {
        if (validarCorreo(amigo.getCorreo()) && validarTelefono(amigo.getTelefono())) {
            return amigos.add(amigo);
        }
        return false;
    }

    public Amigo buscarAmigo(String correo) {
        for (Amigo amigo : amigos) {
            if (amigo.getCorreo().equals(correo)) {
                return amigo;
            }
        }
        return null;
    }

    public boolean validarTelefono(String telefono) {
        return (telefono.startsWith("606") || telefono.startsWith("30")) && telefono.matches("\\d{10}");
    }

    public boolean validarCorreo(String correo) {
        return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"); // Validación básica de email
    }
}
