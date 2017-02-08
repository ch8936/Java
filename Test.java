public class Test{
	public static void main(String args[]) {
		
		int n = 0;
		
		for (int i=1;i<=100;i++){
			if (i % 3 == 0){
				System.out.println(i);
				n ++ ;
				continue;
			}
			
		if (n > 4)
			break;			
		}			
	}
}
