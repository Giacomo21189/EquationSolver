package model;

public class SecondGradeEquation implements IEquation {

	private static final String form= "ax*x+bx+c";
	
	private float[] parameters= new float[3]; 
	private float[] solutions= new float[2];

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
		switch (f.length) {
		case 0: case 1: case 2: default: 
			throw new InvalidParametersException();
		case 3: 
			if (f[0]!=0) {
				this.parameters=f;
			}else{
				throw new WrongGradeEquationException();}
			}
		}
	
	@Override
	public float[] getSolutions() {
		return solutions;
	}
	
	@Override
	public void solve(float...f) throws InvalidParametersException, ArithmeticException {
			float a=f[0]; 		
			float b=f[1]; 
			float c=f[2];
				try {
						if (b!=0 && c!=0) {
							this.solutions[0]=(float) ((-b+(Math.sqrt(b*b-4*a*c)))/(2*a));	//a è sempre diverso da zero, perchè l'ho detto in setParameters()!
							this.solutions[1]=(float) ((-b-(Math.sqrt(b*b-4*a*c)))/(2*a));	//e questo metodo prende in ingresso getParameters();
						}if (b==0 && c!=0) {
							this.solutions[0]= (float) Math.sqrt(c/a); 
							this.solutions[1]= (float) Math.sqrt(-c/a);
						}if(b!=0 && c==0){
							this.solutions[0]=0; 
							this.solutions[1]=-b/a;
						}if (b==0 && c==0) {
							this.solutions[0]=0; 
							this.solutions[1]=0;
						}
						
						
				} catch (ArithmeticException e) {
					throw new ArithmeticException();
				}}
			
						
		
	
	
}
