package model;

public interface IEquation {

	public String getForm();
	public float[] getParameters();
	public void setParameters(float...f) throws InvalidParametersException, WrongGradeEquationException;
	public float[] getSolutions();
	public void solve(float...f) throws InvalidParametersException, ArithmeticException; 
}
