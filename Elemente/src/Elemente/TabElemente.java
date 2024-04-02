package Elemente;

import java.util.Scanner;

import java.util.Random;

public class TabElemente {
	protected  int N ; 
	protected  Elemente []tableau;

	public TabElemente(int N) {  //constructeur
		this.N = N ;
		this.tableau= new Elemente[N];
		for(int i = 0 ; i < N ; i++)
			tableau[i]= new Elemente() ;
	}
	public static TabElemente creetableau() { //pour creation du tableau
		Scanner scanner = new Scanner(System.in);
		System.out.print("entrer la taille du tableau:");
		TabElemente T = new TabElemente(scanner.nextInt());
		int programme ;
		int programme1 ; 
		System.out.println("pour un tableau avec des clÈs aleatoire taper 1 , pour un tableau avec des clÈs manuel taper 0 ");
		programme = scanner.nextInt();
		if(programme == 1) {
			for  (int f = 0 ; f < T.N; f++) {
				Random rand = new Random();
				T.tableau[f].setCle(rand.nextInt(T.N));
				
			}
		}
		else if(programme == 0) {
		for(int i = 0 ; i < T.N ; i++) {
			System.out.println("saisir  la cle DU TABLEAU numero " + i + ":"); 
			T.tableau[i].setCle(scanner.nextInt());
		}
	}
		else {
			System.out.println("ereur de saisie !! veuillez relancer le programme"); 
		}
		System.out.println("pour un tableau avec des valeur aleatoire taper 1 , pour un tableau avec des valeur manuel taper 0 ");
		programme1 = scanner.nextInt();
		if(programme1 == 1) {
			for(int f = 0 ; f < T.N ; f++) {
				
				String chars = "abcdefghijklmnopqrstxyzABCDEFGHIJKLMNOPQRSTXYZ";
				Random randv = new Random();
				char c = chars.charAt(randv.nextInt(chars.length()));
				String a = Character.toString(c); 
				T.tableau[f].setValeur(a);
			}
		}
		else if(programme1 == 0) {
			for(int i = 0 ; i < T.N ; i++) {
			System.out.println("saisir  la valeur DU TABLEAU numero " + i + ":"); 
			T.tableau[i].setValeur(scanner.next());
		}
	}
		scanner.close();
		
		return T;
	}
	public void triInsertion() {
		int n = N - 1 ; // taille du tableau -1
		for(int i = 1 ; i <= n ; i++) { 
			int index = tableau[i].getCle(); // on sauvegarde les donnes de la case i  dans une variable
			Elemente v = tableau[i];
			int j = i - 1  ; // onn pose j = j-1
	
			while(j >= 0 && tableau[j].getCle()> index ) { // on compare  la case precedente et la case actuel apres si la case j est plus grand que la case i on echange les places
				
					tableau[j+1] = tableau[j];
					j-- ;
					
				}
					
					tableau[j+1] = v; // la case precedente elle prend la cle et la valeur de le plus petit entre eux
					
					}
			
			
	}
	
	//methode trifFusion
    public void triFusion ( int debut, int fin) { // Cr√©ation d'une methode triFusion qui utilise le tri fusion

        if (debut < fin) { // Si debut est infÈrieur ‡† fin 

            int milieu = (debut + fin) / 2; // Indice du milieu est une fusion de l'indice du d√©but et de fin

            triFusion (debut, milieu); // Indice du dÈbut et du milieu ne bouge pas dans le tri fusion 

            triFusion ( milieu + 1, fin); // Indice du milieu augmente et l'indice de fin bouge pas dans le tri fusion 

            fusion (tableau, debut, milieu, fin); // Fusion de l'indice du dÈbut, milieu et de fin

        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    //methode fusion
    public void fusion (Elemente [] tableau, int debut, int milieu, int fin) { // crÈation d'une mÈthode fusion, qui utilise la fusion avec des parmËtres tableau, debut, milieu et fin 

        int indice1 = milieu - debut + 1; // Indice1 est l'indice du milieu moins celui du debut
        int indice2 = fin - milieu; // Indice2 est l'indice de la fin moins celui du milieu
 
        Elemente Gauche [] = new Elemente [indice1]; // crÈation d'un nouvel indice1 ‡† gauche
        Elemente Droite [] = new Elemente [indice2]; // crÈation d'un nouvel indice2 ‡† droite
 
       for (int i = 0; i < indice1; i++) { // Compte l'indice1

            Gauche [i] = tableau [debut + i]; // l'ÈlÈment gauche est l'indiceDebut augmente
        
            for (int j = 0; j < indice2; j++) { // Compte l'indice2

                Droite [j] = tableau [milieu + 1 + j]; // L'√©l√©ment droit est l'indiceMilieu augmente

                
            }
        }
        
        int i = 0; // Initialise i
        int j = 0; // Initialise j

        int k = debut; // K est l'indice du d√©but

        while (i < indice1 && j < indice2) { // Tant que i est inf√©rieur √† l'indice1 et que j est inf√©rieur √† l'indice2
            
            if (Gauche [i].getCle () <= Droite [j].getCle ()) { // Si la cl√© de l'√©l√©ment gauche est inf√©rieur √† celle de droite 

                tableau [k] = Gauche [i]; // Tableau k est l'√©l√©ment gauche
                
                i++; // I augmente
            
            } else { // Sinon on retourne
                
                tableau [k] = Droite [j]; // Tableau k est l'√©l√©ment droit

                j++; // J augmente

                
            }

            k++; // K augmente
        }
 
        while (i < indice1) { // Tant que i est inferieur √a† l'indice1

            tableau [k] = Gauche [i]; // Tableau k est l'√©l√©ment gauche

            i++; // I augmente
            
            k++; // K augmente

           
        }
 
        while (j < indice2) { // Tant que j est inf√©rieur √† l'indice2

            tableau [k] = Droite [j]; // Tableau k est l'√©l√©ment droit

            j++; // J augmente
            
            k++; // K augmente

           
        }
    }
    public void triDenombrement() {
    	
        int maxi= tableau[0].getCle(); // on initialise maxi par la premiere case du tableau
        for(int i=1; i< N; i++){     
            if(tableau[i].getCle()>maxi)
            maxi=tableau[i].getCle();
        } // on trouve la plus gros cle dans le tableau 
        

        TabElemente Tabmilieu=new TabElemente(maxi+1);  // on cree un tableau intermediaire pour calculer le nombre de fois la cle 
      
        for(int i=0; i<N; i++){ 
        	Tabmilieu.tableau[tableau[i].getCle()].setCle(Tabmilieu.tableau[tableau[i].getCle()].getCle()+1);; // // on calcule le nombre de fois du cle 
             
            }
        
        for(int k=1; k<=maxi; k++) {
        	Tabmilieu.tableau[k].setCle(Tabmilieu.tableau[k].getCle()+Tabmilieu.tableau[k-1].getCle()); //on incremente chaque case du tableau intermediaire
        }
        TabElemente Tabcopie=new TabElemente(N); // on cree un nouveau tableau pour la dernier etape
        
  

        
        for (int k =0; k<N; k++) { // on copie les valeur triee dans le nouveau tableau 
        	
        	Tabcopie.tableau[Tabmilieu.tableau[tableau[k].getCle()].getCle()-1].setCle(tableau[k].getCle());
        	Tabcopie.tableau[Tabmilieu.tableau[tableau[k].getCle()].getCle()-1].setValeur(tableau[k].getValeur());
        	
          }
        for(int k = 0 ; k<N ; k++) {
        	tableau[k] = Tabcopie.tableau[k]; // onn recopie dans le tableau initiale
        }
   
    }
}
