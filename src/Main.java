
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pracownik pracownik = new Pracownik("Jan", "kowalski", 2000, "accountant");
		Pracownik p2 = new Pracownik("Anna", "N", 2000, "sales manager");

		if (pracownik.getSalary() == p2.getSalary()) {
			System.out.println("pracownicy have the same salary");
		} else if (pracownik.getSalary() > p2.getSalary()) {
			System.out.println("pracownik 1 has better salary");
		} else {
			System.out.println("pracownik 2 has better salary");
		}

		Pracownik p3 = new Pracownik("Anna", "N", 2000, "sales manager");
		Pracownik p4 = p3;

		// == operator ktory porownuje referencje.
		// referencja jest to obszar w pamieci, w ktorym znajduje sie obiekt.
		System.out.println(p2 == p3);
		System.out.println(p4 == p3);
		// dlaczego (na poczatku) equals zwrocil mi "false" mimo ze p2 i p3 maja
		// te same wartosci?
		// na poczatku w klasie pracownik nie mam zdefinniowanej metody equals.
		// czyli brana jest DOMYSLNA IMPELEMENTACJA metody equals ktora
		// domyslnie porownuje referencje czyli robi "=="

		// equals to metoda z klasy Object.
		// "w javie wszystko jest obiektem" a wiec " kazda klasa jaka stworzysz
		// domyslnie dziedziczy z klasy Object"
		System.out.println("Equals: " + p2.equals(p3));

		p4.setName("XXXXXX");
		System.out.println("p4: " + p4);
		System.out.println("p3: " + p3);
		System.out.println("##################################");

		// dlaczego Stringow NIE wolno porownywac przez "==" ?

		String s1 = "ala";
		String s2 = "ala";
		// string jest specjalnym obiektem ktorego do tworzenia nie jest
		// wymagany operator "new"
		// jezeli tworze Stringa bez operatora "new" to jest on pobierany z
		// "poli stringowej"
		System.out.println(s1 == s2);

		String napis = "ala ma kota";
		String s3 = napis.substring(0, 3);// .intern();// retrun new
											// String(....)
		System.out.println("s3=" + s3);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		
		/*
		 * Praca domowa:
		 * Stworz klase Zbiornik(nazwa, stan wody, max pojemnosc)
		 * stworz: konstruktor, gety.sety, toString i equals
		 * 
		 * w manie stworz dwie instancje zbiornika i wykaz ze 
		 * beda to dwie rozne referencje mimo ze moga miec te same parametry
		 * 
		 */
	}

}
