class Box3 {
	private double width, height, length;

	Box3(double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}

	Box3( Box3 oldbox) {
		width = oldbox.returnDimens()[2];
		height = oldbox.returnDimens()[1];
		length = oldbox.returnDimens()[0];
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
	public double length() {
		return length;
	}
	public double height() {
		return height;
	}
	public double width() {
		return width;
	}

	public double[] returnDimens() {
		double[] dimens = {width, height, length};
		return dimens;
	}

}

class BoxTester3
{

  public static void main ( String[] args )
  {
     Box3 box = new  Box3( 2.5, 5.0, 6.0 ) ;
     Box3 identBox = new Box3(box);

     System.out.println( "Surface area: "  + box.surfaceArea() + " volume: " + box. volume() );

     System.out.println( "length: " + box.length() + " height: " + box.height() +
                         " width: " + box.width());

     System.out.println( "Surface area: "  + identBox.surfaceArea() + " volume: " + identBox. volume() );

     System.out.println( "length: " + identBox.returnDimens()[2] + " height: " + identBox.returnDimens()[1] +
                         " width: " + identBox.returnDimens()[0]);

  }
}