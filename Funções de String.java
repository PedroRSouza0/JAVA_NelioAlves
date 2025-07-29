package teste_eclipse;

public class Main {

	public static void main(String[] args) {

		String teste = "     Estou testando funcionalidades";
		
		String s01 = teste.toLowerCase(); // Minusculas
		String s02 = teste.toUpperCase(); // Maiusculas
		String s03 = teste.trim(); // Remove espaços nos cantos
		String recorte = teste.substring(7,15);
		
		int i = teste.indexOf('t');
		
		// Testando o split
		String split = "Eu estou testando";
		
		
		System.out.println("Original - " + teste);
		System.out.println("Minusculo: " + s01);
		
		System.out.println("Maiusculas: " + s02);
		
		System.out.println("Trim -" + s03);
		
		System.out.println("Recortar - " + teste.substring(7));
		System.out.println("Recorte com inicio e fim - " + recorte);
		
		System.out.println("Substituir - " + teste.replace('t', '!')); // "Sempre que achar um 't' irá substituir por '!'
		System.out.println("Substituir (str version) - " + teste.replace("es", "2~"));
		
		System.out.println("Indice de t (primeiro) - " + i);
		System.out.println("Indice de t (ultimo) - " + teste.lastIndexOf('t'));
		
		String[] vect = split.split(" "); // Separa sempre que achar um espaço
		String word1 = vect[0];
		System.out.println(word1);
		
	}

}
