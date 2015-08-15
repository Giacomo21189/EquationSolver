package model;

public interface IEquation {

	public String getForm();
	float[] getParameters();
	void setParameters(float...f) throws InvalidParametersException;
	float[] getSolutions();
	void setSolutions();
}
