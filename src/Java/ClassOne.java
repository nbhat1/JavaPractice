package Java;

public class ClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTwo.methodOfClassTwo();

	}
	
	public static class ClassTwo{
		
		public static void methodOfClassTwo(){
			System.out.println("Method of class two");
		}
		
	}

}
