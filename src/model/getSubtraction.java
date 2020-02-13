package model;

public class getSubtraction {
	private double baseNum;
	private double numOne;
	private double numTwo;
	private double numThree;
	private double numFour;
	private double total;
	
	public getSubtraction() {
		super();
		}
		public getSubtraction(double baseNum, double numOne, double numTwo, double numThree, double numFour) {
		super();
			this.baseNum = baseNum;
			this.numOne = numOne;
			this.numTwo = numTwo;
			this.numThree = numThree;
			this.numFour = numFour;
			setTotal(baseNum, numOne, numTwo, numThree, numFour); 
		}
		public void setTotal(double baseNum, double numOne, double numTwo, double numThree, double numFour) {
			this.baseNum = baseNum;
			this.numOne = numOne;
			this.numTwo = numTwo;
			this.numThree = numThree;
			this.numFour = numFour;
			total(baseNum, numOne, numTwo, numThree, numFour); 
		}

		public void total(double baseNum, double numOne, double numTwo, double numThree, double numFour) {
			total = baseNum - numOne - numTwo - numThree - numFour;
		}
	@Override
	public String toString() {
		return "Total: " + total;
		}
	}