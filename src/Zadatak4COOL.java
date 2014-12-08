public class Zadatak4COOL {
	public static void main(String[] args) {

		// int visina,sirina;
		/* pokupi od korisnika */

		System.out.print(" Unesi visinu: ");
		int visina = TextIO.getlnInt();
		System.out.print(" Unesi sirinu: ");
		int sirina = TextIO.getlnInt();

		int[][] matrica = kreirajMatricu(visina, sirina);
		ispisiMatricu(matrica);

		System.out.println("___________");
		ispis1DNiza(matrica[0]);

		postaviVrijednost(matrica);
		ispisiMatricu(matrica);

		System.out.println("Suma redova: ");
		for (int i = 0; i < matrica.length; i++) {
			int suma = sumaReda(matrica[i]);
			System.out.println(suma);
		}

		System.out.println("Suma kolone: ");
		for (int i = 0; i < matrica[0].length; i++) {
			int suma = sumaKolone(matrica, i);
			System.out.print(suma + " ");
		}

		System.out.println("Suma lijeve dijagonale  je : "
				+ sumaDijagoneleLijeve(matrica));

		System.out.println("Suma desne dijagonale je : "
				+ sumaDijagoneleDesne(matrica));

		ispisiMatricu(matrica);

		System.out.println("U ovom redu su svi isti: ");
		for (int i = 0; i < matrica.length; i++) {
			boolean daR = sviIstiURedu(matrica[i]);
			System.out.println(daR);
		}
		System.out.println("u ovoj kolini svu su: ");
		for (int j = 0; j < matrica[0].length; j++) {
			boolean daK = sviIstiUKoloni(matrica, j);
			System.out.print(daK + ", ");

		}
		sviIstiDijagonala(matrica);
		sviIstiKontraDijagonala (matrica);
		
	}
//      Kontolise da li su svi u  kokntra dijagonali isti i nedostajeprava dijagonaač
	
	public static boolean sviIstiDijagonala(int[][] matrica) {
        boolean yes = true;
		for (int i = 1; i < matrica.length; i++) {
			for (int j = 1; j < matrica.length; j++){
				if (matrica[i][j] != matrica[i][j]) {
					return false;
			}
			
		}
		}
		return yes;
		
	}
	
	public static boolean sviIstiKontraDijagonala (int [][] matrica) {
		int j= matrica.length -1;
		for ( int i =1; i < matrica.length; i++){
			int k = j-1;
			if( matrica[i-1][k+1] != matrica [i][k]){
				return  false;
			}
		}
		return true;
	}
	
	
	private static boolean sviIstiUKoloni(int[][] matrica, int j) {
		boolean yes = true;
		for (int i = 1; i < matrica.length; i++) {
			if (matrica[i][j] != matrica[i-1][j]) {
				return false;
			}
		}
		return yes;
	}

	private static boolean sviIstiURedu(int[] red) {
		boolean yes = true;
		for (int j = 0; j < red.length; j++) {
			if (red[0] != red[j]) {
				return false;
			}
		}
		return yes;
	}

	private static int sumaDijagoneleDesne(int[][] matrica) {
		int sum = 0;
		for (int i = 0; i < matrica.length; i++) {
			for (int j = (matrica.length - 1); j >= 0; j--) {
				if (i + j == (matrica.length - 1)) {
					sum = sum + matrica[i][j];
				}
			}
		}
		return sum;
	}

	private static int sumaDijagoneleLijeve(int[][] matrica) {
		int sum = 0;
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				if (i == j) {
					sum = sum + matrica[i][j];
				}
			}
		}
		System.out.println();
		return sum;
	}

	private static int sumaKolone(int[][] matrica, int j) {
		int sum = 0;

		for (int i = 0; i < matrica.length; i++) {
			sum = sum + matrica[i][j];
		}
		return sum;
	}

	private static int sumaReda(int[] red) {
		int sum = 0;
		for (int i = 0; i < red.length; i++) {
			sum = sum + red[i];
		}
		return sum;
	}

	public static void ispisiMatricu(int[][] matrica) {

		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				System.out.print(matrica[i][j] + " ");

			}
			System.out.println();
		}
	}

	public static int[][] kreirajMatricu(int visina, int sirina) {
		int[][] matrica = new int[visina][sirina];
		return matrica;
	}

	public static void ispis1DNiza(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
	}

	public static int[][] postaviVrijednost(int[][] matrica) {

		int x = 0;
		int y = 0;

		do {
			System.out.print("Unesi kordinate matrice: ");
			System.out.print(" Unesi x: ");
			x = TextIO.getlnInt();
			while ((x < 0) || (x >= matrica.length)) {
				System.out.print("Unesi koordinatu koja je validna :");
				x = TextIO.getlnInt();
			}

			System.out.print(" Unesi y: ");
			y = TextIO.getlnInt();
			while ((y < 0) || (y >= matrica[x].length)) {
				System.out.print("Unesi koordinatu koja je validna :");
				y = TextIO.getlnInt();
			}
			System.out.println("Unesi vrijednost koju zelis postaviti: ");
			int vrijednost = TextIO.getlnInt();
			matrica[x][y] = vrijednost;
		} while (matrica[x][y] != 0);

		// provjerava da je matica zauzeta

		return matrica;

	}

}
