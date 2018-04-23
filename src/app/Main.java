package app;

public class Main {
	public static void main(String[] args) {
		Trein trein = new Trein();
		Reiziger Mitch = new Reiziger("Mitch");
		Reiziger Geff = new Reiziger("Geff");
		Reiziger Sjaak = new Reiziger("Sjaak");
		Reiziger Kees = new Reiziger("Kees");
		Reiziger Henk = new Reiziger("Henk");
		
		Station Goes = new Station();
		Goes.rijdtBinnen(trein);
		trein.info();		
		trein.instappeneersteklas(Geff);
		trein.instappeneersteklas(Mitch);
		trein.instappeneersteklas(Sjaak);
		trein.instappentweedeklas(Kees);
		trein.instappentweedeklas(Henk);
		
		Station Arnemuiden = new Station();
		Arnemuiden.rijdtBinnen(trein);
		trein.info();
		trein.printNames();
		trein.instappentweedeklas(Mitch);
				
	}
}