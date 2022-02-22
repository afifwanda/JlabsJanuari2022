package tugas2;

public class Child extends Parent{
	
	public int timesNumbers (String n1, String n2) {
		int result = Integer.parseInt(n1) * Integer.parseInt(n2);
		try {
			if(!StaticMethod.checkInteger(result)) {
				throw new IllegalArgumentException("negative numbers are not allowed!");
			};
			System.out.println(result);
		} catch (IllegalArgumentException e) {
			throw e;
		}
		return result;
	}
	
	public int divideNumbers (String n1, String n2) {
		int result = Integer.parseInt(n1) / Integer.parseInt(n2);
		try {
			if(!StaticMethod.checkInteger(result)) {
				throw new IllegalArgumentException("negative numbers are not allowed!");
			};
			System.out.println(result);
		} catch (IllegalArgumentException e) {
			throw e;
		}
		return result;
	}

}
