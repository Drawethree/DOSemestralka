public class Predmet {

	private double cena;
	private double vaha;

	public Predmet(double cena, double vaha) {
		this.cena = cena;
		this.vaha = vaha;
	}

	public double getCena() {
		return cena;
	}

	public double getVaha() {
		return vaha;
	}

	public double getKoeficient() {
		return this.cena / this.vaha;
	}

	@Override
	public String toString() {
		return "Predmet{" +
				"cena=" + cena +
				", vaha=" + vaha +
				", koeficient=" + getKoeficient() +
				"}";
	}


}
