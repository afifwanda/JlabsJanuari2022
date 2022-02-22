package tugas2;

public class CalculateMethod {
	
	public static int calculate(String calculate) {
		Child chd = new Child();
		int result = 0;
		String[] count = calculate.split("(?=[-+*/()])|(?<=[^-+*/][-+*/])|(?<=[()])");
        switch ( count[1] ) {
        case "+":
        	result = chd.addNumbers(count[0],count[2]);
            break;
        case "-": 
        	result = chd.subtractNumbers(count[0],count[2]);
            break;
        case "*":
        	result = chd.timesNumbers(count[0],count[2]);
            break;
        case "/":
        	result = chd.divideNumbers(count[0],count[2]);
            break;
        default:
        	return 0;
        }
        return result;
	}
	

}
