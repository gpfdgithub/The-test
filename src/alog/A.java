package alog;

public class A extends B {
	int x=200;
	
	void port(){
		System.out.println(x);
		System.out.println(super.x);    
		
	}

	public static void main(String[] args) {
		new A().port();
		
	}

}

class B
{
	int x=100;
}
