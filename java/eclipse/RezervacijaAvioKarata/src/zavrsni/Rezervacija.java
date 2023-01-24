package zavrsni;

public class Rezervacija extends Entitet {

	private int let;
	private int korisnik;

	public Rezervacija() {
		super();
	}

	public Rezervacija(int let, int korisnik) {
		super();
		this.let = let;
		this.korisnik = korisnik;
	}

	public int getLet() {
		return let;
	}

	public void setLet(int let) {
		this.let = let;
	}

	public int getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(int korisnik) {
		this.korisnik = korisnik;
	}

}
