package zavrsni;

public class Rezervacija extends Entitet {

	private int let;
	private int korisnik;
	private String klasa;

	public Rezervacija() {
		super();
	}

	public Rezervacija(int sifra, int let, int korisnik, String klasa) {
		super(sifra);
		this.let = let;
		this.korisnik = korisnik;
		this.klasa = klasa;
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

	public String getKlasa() {
		return klasa;
	}

	public void setKlasa(String klasa) {
		this.klasa = klasa;
	}

}
