package test;

import model.FirstGradeEquation;
import model.InvalidParametersException;

public class FirstGradeEquationTest {

	public static void main(String[] args) throws InvalidParametersException {
		FirstGradeEquation fge= new FirstGradeEquation();
		float p[]={}; 
		try {
			fge.setParameters(p);
		} catch (InvalidParametersException ip) {
			System.out.println("valore inserito non corretto1");
		}
		float v[]={0, 3}; 
		try {
			fge.setParameters(v);
		} catch (InvalidParametersException e) {
			System.out.println("valore inserito non corretto2");
		}
		
		System.out.println(fge.getForm()); 
		fge.setSolutions();
		
		float l[]={-2.6f, 5}; 
		try {
			fge.setParameters(l);
		} catch (InvalidParametersException ip) {
			System.out.println("valore inserito non corretto1");
		}
		fge.setSolutions();
		float[] a=fge.getSolutions();
		System.out.println(""+a.length);
		String s="";
		for (int i = 0; i < a.length; i++) {
			System.out.println(s+=a[i]+";");
		}
	}
}
