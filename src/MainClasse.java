import java.util.Scanner;

public class MainClasse {
	/*
	 * Programme Java permettant de faire sur
	 * deux ensembles (Fini ou Infini) l'union et
	 * l'intersection de ces deux ensembles.
	 * 
	 * @Auto     :  Sali Emmanuel 
	 * Matricule :  17A0799FS
	 * Niveau    :  III
	 * Filiere   :  Informatique
	 * 
	 * 
	 * */

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Ensemble A = new Ensemble("A");
		Ensemble B = new Ensemble("B");
		Operation operation = new Operation();
		String response;
		boolean continuer = true;
		System.out.println("------------------------------------------------------");
		System.out.println("Entrez les elements de l'ensemble " + A.getNomEnsemble());
		System.out.println("------------------------------------------------------");
		System.out.println("Taper *  pour terminer l'ajout ");
		do {

			System.out.println("Entrer le nouveau element :");
			response = sc.nextLine();
			if (response.equals("*"))
				break;
			else
				A.ajoutElement(response);
		} while (response != "*");
		System.out.println("------------------------------------------------------");
		System.out.println("Entrez les elements de l'ensemble " + B.getNomEnsemble());
		System.out.println("------------------------------------------------------");
		System.out.println("Taper *  pour terminer l'ajout ");
		do {

			System.out.println("Entrer le nouveau element :");
			response = sc.nextLine();
			if (response.equals("*"))
				break;
			else
				B.ajoutElement(response);
		} while (response != "*");

		while (continuer) {
			System.out.println("\n1 -> pour afficher l\'intersection");
			System.out.println("2 -> pour afficher l\'union");
			System.out.println("3 -> pour ajouter un element dans " + A.getNomEnsemble());
			System.out.println("4 -> pour ajouter un element dans " + B.getNomEnsemble());
			System.out.println("5 -> pour vider l'ensemble " + A.getNomEnsemble());
			System.out.println("6 -> pour vider l'ensemble " + B.getNomEnsemble());
			System.out.println("7 -> pour supprimer un element dans " + A.getNomEnsemble());
			System.out.println("8 -> pour supprimer un element dans " + B.getNomEnsemble());
			System.out.println("9 -> pour afficher les Ensembles");
			System.out.println("* -> pour quiter()");
			response = sc.nextLine();
			switch (response) {
			case "1":
				operation.intersection(A, B);
				break;
			case "2":
				operation.union(A, B);
				break;
			case "3":
				System.out.println("Entrez l'element");
				response = sc.nextLine();
				A.ajoutElement(response);
				break;
			case "4":
				response = sc.nextLine();
				B.ajoutElement(response);
				break;
			case "5":
				A.supprimerTousElementsEnsemble();
				break;
			case "6":
				B.supprimerTousElementsEnsemble();
				break;
			case "7":
				response = sc.nextLine();
				A.supprimeElement(response);
				break;
			case "8":
				response = sc.nextLine();
				B.supprimeElement(response);
				break;
			case "9":
				System.out.println(A);
				System.out.println(B);
				break;
			case "*":
				break;

			default:
				System.out.println("Choix non disponible");
				break;
			}
		}
		System.out.println(A);
		System.out.println(B);
	}

}
