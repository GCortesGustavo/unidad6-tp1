package unidad6.tp1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Juan", 8.5));
        alumnos.add(new Alumno("María", 9.0));
        alumnos.add(new Alumno("Pedro", 7.5));
        alumnos.add(new Alumno("Lucía", 10.0));
        alumnos.add(new Alumno("Juan", 8.5));

        System.out.println("Lista de alumnos:");

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}