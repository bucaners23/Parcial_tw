package Alumno;

public class Alumno {
	String numControl;
	String nom;
	String ap;
	String am;
	String grupo;
	String carrera;
	String turno;
	public Alumno(String nom, String ap, String am, String grupo, String carrera, String turno) {
		this.numControl=numControl;
		this.nom = nom;
		this.ap = ap;
		this.am = am;
		this.grupo = grupo;
		this.carrera = carrera;
		this.turno = turno;
	}
	public Alumno() {
		
	}
	public String numControl() {
		return numControl;
	}
	public void setnumControl(String numControl) {
		this.numControl = numControl;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAp() {
		return ap;
	}
	public void setAp(String ap) {
		this.ap = ap;
	}
	public String getAm() {
		return am;
	}
	public void setAm(String am) {
		this.am = am;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public void imprimirAlumno() {
		System.out.println(numControl+"\t"+nom+"\t"+ap+"\t"+am+"\t"+grupo+"\t"+carrera+turno);
	}
	

}
