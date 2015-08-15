package model;

import java.util.Observable;

public class ObservableEquation extends Observable implements IEquation {

	private IEquation iequation=new FirstGradeEquation();

	public void setIequation(IEquation iequation) {
		this.iequation = iequation;
	}

	@Override
	public String getForm() {
		return iequation.getForm();
	}

	@Override
	public void setSolutions() {
		iequation.setSolutions();
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

}
