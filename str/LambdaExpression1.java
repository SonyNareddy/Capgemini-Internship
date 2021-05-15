package lab9streamAPI.str;

interface Power{
	public double doPower(int x, int y);
}
public class LambdaExpression1 {

	public static void main(String[] args) {
		LambdaExpression1 obj = new LambdaExpression1();
		obj.doPower();
	}
	void doPower() {
		Power p = (x,y) -> Math.pow(x, y);
		double res = p.doPower(2, 3);
		System.out.println(res);
		
	}

}