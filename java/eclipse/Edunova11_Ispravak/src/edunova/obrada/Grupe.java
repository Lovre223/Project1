package edunova.obrada;

import java.util.ArrayList;
import java.util.List;

import edunova.Pomocno;
import edunova.Start;
import edunova.model.Grupa;
import edunova.model.Smjer;

public class Grupe {

	private List<Grupa> grupe;
	private Start start;

	public Grupe(Start start) {
		super();
		this.start = start;
		grupe = new ArrayList<>();
		// napraviti testne pdatke
	}

	public Grupe(List<Grupa> grupe, Start start) {
		super();
		this.grupe = grupe;
		this.start = start;
	}

	public void izbornik() {

		System.out.println("");
		System.out.println("Smjer Grupe");
		System.out.println("Dostupne opcije");
		System.out.println("1. Pregled svih grupa");
		System.out.println("2. Unos novog grupa");
		System.out.println("3. Promjena postojećeg grupe");
		System.out.println("4. Brisanje grupe");
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

		case 3:
			if (grupe.size() == 0) {
				System.out.println("Nema smjerova koje bi mijenjali");
				izbornik();
			} else {
				// promjena();

			}
		case 4:
			if (grupe.size() == 0) {
				System.out.println("Nema smjerova koje bi mijenjali");
				izbornik();
			} else {
				// brisanje();
			}
			break;
		case 5:
			start.glavniIzbornik();

		}

	}

	private void unosNovog() {
		Grupa g = new Grupa();
		g.setSifra(Pomocno.unosBrojRaspon("Unesi sifru grupe: ", 1, Integer.MAX_VALUE));
		g.setNaziv(Pomocno.unosTeksta("Unesi naziv"));
		
		start.getSmjerovi().pregled(false);
		
		int rb = Pomocno.unosBrojRaspon("Odaberite smjer na kojem je grupa: ",  1, start.getSmjerovi().getSmjerovi().size());
		
		g.setSmjer(start.getSmjerovi().getSmjerovi().get(rb-1));
		
	
		//predvaca isto
		// za datum pocetka treba unos datuma u pomocno
		
		while(true) {
			start.getPolaznici().pregled(false);
			rb = Pomocno.unosBrojRaspon("Odaberite polaznika za dodavanje: ", 1, start.getPolaznici().getPolaznici().size());
			
			g.getPolaznici().add(start.getPolaznici().getPolaznici().get(rb-1));
			
			if(Pomocno.unosBrojRaspon("0 za kraj dodavanja polaznika: ", 0, Integer.MAX_VALUE) == 0) {
				
				break;
			}
			
				
		}
		
		
		grupe.add(g);
		
		izbornik();
		
	}

	private void pregled(boolean prikaziIzbornik) {
		System.out.println("Smjerovi u aplikaciji");
		int rb = 1;
		for (Grupa s : grupe) {
			System.err.println(rb++ + ". " + s);
		}

		System.out.println("---------");

		if (prikaziIzbornik) {

			izbornik();
		}
	}

	public List<Grupa> getGrupe() {
		return grupe;
	}

	public void setGrupe(List<Grupa> grupe) {
		this.grupe = grupe;
	}

}
