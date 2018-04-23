package app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Trein {
	
	private HashMap<String, Nameable> tweedeklas = new LinkedHashMap<String, Nameable>();
	private HashMap<String, Nameable> eersteklas = new LinkedHashMap<String, Nameable>();
	
	public void instappen(Nameable nameable1, Nameable nameable2, Nameable nameable3) {
		instappeneersteklas(nameable1);
		instappeneersteklas(nameable2);
		instappeneersteklas(nameable3);
	}
	
	public void instappeneersteklas(Nameable nameable) {
		String key = nameable.getName();
		Nameable value = nameable;
		this.eersteklas.put(key, value);
		showInfo(nameable, " is ingestapt.");
	}
	
	public void instappentweedeklas(Nameable nameable) {
		String key = nameable.getName();
		Nameable value = nameable;
		this.tweedeklas.put(key, value);
		showInfo(nameable, " is ingestapt.");
	}
	
	public Nameable uitstappen(String name) {
		if (!eersteklas.containsKey(name)) {
			System.out.println(name + " stapt uit de eersteklas.");
		}
		if (!tweedeklas.containsKey(name)) {
			System.out.println(name + " stapt uit de tweedeklas.");
		}
		return null;
	}
	
	private int getCount() {
		return eersteklas.size();
	}

	public String[] getNames() {
		String[] names = new String[getCount()];
		int i = 0;
			for (String key : eersteklas.keySet()) {
				names[i] = key;
				i++;
			}
			for (String key : tweedeklas.keySet()) {
				names[i] = key;
				i++;
			}
	return names;
	}

	private void showInfo(Nameable uitgestapte, String actie) {
		System.out.println(uitgestapte.getName() + actie);
	}
	
	public void info() {
		System.out.println(this);
	}
	
	public String toString() {
		return "Er zitten " + getCount() + " mensen in de trein.";
	}

	public void printNames() {
		System.out.println("Deze mensen zitten in de eerste klas:");
		for (Map.Entry<String, Nameable> entry : eersteklas.entrySet()) {
			String key = entry.getKey();
			System.out.println("- " + key);
		}
		System.out.println("Deze mensen zitten in de tweede klas:");
		for (Map.Entry<String, Nameable> entry : tweedeklas.entrySet()) {
			String key = entry.getKey();
			System.out.println("- " + key);
		}
	}
}