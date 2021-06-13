import java.util.ArrayList;

public class Ensemble {
	private String nomEnsemble;
	private int tailleEnsemble;
	private ArrayList<Object> elementsEnsemble;

	// Déclaration des Getters.
	public String getNomEnsemble() {
		return nomEnsemble;
	}

	public int getTailleEnsemble() {
		return tailleEnsemble;
	}

	//Methode qui renvoie les elements de l'ensemble.
	public ArrayList<Object> getelementsEnsemble() {
		if (elementsEnsemble.isEmpty())
			return null;
		else
			return elementsEnsemble;
	}

	// Constructeur de la classe Ensemble.
	public Ensemble(String nomEnsemble) {
		elementsEnsemble = new ArrayList<Object>();
		this.nomEnsemble = nomEnsemble;

	}

	// Méthode d'ajout d'un element dans l'ensemble.
	public void ajoutElement(Object element) {
		elementsEnsemble.add(element);
		tailleEnsemble = elementsEnsemble.size();

	}

	// Methode pour la suppression d'un element dans l'ensemble.
	public void supprimeElement(Object element) {
		elementsEnsemble.remove(element);

	}

	// Méthode pour vider l'ensemble.
	public void supprimerTousElementsEnsemble() {
		elementsEnsemble.clear();
	}
	
	//Redefinition de la methose toString().
	@Override
	public String toString() {
		return "Ensemble " + nomEnsemble + " = " + elementsEnsemble.toString();
	}
}
