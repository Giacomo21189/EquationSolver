package model;

public class SecondGradeEquation implements IEquation {

	private static final String form= "ax*x+bx+c";
	
	private float[] parameters= new float[3];
	private float[] solutions=new float[2];
	
	@Override
	public String getForm() {
		return form;
	}

	@Override
	public float[] getParameters() {
		return parameters;
		
	}

	@Override
	public void setParameters(float... f) throws InvalidParametersException {
		switch (f.length) {
		case 0: case 1: case 2: default: 
			throw new InvalidParametersException();
		case 3: 
			if (f[0]!=0) {
				this.parameters=f;
			}else{
				throw new InvalidParametersException();}
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
			switch (f.length) {
			case 1: case 2: default:
				throw new InvalidParametersException();
			case 3: 
				try {
					if (a!=0) {
						if (b!=0 && c!=0) {
							this.solutions[0]=(float) ((-b+(Math.sqrt(b*b-4*a*c)))/(2*a));	//manca una radice!
							this.solutions[1]=(float) ((-b-(Math.sqrt(b*b-4*a*c)))/(2*a));	//manca una radice!
						}if (b==0 && c!=0) {
							this.solutions[0]= (float) Math.sqrt(c/a); 
							this.solutions[1]= (float) Math.sqrt(-c/a);
						}if(b!=0 && c==0){
							this.solutions[0]=0; 
							this.solutions[1]=-b/a;
						}if (b==0 && c==0) {
							this.solutions[0]=0; 
							this.solutions[1]=0;
						}}else{throw new InvalidParametersException();
						}
						
				} catch (ArithmeticException e) {
					throw new ArithmeticException();
				}}
			}
						
		@Override
		public String parseVectToString (float[] v) {
		String s="";
		for (int i = 0; i < v.length; i++) {			//verificare perchè non devo mettere v.length-1
			s+=v[i]+", ";
		}
		return s;
		};
	
	
}
