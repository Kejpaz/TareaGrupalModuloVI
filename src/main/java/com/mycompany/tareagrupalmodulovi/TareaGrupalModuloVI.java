
package com.mycompany.tareagrupalmodulovi;

import helpers.Persona;
import helpers.Doctor;
import helpers.Deportista;

public class TareaGrupalModuloVI {


    public static void main(String[] args) {
        Doctor doctoruno = new Doctor("Kelvin Paz","Choloma", 60,"Cirugia Pediatrica");
        Deportista deportistauno = new Deportista("Jose Rivera","San Pedro Sula", 23, "Futbol");

        Persona[] personas = {doctoruno, deportistauno};

        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Residencia: " + persona.getResidencia());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println(persona.getInformacionPersonal()+"\n");
        }
    }
    }
