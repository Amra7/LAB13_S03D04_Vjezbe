import java.util.Scanner;

public class IgricaXiO {
	
	public static void main(String[] args) {
		
        igrajIgricuIksOks('X', 'O', ' '); // parametri u vidu stringa
    
	}

	private static void igrajIgricuIksOks(char prviIgrac, char drugiIgrac, char nijedanIgrac) {
		int aktivniIgrac = 0; // 0 - igrac ; 1 - igrac O
		String izabranoPolje = null;
		char [][] poljanaZaIgru  = new char [3][3];
		boolean krajIgre=false;
		
		for ( int i =0; i < 3; i++) {
			for (int j = 0; j>3; j++) {
				poljanaZaIgru[i][j] = nijedanIgrac; 
			}
		}
		
		do {
			do {
				izabranoPolje = unesiPolje(aktivniIgrac);
			} while (!izabranoPoljeJeIspravno (izabranoPolje, poljanaZaIgru));
			postaviPolje (aktivniIgrac==0 ? prviIgrac : drugiIgrac);
			krajIgre = krajIgre(poljanaZaIgru) ; 
			
			if(!krajIgre) {
				promjeniAktivnogIgraca (aktivniIgrac);
			}
		}while ( !krajIgre );
		
		if ( nemaPobjednika(poljanaZaIgru)){
			ispisiRemi();
		} else {
			ispisiPobjednika(aktivniIgrac);
		}
	}

	private static boolean izabranoPoljeJeIspravno(String izabranoPolje, char[][] poljanaZaIgru, char nijedanIgrac) {
		/**
		 * 7 8 9
		 * 4 5 6 
		 * 1 2 3
		 */
		
		try  {
			int polje = Integer.parseInt(izabranoPolje);
			if (( polje<10) && (polje >0)){
				if (poljanaZaIgru[(polje -1) / 3][ (polje - 1) % 3] == nijedanIgrac)
				return true;
					} 	
		} catch (Exception e) {			
		}
		return false;
	}

	private static void ispisiPobjednika(int aktivniIgrac) {
		// TODO Auto-generated method stub
		
	}

	private static void ispisiRemi() {
		// TODO Auto-generated method stub
		
	}

	private static boolean nemaPobjednika(char[][] poljanaZaIgru) {
		// TODO Auto-generated method stub
		return false;
	}

	private static int promjeniAktivnogIgraca(int aktivniIgrac) {
		if (aktivniIgrac == 0)
			return 1;
		return 0;
	}
	// return 1 - aktivniIgrac;

	private static boolean krajIgre(char[][] poljanaZaIgru, char nijedanIgrac) {
		int popunjenjihPolja = 0;
		for ( int i=0; i<3; i++) {
			for ( int j=0; j<3; j++) {
				if(poljanaZaIgru[i][j] != nijedanIgrac){
					popunjenjihPolja++;
				}
				
			}
		}
		for ( int i=0; i<3; i++) {
			boolean kraj = false;
			kraj = (poljanaZaIgru[i][0] != nijedanIgrac);
		}
		return false;
	}

	private static void postaviPolje(char igrac, String izabranoPolje, char [][] poljanaZaIgru) {
		int polje = Integer.parseInt(izabranoPolje);
		poljanaZaIgru[(polje -1) / 3][ (polje - 1) % 3] = igrac;
		
		
	}

	private static String unesiPolje(int aktivniIgrac) {
		Scanner in = new Scanner (System.in);
		System.out.println("Unesi polje koje zelis odigrati: \n+---+---+---+\n| 7 | 8 | 9 | \n| 4 | 5 | 6 | \n| 1 | 2 | 3 | \n+---+---+---+" );
	    return in.nextLine();
	}
}
//for ( int i =0, intj=0; i<3, j<3;) {
//poljanaZaigru[i][j] = nijedanIgrac; 
//j++;
//if (j==3) {
//	j=0;
//	i++;
//}

