class Box {
	private double width, height, length;

	Box(double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}

	public double volume() {
		return width * height * length;
	}

	public double baseArea() {
		return width * length;
	}

	public double surfaceArea() {
		return 2 * width + 2 * length + 2 * height;
	}

	public double[] returnDimens() {
		double[] dimens = {width, height, length};
		return dimens;
	}

}

class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Area: "  + box.baseArea() + " volume: " + box. volume() );

     System.out.println( "length: " + box.returnDimens()[2] + " height: " + box.returnDimens()[1] +
                         " width: " + box.returnDimens()[0]);

  }
}