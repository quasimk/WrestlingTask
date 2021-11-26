
public class Inheritance {

	public static void main(String[] args) {
		
		Lightweight l1 = new Lightweight("Rey Mysterio", 27, "Lightweight", 170.5f, 55, 75, 77, 7, 80);
		Heavyweight h1 = new Heavyweight ("John Cena", 40, "Heavyweight", 250.5f, 77, 85, 90, 65,10);
		System.out.println(h1.name);
		System.out.println(l1.name);
	    System.out.println(h1.courage);
	    h1.fights();
	    h1.attacked(h1.name, h1.courage);
	    h1.wrestlingMatch(l1.skillLevel, h1.skillLevel, l1.name, h1.name);

	}

}
