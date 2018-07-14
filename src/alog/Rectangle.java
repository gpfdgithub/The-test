package alog;

public class Rectangle {
	int width;
	int height;
	int calArea()
	{
		return width*height;
	}
	
	int calPerimeter()
	{
		return 2*(width+height);
	}

	public static void main(String[] args) {

		Integer b[]=new Integer[100];
		for(int i=0;i<100;i++)
		{
			System.out.println(b[i].intValue()+1);
		}
		
		
		
	}

}
