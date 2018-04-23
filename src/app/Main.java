package app;

public class Main {
	public static void main(String[] args) {
		Trein trein = new Trein();
		trein.info();
		
		Reiziger Geff = new Reiziger("Geff");
		
		trein.instappen(Geff);
}
}