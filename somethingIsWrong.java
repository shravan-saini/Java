public class somethingIsWrong {

	public static class Rectangle	{
		int width,height;
		int area()	{
			return width*height;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Rectangle myRect;
		      myRect = new Rectangle();
		        myRect.width = 40;
		        myRect.height = 50;
		        System.out.println("myRect's area is " + myRect.area());
	}

}
