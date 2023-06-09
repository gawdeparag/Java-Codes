package classesAndInterfaces;

public class MathEquation {
	
	double leftVal, rightVal, result;
	char opCode;
	
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
