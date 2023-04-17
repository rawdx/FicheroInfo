
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		try {
			File f = new File("C:\\pruebas\\usuario.txt");
			Scanner sc = new Scanner(f);
			ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

			while (sc.hasNextLine()) {
				String[] linea = sc.nextLine().split(";");
				usuarios.add(new Usuario(linea[0], linea[1], linea[2]));
			}

			for (Usuario u : usuarios)
				System.out.println(u.toString());

			sc.close();

		} catch (FileNotFoundException fnfe) {
			System.out.print("[ERROR] - FICHERO NO ENCONTRADO: " + fnfe);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
