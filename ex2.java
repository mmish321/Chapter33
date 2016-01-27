class Box2 {
	private double width, height, length;

	Box2(double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}

	public double volume() {
		return width * height * length;
	}

	private double baseArea() {
		return width * length;
	}

	private double sideArea() {
		return width * height;
	}

	private double faceArea() {
		return length * height;
	}

	public double surfaceArea() {
		return 2 * faceArea() + 2 * sideArea() + 2 * baseArea();
	}

	public double[] returnDimens() {
		double[] dimens = {width, height, length};
		return dimens;
	}

}

class BoxTester2
{

  public static void main ( String[] args )
  {
     Box2 box = new  Box2( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Surface area: "  + box.surfaceArea() + " volume: " + box. volume() );

     System.out.println( "length: " + box.returnDimens()[2] + " height: " + box.returnDimens()[1] +
                         " width: " + box.returnDimens()[0]);

  }
}