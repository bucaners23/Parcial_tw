package Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Alumno> listaAlumno=new ArrayList<Alumno>();
		int op=0;
		do {
			System.out.println("1.- Agregar alumno");
			System.out.println("2.- Ver alumno");
			System.out.println("3.- Salir");
			System.out.println("\nElige una opcion");
			op=in.nextInt();
			switch(op) {
			case 1:
				in.nextLine();
				Alumno x=new Alumno();
				System.out.println("Numero de control");
				x.setnumControl(in.nextLine());
				System.out.println("Nombre");
				x.setNom(in.nextLine());
				System.out.println("Apellido paterno");
				x.setAp(in.nextLine());
				System.out.println("Apellido materno");
				x.setAm(in.nextLine());
				System.out.println("Grupo");
				x.setGrupo(in.nextLine());
				System.out.println("Carrera");
				x.setCarrera(in.nextLine());
				System.out.println("Turno");
				x.setTurno(in.nextLine());
				listaAlumno.add(x);
				break;
			case 2:
				System.out.println("NUMCON\tNOMBRW\t\tGRUPO\tCARRERA\tTURNO");
				for(Alumno a: listaAlumno) {
					a.imprimirAlumno();
				}
				break;
			case 3:
				System.out.println("BYEEEEEEEE");
				default:
				System.out.println("ERROR 404 XD XD");
				break;



			}
		}while (op!=3);

	}

}
