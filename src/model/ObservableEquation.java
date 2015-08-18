package model;

import java.util.Observable;

public class ObservableEquation extends Observable implements IEquation {

	private IEquation iequation; 
	
	public ObservableEquation(IEquation ie) {
		this.iequation=ie;
	}

	public void setIequation(IEquation iequation) {
		this.iequation = iequation;
	}

	@Override
	public String getForm() {
		return iequation.getForm();
	}

	@Override
	public void solve(float...f) throws ArithmeticException, InvalidParametersException {
		iequation.solve(f);
		setChanged();
		notifyObservers();
	}

	@Override
	public void setParameters(float... p) throws InvalidParametersException {
		iequation.setParameters(p);
		setChanged();
		notifyObservers();
	}

	@Override
	public float[] getParameters() {

		return iequation.getParameters();
	}

	@Override
	public float[] getSolutions() {
		return iequation.getSolutions();
	}

	@Override
	public String parseVectToString(float[] v) {
		return iequation.parseVectToString(v);
	}


}
