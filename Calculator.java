
public class Calculator {
	public static void main(String[] args) {
		int count = 0, result = 0;
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int res;
		switch (c) {
			case 1: 
				CalcAdd obj=new CalcAdd();
				res=obj.add(a, b);
				break;
			case 2: 
				CalcSub obj2=new CalcSub();
				res=obj2.sub(a, b);
				break;
			case 3: 
				CalcDivide obj3=new CalcDivide();
				res=obj3.divide(a, b);
				break;
				
		}

	}
}
