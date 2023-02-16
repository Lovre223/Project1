package edunova.obrada;

import java.util.ArrayList;
import java.util.List;

import edunova.Pomocno;
import edunova.Start;
import edunova.model.Polaznik;
import edunova.model.Smjer;

public class Polaznici {

	private List<Polaznik> polaznici;
	private Start start;

	public Polaznici(List<Polaznik> polaznici, Start start) {
		super();
		this.polaznici = polaznici;
		this.start = start;
		testPodaci();
	}

	public Polaznici(Start start) {
		super();
		this.start = start;
		polaznici = new ArrayList<>();
		testPodaci();
	}

	private void testPodaci() {
		if(Pomocno.DEV) {
			
			polaznici.add(new Polaznik(1, "Joisp", "Balog", "321123123212", "jbalog@gmail.com","2023/1"));
			polaznici.add(new Polaznik(2, "Ana", "Anic", "321123123213", "anaanic@gmail.com","2023/1"));
			
		}
		
	}

	public List<Polaznik> getPolaznici() {
		return polaznici;
	}

	public void setPolaznici(List<Polaznik> polaznici) {
		this.polaznici = polaznici;
	}
	
	public void izbornik() {

		System.out.println("");
		System.out.println("Polaznik izbornik");
		System.out.println("Dostupne opcije");
		System.out.println("1. Pregled svih polaznika");
		System.out.println("2. Unos novog polaznika");
		System.out.println("3. Promjena postojećeg polaznika");
		System.out.println("4. Brisanje polazika");
		System.out.println("5. Povratak na glavni izbornik");

		odabirizbornik();
	}
	
	private void odabirizbornik() {
		switch (Pomocno.unosBrojRaspon("Odaberi opciju", 1, 5)) {
		case 1:
			pregled(true);
			break;
		case 2:
			unosNovog();
			break;
		case 5:
			start.glavniIzbornik();

		}
	}
	
	private void unosNovog() {
		polaznici.add(unospolaznika());
		
		izbornik();
	}

	private Polaznik unospolaznika() {
		Polaznik p = new Polaznik();
		
		p.s
		
		
		return null;
	}

	public void pregled(boolean prikaziIzbornik) {
		System.out.println("Smjerovi u aplikaciji");
		int rb = 1;
		for (Polaznik p : polaznici) {
			System.err.println(rb++ + ". " + p);
		}

		System.out.println("---------");

		if (prikaziIzbornik) {

			izbornik();
		}
	}


}
