import java.util.Comparator;
import java.util.List;

public class Batoh {

	private static final int MAX_PREDMETOV = 400;
	private static final int CAPACITY = 12_000;

	private List<Predmet> predmety;

	private double aktualnaHmotnost;
	private double hodnotaUF;

	public Batoh(List<Predmet> predmets) {
		this.predmety = predmets;
		this.aktualnaHmotnost = this.predmety.stream().mapToDouble(Predmet::getVaha).sum();
		this.hodnotaUF = this.predmety.stream().mapToDouble(Predmet::getCena).sum();
		this.predmety.sort(Comparator.comparing(Predmet::getKoeficient));

		System.out.println("====INIT====");
		System.out.println("Pocet predmetov v batohu: " + predmety.size());
		System.out.println("Aktualna hmotnost: " + aktualnaHmotnost);
		System.out.println("Aktualna UF: " + hodnotaUF);
		System.out.println("====INIT====");

	}


	public void run() {

		System.out.println("====RUN====");

		while (this.predmety.size() > MAX_PREDMETOV || this.aktualnaHmotnost > CAPACITY) {
			Predmet toRemove = this.predmety.remove(0);
			this.aktualnaHmotnost -= toRemove.getVaha();
			this.hodnotaUF -= toRemove.getCena();
			System.out.println("Vyhadzujem predmet: " + toRemove.toString());
			System.out.println("Pocet Predmetov: " + this.predmety.size());
			System.out.println("Aktualna hmotnost: " + this.aktualnaHmotnost);
			System.out.println("Ucelova funkcia: " + this.hodnotaUF);
		}
		System.out.println("====RUN====");

	}

	public double getAktualnaHmotnost() {
		return aktualnaHmotnost;
	}

	public double getHodnotaUF() {
		return hodnotaUF;
	}

	public int getPocetPredmetov() {
		return this.predmety.size();
	}

	@Override
	public String toString() {
		return "Batoh{" +
				"pocetPredmetov=" + getPocetPredmetov() +
				", aktualnaHmotnost=" + this.aktualnaHmotnost +
				", hodnotaUF=" + this.hodnotaUF +
				'}';
	}
}
