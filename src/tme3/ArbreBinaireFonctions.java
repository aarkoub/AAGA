package tme3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ArbreBinaireFonctions {
	
	
	public static void arbre2str(Node arbreBinaire, String nomFichier) {
		
		if(arbreBinaire==null) return;
				
		PrintWriter writer;
		try {
			writer = new PrintWriter(nomFichier);
			
			formatArbreBinaire(arbreBinaire,writer);
			
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	
	public static void formatArbreBinaire(Node arbreBinaire, PrintWriter writer) {
		writer.print("(");
		
		if(arbreBinaire.hasFilsGauche()) {
			formatArbreBinaire(arbreBinaire.getFilsGauche(), writer);
		}
		
		if(arbreBinaire.hasFilsDroit()) {
			formatArbreBinaire(arbreBinaire.getFilsDroit(), writer);
		}
		
		writer.print(")");
	}
	
	
	public static Node algoRemy(int taille) {
		
	
		IntegerGenerator intGen ;
		
		Node[] peres = new Node[taille];
		IntegerGenerator intGen2 = new IntegerGenerator(1);
		intGen = new IntegerGenerator(taille-1);
		
		Node current = null;
		
		if(taille>0) {
			current=new Node(0);
			peres[0]=current;
		}
		for(int i=1; i<taille; i++) {

			int k;
			
			while((k = intGen.nextInt())>=i);

			Node pere = peres[k];
			
			Node newNode;
			
			if(intGen2.nextInt()==0) {
				newNode = new Node(pere.getFilsGauche(), null);
				
				pere.setFilsGauche(newNode);
				
			}
			else {
				newNode = new Node(null, pere.getFilsDroit());
				
				pere.setFilsDroit(newNode);
				
			}

			peres[i] = newNode;
			
			
		}
		
		
		
		
		
		return current;
	}
	
	public static void eliminerFeuilleEtiquetage(Node arbreBinaire) {
		
		if(arbreBinaire==null) return;
		
		if(arbreBinaire.isFeuille()) return ;
		
		if(arbreBinaire.hasFilsDroit()) {
			if(arbreBinaire.getFilsDroit().getEtiquette()!=-1) {
				
				arbreBinaire.setFilsDroit(null);
				
			}
				
			else
				eliminerFeuilleEtiquetage(arbreBinaire.getFilsDroit());
		}
		
		if(arbreBinaire.hasFilsGauche()) {
			if(arbreBinaire.getFilsGauche().getEtiquette()!=-1) {
							
				arbreBinaire.setFilsGauche(null);
				
			}
			else
				eliminerFeuilleEtiquetage(arbreBinaire.getFilsGauche());
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Node arbreBinaire = algoRemy(10);
		
		
		
		arbre2str(arbreBinaire, "res10.txt");
		
		arbreBinaire = algoRemy(30);
		
		
		
		arbre2str(arbreBinaire, "res30.txt");
		
		arbreBinaire = algoRemy(50);
		
		
		
		arbre2str(arbreBinaire, "res50.txt");
		
		arbreBinaire = algoRemy(100);
		
		
		
		arbre2str(arbreBinaire, "res100.txt");
		
		arbreBinaire = algoRemy(1000);
		
		
		
		arbre2str(arbreBinaire, "res1000.txt");
		
		arbreBinaire = algoRemy(10000);
		
		
		
		arbre2str(arbreBinaire, "res10000.txt");
					
		
		
	}
	
}
