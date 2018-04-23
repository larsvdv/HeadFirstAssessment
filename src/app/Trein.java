package app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Trein {
	
	private HashMap<String, Nameable> stoelen = new LinkedHashMap<String, Nameable>();
	
	public void instappen(Nameable nameable1, Nameable nameable2, Nameable nameable3) {
		instappen(nameable1);
		instappen(nameable2);
		instappen(nameable3);
	}
	
	public void instappen(Nameable nameable) {
		String key = nameable.getName();
		Nameable value = nameable;
		this.stoelen.put(key, value);
		showInfo(nameable, " is ingestapt.");
	}
	
	public Nameable uitstappen(String name) {
		if (!stoelen.containsKey(name)) {
			System.out.println(name + " zit niet in de trein.");
		}
		return null;
	}
	
	private int getCount() {
		return stoelen.size();
	}

	public String[] getNames() {
		String[] names = new String[getCount()];
		int i = 0;
			for (String key : stoelen.keySet()) {
				names[i] = key;
			i++;
	}
	return names;
}

	private void showInfo(Nameable uitgestapte, String actie) {
		System.out.println(uitgestapte.getName() + actie);
	}
	
	public void zitplaatsen() {
		
	}
	
	public void eersteklas() {
		return;
	}
	
	public void tweedeklas() {
		return;
	}
	
	public void info() {
		System.out.println(this);
	}
	
	public String toString() {
		return "Er zitten " + getCount() + " mensen in de trein.";
	}

	public void printNames() {
		System.out.println("Deze mensen zitten in de trein:");
		for (Map.Entry<String, Nameable> entry : stoelen.entrySet()) {
			String key = entry.getKey();
			System.out.println("- " + key);
		}
	}
}