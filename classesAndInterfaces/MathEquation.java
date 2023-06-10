package classesAndInterfaces;

public class MathEquation {
	
	double leftVal, rightVal, result;
	char opCode;
	
	public MathEquation() { }
	public MathEquation(char opCode) {
		this.opCode = opCode;
	}
	public MathEquation(double leftVal, double rightVal, char opCode) {
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
//		this(opCode);	// This line will throw an error:: Constructors must be called at the very beginning in Constructor chaining.
	}
	
	void execute() {
		switch(opCode) {
		case 'a':
			result = leftVal + rightVal;
			break;
		case 's':
			result = leftVal - rightVal;
			break;
		case 'm':
			result = leftVal * rightVal;
			break;
		case 'd':
			result = rightVal != 0 ? leftVal / rightVal: 0.0d;
			break;
		default:
			System.out.println("Invalid Opcode: " + opCode);
			result = 0.0d;
			break;
		}
	}

}
