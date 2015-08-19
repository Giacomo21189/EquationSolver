package test;

import model.InvalidParametersException;
import model.ObservableEquation;
import model.SecondGradeEquation;
import model.Utils;
import model.WrongGradeEquationException;

public class ObservableEquationTest {
	
	public static void main(String[] args) throws InvalidParametersException, WrongGradeEquationException {
		
		ObservableEquation obsEq= new ObservableEquation(); 
		Utils util= new Utils();
		float[] p={3f,5f};
		obsEq.setParameters(p);
		System.out.println(util.parseVectToString(obsEq.getParameters()));
		obsEq.solve(p); 
		System.out.println(util.parseVectToString(obsEq.getSolutions())); 
		
		
		obsEq.setIequation(new SecondGradeEquation());
		//Adesso obsEq si comporta come un'equazione di secondo grado! 
		float[] s={3.5f, 6f, 1f};
		obsEq.setParameters(s); 
		System.out.println(util.parseVectToString(obsEq.getParameters()));
		obsEq.solve(s); 
		System.out.println(util.parseVectToString(obsEq.getSolutions()));
	}
}
