package zavrsni;

import java.time.Duration;
import java.util.Date;

public class Let extends Entitet {

	private int br_leta;
	private Date vrijeme_dolaska;
	private Date vrijeme_polaska;
	private double cijena;
	private String luka_polazak;
	private String luka_dolazak;
	private Duration trajanje_leta;
	private String klasa;
	private int avion;
	private int aviokompanija;

	public Let() {
		super();
	}

	public Let(int sifra, int br_leta, Date vrijeme_dolaska, Date vrijeme_polaska, double cijena, String luka_polazak,
			String luka_dolazak, Duration trajanje_leta, String klasa, int avion, int aviokompanija) {
		super(sifra);
		this.br_leta = br_leta;
		this.vrijeme_dolaska = vrijeme_dolaska;
		this.vrijeme_polaska = vrijeme_polaska;
		this.cijena = cijena;
		this.luka_polazak = luka_polazak;
		this.luka_dolazak = luka_dolazak;
		this.trajanje_leta = trajanje_leta;
		this.klasa = klasa;
		this.avion = avion;
		this.aviokompanija = aviokompanija;
	}

	public int getBr_leta() {
		return br_leta;
	}

	public void setBr_leta(int br_leta) {
		this.br_leta = br_leta;
	}

	public Date getVrijeme_dolaska() {
		return vrijeme_dolaska;
	}

	public void setVrijeme_dolaska(Date vrijeme_dolaska) {
		this.vrijeme_dolaska = vrijeme_dolaska;
	}

	public Date getVrijeme_polaska() {
		return vrijeme_polaska;
	}

	public void setVrijeme_polaska(Date vrijeme_polaska) {
		this.vrijeme_polaska = vrijeme_polaska;
	}

	public double getCijena() {
		return cijena;
	}

	public void setCijena(double cijena) {
		this.cijena = cijena;
	}

	public String getLuka_polazak() {
		return luka_polazak;
	}

	public void setLuka_polazak(String luka_polazak) {
		this.luka_polazak = luka_polazak;
	}

	public String getLuka_dolazak() {
		return luka_dolazak;
	}

	public void setLuka_dolazak(String luka_dolazak) {
		this.luka_dolazak = luka_dolazak;
	}

	public Duration getTrajanje_leta() {
		return trajanje_leta;
	}

	public void setTrajanje_leta(Duration trajanje_leta) {
		this.trajanje_leta = trajanje_leta;
	}

	public String getKlasa() {
		return klasa;
	}

	public void setKlasa(String klasa) {
		this.klasa = klasa;
	}

	public int getAvion() {
		return avion;
	}

	public void setAvion(int avion) {
		this.avion = avion;
	}

	public int getAviokompanija() {
		return aviokompanija;
	}

	public void setAviokompanija(int aviokompanija) {
		this.aviokompanija = aviokompanija;
	}

}
