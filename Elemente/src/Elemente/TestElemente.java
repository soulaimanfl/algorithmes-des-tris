package Elemente;

import java.util.Scanner;

public class TestElemente {
	
	public static void main(String[] args) {
		// choisir le tri
		System.out.println("pour un tri par insertion tapez 1 , trifusion tapez 2 , tri par denobrement tapez 3 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int programme3 ;
		programme3 = sc.nextInt();
		
		TabElemente T = TabElemente.creetableau(); // creation du tableau element
		Chronometre time = new Chronometre();
		long times ;
		for(int i = 0 ; i < T.N  ; i++) { //affichage du tableau avant le tri
			System.out.println("  cle num : " + T.tableau[i].getCle() + " " +"a la valeur : " + T.tableau[i].getValeur());
		}
			
		if(programme3 == 1){
			//tri par insertion
			
			System.out.println("apres le tri : ");
			time.start();
			T.triInsertion();	
		
		}
		
		else if(programme3 == 2){	
			//tri par fusion
			
			System.out.println("apres le tri : ");
			time.start();
			T.triFusion( 0, T.N -1);
		
		}
		
		else if(programme3 == 3) {
			// tri par denombrement
			System.out.println("apres le tri : ");
			time.start();
			T.triDenombrement();
			
			
		}
	 times  = time.stop();
		sc.close();
	
		//affichage du tableau apres le tri
		for(int p = 0 ; p < T.N  ; p++) {
			System.out.println("  cle num : " + T.tableau[p].getCle() + " " +"a la valeur : " + T.tableau[p].getValeur() );
		}	
		System.out.println("temps d'excution "+ times + "ms");
		
	}
	
	
}
