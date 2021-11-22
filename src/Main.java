//BERNIGA CHRISTIAN 4D 8/10/21
public class Main {
	public static void main(String[] args) {
		Frazione f1=new Frazione(2,4),f2=new Frazione(2,4);
		//test getters
		System.out.println("Fraction f1= "+f1.getNum()+"/"+f1.getDen());
		System.out.println("Fraction f2= "+f2.getNum()+"/"+f2.getDen()+"\n");
		//test toString
		System.out.println("Fraction f1= "+f1.toString());
		System.out.println("Fraction f2= "+f2.toString()+"\n");
		//test equals
		if(f1.equals())
			System.out.println("f1 num and den are equals \n");
		else
			System.out.println("f1 num and den are NOT equals \n");
		
		if(f1.equals(f2))
			System.out.println("f1 and f2 are equals ");
		else
			System.out.println("f1 and f2 are NOT equals ");
		System.out.println("");
		//test simplify
		System.out.println("Fraction f1 M.C.D= "+f1.mcd());
		System.out.println("Simplified fraction f1= "+f1.simplify()+"\n");
		System.out.println("Fraction f2 M.C.D= "+f2.mcd());
		System.out.println("Simplified fraction f2= "+f2.simplify()+"\n");
		//test sum
		System.out.println("sum between f1 and f2= "+f1.sum(f2)+"\n");
	}

}
