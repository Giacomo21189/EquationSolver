package model;

public class ThirdGradeEquation	implements IEquation {
	
	private static final String form="a*x*x*x+b*x*x+x*c+d=0";
	private float[] parameters=new float[4];
	private float[] solutions=new float[3];
	
	
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
		// TODO Auto-generated method stub
		return solutions;
	}

	@Override
	public void solve(float... f) throws InvalidParametersException, ArithmeticException {
		// TODO Auto-generated method stub
		
	}

}
