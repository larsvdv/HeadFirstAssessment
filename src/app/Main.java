package app;

public class Main {
	public static void main(String[] args) {
		Trein trein = new Trein();
		Reiziger Mitch = new Reiziger("Mitch");
		Reiziger Geff = new Reiziger("Geff");
		
		Station Goes = new Station();
		Goes.rijdtBinnen(trein);
		trein.info();		
		trein.instappen(Geff);
		
		Station Arnemuiden = new Station();
		Arnemuiden.rijdtBinnen(trein);
		trein.info();
		trein.printNames();
		trein.instappen(Mitch);
				
}
}