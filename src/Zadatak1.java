public class Zadatak1 {
	public static void main(String[] args) {
		System.out.println("Unesi koliko zelis da elemenata ima niz: ");
		int n = TextIO.getInt();

		int[] niz = new int[n];
		niz = unosNiza(n);

		System.out.println("Artimeticka sredina ovog niza je: "
				+ artSredina(niz));
	}

	private static double artSredina(int[] niz) {
		double sum = 0;

		for (int i = 0; i < niz.length; i++) {
			sum = sum + niz[i];
		}
		double artSredina = sum / niz.length;
		return artSredina;
	}

	private static int[] unosNiza(int a) {
		int[] unosNiza = new int[a];
		for (int i = 0; i < unosNiza.length; i++) {
			System.out.println("Unesi brojeve: ");
			unosNiza[i] = TextIO.getInt();
		}
		return unosNiza;
	}
}
