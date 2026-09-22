package ej_ejanonima4;

import java.util.ArrayList;

public class AlumnoRepository {
	private ArrayList<Alumno> aAlumnos = new ArrayList<>();
	private boolean encontrado = false;

	public void guardar(Alumno alumno) {
		aAlumnos.add(alumno);
	}

	public void buscarPorDni(String dni, AccionAlumno accion) {
		for(int i = 0; i < aAlumnos.size() && !encontrado; i++) {
			if (aAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				accion.ejecutar(aAlumnos.get(i));
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("DNI no encontrado.");
		}
		encontrado = false;
	}
}