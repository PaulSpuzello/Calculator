package model;

public class getCalculation {
	private double numOne;
	private double numTwo;
	private double numThree;
	private double numFour;
	private double total;
	
	public getCalculation() {
		super();
		}
		public getCalculation(double numOne, double numTwo, double numThree, double numFour) {
		super();
			this.numOne = numOne;
			this.numTwo = numTwo;
			this.numThree = numThree;
			this.numFour = numFour;
			setTotal(numOne, numTwo, numThree, numFour); 
		}
		public void setTotal(double numOne, double numTwo, double numThree, double numFour) {
			this.numOne = numOne;
			this.numTwo = numTwo;
			this.numThree = numThree;
			this.numFour = numFour;
			total(numOne, numTwo, numThree, numFour); 
		}

		public void total(double numOne, double numTwo, double numThree, double numFour) {
			total = numOne + numTwo + numThree + numFour;
		}
	@Override
	public String toString() {
		return "Total: " + total;
		}
	}