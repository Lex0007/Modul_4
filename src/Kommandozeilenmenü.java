import java.util.Scanner;

public class Kommandozeilenmenü {

	Scanner scan;

	public Kommandozeilenmenü() {
		this.scan = new Scanner(System.in);
	}

	public void MenüAnzeigen() {
		System.out.println("MEN?");
		System.out.println("1) AUSGABE");
		System.out.println("2) RECHNEN");
		System.out.println("3) exit");
	}

	public void start() {
		String s = "-";
		while (!s.equals("3")) {
			MenüAnzeigen();
			s = scan.nextLine();
			switch(s)
			{
			case "1":
				this.ausgabe();
				break;
			case "2":
				this.rechnen();
				break;
			case "3":
				break;
			default:
				this.fehler();
				break;
			}
		}
		scan.close();
	}
	
	public void ausgabe()
	{
		System.out.println("AUSGABE");
	}
	
	public void rechnen()
	{
		System.out.println("RECHNEN 1+1 = 2");
	}
	
	public void fehler()
	{
		System.out.println("Sie k?nnen nur 1,2 oder 3 eingeben!");
	}


}
