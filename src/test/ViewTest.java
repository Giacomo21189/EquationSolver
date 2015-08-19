package test;

import model.FirstGradeEquation;
import model.InvalidParametersException;
import model.ObservableEquation;
import model.SecondGradeEquation;
import model.WrongGradeEquationException;
import view.LblView;


public class ViewTest {

	public static void main(String[] args) throws InvalidParametersException, WrongGradeEquationException {
		ObservableEquation obsEq= new ObservableEquation();
		LblView lblView= new LblView(obsEq); 
		
		//test cambio istanza
		
		obsEq.setIequation(new FirstGradeEquation());
		float[] p={5.4f,7.3f};
		obsEq.setParameters(p); 
		//System.out.println(""+lblView.update(null, null));	come si fa a testare update??
	
		obsEq.setIequation(new SecondGradeEquation());
		float[] s={3.5f,5f,0.2f}; 
		obsEq.setParameters(s); 
		//System.out.println(""+lblView.update(null, null));	come si fa a testare update??
		
	}
}
