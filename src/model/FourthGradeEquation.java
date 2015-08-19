package model;


public class FourthGradeEquation implements IEquation{

	private static final String form="a*x*x*x*x+b*x*x*x+c*x*x+d*x+e=0";
	private float[] parameters=new float[5];
	private float[] solutions=new float[4];
	
	
	@Override
	public String getForm() {
		return form;
	}

	@Override
	public float[] getParameters() {
		return parameters;
	}

	@Override
	public void setParameters(float... f) throws InvalidParametersException, WrongGradeEquationException {
		
	}

	@Override
	public float[] getSolutions() {
		return solutions;
	}

	@Override
	public void solve(float... f) throws InvalidParametersException, ArithmeticException {
		
	}

}
