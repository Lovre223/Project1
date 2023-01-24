package zavrsni;

public class Aviokompanija extends Entitet {

	private String naziv;

	public Aviokompanija() {
		super();
	}

	public Aviokompanija(int sifra, String naziv) {
		super(sifra);
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}
