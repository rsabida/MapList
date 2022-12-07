package application;

import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "teste");
		cookies.put("mail", "teste.@com");
		cookies.put("Love of my life", "pedo henrique meu tiquinho");
		cookies.put("Ordem", "alfabetica");
		
		//cookies.remove("mail");
		cookies.put("mail", "substitui o valor anterior");
		
		System.out.println("All cookies: ");
		
		for(String keys: cookies.keySet()) {
			System.out.println(keys + " " + cookies.get(keys));
		}
		

	}

}
