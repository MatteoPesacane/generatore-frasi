package GeneratoreFrasi;

public class GenFrasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String[]elenco1 = {"Ciao", "Bella", "Buongiorno", "Salve"};
		final String[]elenco2 = {"Matteo,", "ragazzo,", "zio,", "mamma,"};
		final String[]elenco3 = {"come stai?", "che fai?", "giochiamo insieme?", "che studi?"};
		
		String parola1 = elenco1[(int)(Math.random() * elenco1.length)];
		String parola2 = elenco2[(int)(Math.random() * elenco2.length)];
		String parola3 = elenco3[(int)(Math.random() * elenco3.length)];
		
		System.out.println(parola1 + " " + parola2 + " " + parola3 + " ");

	}

}
