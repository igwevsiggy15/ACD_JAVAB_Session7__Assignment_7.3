package Assignment7_3;

public class AppendString {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(1);
		System.out.println("String: \"" + sb + "\""
				+ "\nLength: " + sb.length() 
				+ "\nCapacity: "+ sb.capacity());
		
		sb.append("12");
		System.out.println("\nString: \"" + sb + "\""
				+ "\nLength: " + sb.length() 
				+ "\nCapacity: "+ sb.capacity());
		
		sb.append("123");
		System.out.println("\nString: \"" + sb + "\""
				+ "\nLength: " + sb.length() 
				+ "\nCapacity: "+ sb.capacity());
		
		sb.append("123456");
		System.out.println("\nString: \"" + sb + "\""
				+ "\nLength: " + sb.length() 
				+ "\nCapacity: "+ sb.capacity());
	}
}