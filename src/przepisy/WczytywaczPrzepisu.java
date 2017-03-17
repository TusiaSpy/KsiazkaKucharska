package przepisy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WczytywaczPrzepisu {

	public List<Danie> dania = new ArrayList<Danie>();
	private Scanner s;

	public List<Danie> wczytaj() {
		s = new Scanner(System.in);
		s.useDelimiter(";");
		while (s.hasNextLine()) {
			String typ = s.next();
			if (!typ.equals("Deser") && !typ.equals("Zupa") && !typ.equals("DanieGlowne")  ) {
				System.out.println("Nie rozpoznaje tego");
				break;
			}
			String nazwa = s.next();
			int czasPrzygotowania = s.nextInt();
			int dlaIluOsob = s.nextInt();
			String trudnosc = s.next();
			String skladniki = s.next();
			String sposobPrzygotowania = s.next();

			if (typ.equals("Deser")) {
				String kalorie = s.next();
				dania.add(new Deser(czasPrzygotowania, dlaIluOsob, sposobPrzygotowania, trudnosc, kalorie));

			} else if (typ.equals("Zupa")) {
				boolean wegeMax = Boolean.getBoolean(s.next());
				try {
					dania.add(new Zupa(czasPrzygotowania, dlaIluOsob, sposobPrzygotowania, trudnosc, wegeMax));
				} catch (ZbytCzasochlonne e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Zbyt czasoch³onny przepis");
				}
			}

			else if (typ.equals("DanieGlowne")) {
				boolean wege = Boolean.getBoolean(s.next());
				dania.add(new DanieGlowne(czasPrzygotowania, dlaIluOsob, sposobPrzygotowania, trudnosc, wege));
			} else {
				System.out.println("nie zapisuje takich przpisow");
			}

		}
		return dania;
	}
}