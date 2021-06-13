import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Operation {

	//Opération Intersection de 2 ensembles 
	public void intersection(Ensemble A, Ensemble B) {
		ArrayList<Object> C = new ArrayList<Object>();
		C.addAll(A.getelementsEnsemble());
		C.retainAll(B.getelementsEnsemble());
		System.out.println(A);
		System.out.println(B);
		System.out.println("Intersection de " + A.getNomEnsemble() + " et " + B.getNomEnsemble() + " = " + C);

	}
	// Opération d'union de 2 ensembles 
	public <T> void union(Ensemble A, Ensemble B) {
		System.out.println(A);
		System.out.println(B);
		Set<Object> C = new HashSet<Object>();
		C.addAll(A.getelementsEnsemble());
		C.addAll(B.getelementsEnsemble());
		System.out.println("Union de " + A.getNomEnsemble() + " et " + B.getNomEnsemble() + " = " + C);

	}

}
