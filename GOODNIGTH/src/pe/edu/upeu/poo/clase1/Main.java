package pe.edu.upeu.poo.clase1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {

		Persona akzon = new Persona();
		akzon.nombres = "akzon punk ";
		akzon.apeMATERNO = "akzon firts";
		akzon.apePATERNO = "akzon last";
		akzon.celular = "900000";
		akzon.direccion = "orasterr";
		akzon.altura = 1.78;
		akzon.email = "j gggg";
		akzon.estadocivil = "the end";
		akzon.religion = "catolico";
		akzon.DNI = "70229012";
		akzon.tipodesangre = "positivo";
		akzon.sexo = "masculino";
		akzon.vive = true;

		SimpleDateFormat adf = new SimpleDateFormat("dd/MM/YYYY");
		try {
			akzon.fechadenacimiento = adf.parse("12/12/2000");
		} catch (ParseException j) {
			j.printStackTrace();
		}

		System.out.println(akzon);
	}

}
