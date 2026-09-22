package ej_ejanonima4;

public class Main {
 
	public static void main(String[] args) {
		AlumnoRepository ar = new AlumnoRepository();

		ar.guardar(new Alumno("12345678A", "Paco", 7));
		ar.guardar(new Alumno("87654321B", "Marta", 9));
		ar.guardar(new Alumno("13578642C", "Pepe", 3));
		ar.guardar(new Alumno("24687531D", "Lara", 10));


		ar.buscarPorDni("12345678A", new AccionAlumno() {
			@Override
			public void ejecutar(Alumno alumno) {
				System.out.println("Datos del alumno encontrado: " + alumno);
			}
		});

		ar.buscarPorDni("13578642C", new AccionAlumno() {
			@Override
			public void ejecutar(Alumno alumno) {
				alumno.setNota(5);
				System.out.println("Nota modificada. Alumno actualizado: " + alumno);
			}
		});

		ar.buscarPorDni("24687531D", new AccionAlumno() {
			@Override
			public void ejecutar(Alumno alumno) {
				if (alumno.getNota() >= 9) {
					System.out.println(alumno.getNombre() + " tiene una calificación excelente.");
				} else {
					System.out.println(alumno.getNombre() + " no tiene una calificación excelente.");
				}
			}
		});
	}
}
