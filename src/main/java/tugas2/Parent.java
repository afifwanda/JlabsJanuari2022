package tugas2;

public class Parent {
	
	public static int addNumbers (int n1, int n2) {
		int result = 0;
		try {
			result = n1 + n2;
			StaticMethod.checkInteger(result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error !");
		}
		System.out.println(result);
		return result;
	}
	
	public static int subtractNumbers (int n1, int n2) {
		int result = 0;
		try {
			result = n1 - n2;
			StaticMethod.checkInteger(result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error !");
		}
		System.out.println(result);
		return result;
	}


}
