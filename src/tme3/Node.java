package tme3;

public class Node {
	
	private int etiquette=-1;
	private boolean isFeuille;
	private Node filsGauche, filsDroit;
	
	public Node() {
		isFeuille = true;
		
	}
	
	public Node(int etiquette) {
		isFeuille = true;
		this.etiquette =  etiquette;
	}
	
	
	public Node(Node filsGauche, Node filsDroit) {
		
		this.filsGauche = filsGauche;
		this.filsDroit = filsDroit;
		
		isFeuille = (filsGauche==null && filsDroit==null);
		
		
		
	}

	public int getEtiquette() {
		return etiquette;
	}

	public void setEtiquette(int etiquette) {
		this.etiquette = etiquette;
	}

	public boolean isFeuille() {
		return (filsGauche==null && filsDroit==null);
	}

	public void setFeuille(boolean isFeuille) {
		this.isFeuille = isFeuille;
	}

	public Node getFilsGauche() {
		return filsGauche;
	}

	public void setFilsGauche(Node filsGauche) {
		this.filsGauche = filsGauche;
	}

	public Node getFilsDroit() {
		return filsDroit;
	}

	public void setFilsDroit(Node filsDroit) {
		this.filsDroit = filsDroit;
	}

	public boolean hasFilsGauche() {
		return filsGauche!=null;
	}
	
	public boolean hasFilsDroit() {
		return filsDroit!=null;
	}
	

}
