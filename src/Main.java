import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner1 = new Scanner(new File("H6_a.txt"));
		Scanner scanner2 = new Scanner(new File("H6_c.txt"));

		List<Predmet> predmety = new ArrayList<>();

		while (scanner1.hasNextLine()) {
			double vaha = Double.parseDouble(scanner1.nextLine());
			double cena = Double.parseDouble(scanner2.nextLine());

			Predmet predmet = new Predmet(cena, vaha);
			predmety.add(predmet);
		}

		Batoh batoh = new Batoh(predmety);
		batoh.run();
		System.out.println("===VYSLEDOK===");
		System.out.println(batoh);
		System.out.println("===VYSLEDOK===");
	}
}
