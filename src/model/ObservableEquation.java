package model;

import java.util.Observable;

public class ObservableEquation extends Observable implements IEquation {

	private IEquation iequation; 
	
	public void setIequation(IEquation iequation) {
		this.iequation = iequation;
		super.setChanged();
		super.notifyObservers();
		
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
	public void setParameters(float... p) throws InvalidParametersException, WrongGradeEquationException {
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


}
