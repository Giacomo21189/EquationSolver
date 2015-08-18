package model;

public interface IEquation {

	public String getForm();
	public float[] getParameters();
	public void setParameters(float...f) throws InvalidParametersException;
	public float[] getSolutions();
	public void solve(float...f) throws InvalidParametersException, ArithmeticException; 
	public String parseVectToString (float[] v);
}
