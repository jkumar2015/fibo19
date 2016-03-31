
public class Rk {
	
		
		public static int fibonacciRec(int n){
			
			if(n<0){
				throw new ArithmeticException("Invalid Parameter");
			}
			if(n==0){
				return 0;
			}	
			
			if(n==1){
				return 1;
			}
			
			return fibonacciRec(n-1)+fibonacciRec(n-2);
		}
		
		public static long lukasArr(int n){
			
			Object[] obj;
			
			if(n<0){
				throw new ArithmeticException("Invalid Parameter");
			}
			if(n == 0){
				return 2;
			}
			if(n==1){
				return 1; 
			}
			
			
			return n+n+1;
		}
		
		public static void main(String[]args){
			System.out.println(fibonacciRec(10));
			System.out.println(lukasArr(2));
		}


	}



