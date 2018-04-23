package app;

import java.util.Stack;

public class Station {
	private Stack<Nameable> perron = new Stack<Nameable>();
	
	public void rijdtBinnen(Trein trein) {
		leegTrein(trein);
		vulTrein(trein);
	}
	
	private void leegTrein(Trein trein) {
		for (String name : trein.getNames()) {
			Nameable uitgestapte = trein.uitstappen(name);
			perron.push(uitgestapte);
		}
	}
	
	private void vulTrein(Trein trein) {
		while (!perron.isEmpty()) {
			Nameable opgestapelde = perron.pop();
			trein.instappen(opgestapelde);
		}
	}
}
