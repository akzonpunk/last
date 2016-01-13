package pe.edu.upeu.poo.clase1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
	String nombres;
	String apePATERNO;
	String apeMATERNO;
	Double altura;
	String DNI;
	String celular;
	Date fechadenacimiento;
	String email;
	String tipodesangre;
	String direccion;
	String religion;
	String sexo;
	String estadocivil;
	Boolean vive;

	public int getEdad() {
//		SimpleDateFormat adf = new SimpleDateFormat("yyyy");
//		Date now = new Date();
//		int añoActual = Integer.parseInt(adf.format(now));
//		int anioNacimiento = Integer.parseInt(FechaNaciniento); 
		return 0;
	}

	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apePATERNO=" + apePATERNO + ", apeMATERNO=" + apeMATERNO + ", altura="
				+ altura + ", DNI=" + DNI + ", celular=" + celular + ", fechadenacimiento=" + fechadenacimiento
				+ ", email=" + email + ", tipodesangre=" + tipodesangre + ", direccion=" + direccion + ", religion="
				+ religion + ", sexo=" + sexo + ", estadocivil=" + estadocivil + ", vive=" + vive + "]";
	}
}
