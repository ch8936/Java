public class Feblia{
	public static void main (String[] args){
		System.out.println(method(5));
	}	
	
	public static int method(int i){
			if (i == 1 || i == 2)
				return 1;
			else 		
				return method(i -2) + method(i -1);		
	}
}
