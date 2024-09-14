import java.lang.*;

class Test1 {
		public static void main(String[] args)
		{
			Test2 t2 = new Test2();
			t2.division(5,0);
		}
}

class Test2 extends Test1{
	public void division(int a,int b){
			try{
				int c = a/b;
				System.out.println("a/b: " + c);
			}
			catch (ArithmeticException e){
				System.out.println("You can't divide by 0");
				System.out.println(e);
			}
	}
} 