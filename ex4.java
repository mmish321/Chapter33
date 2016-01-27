class Box4 {
	private double width, height, length;

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

	Box4(double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}

	Box4( Box4 oldBox) {
		width = oldBox.returnDimens()[0];
		height = oldBox.returnDimens()[1];
		length = oldBox.returnDimens()[2];
	}

	public Box4 biggerBox( Box4 oldBox ) {
		double w = oldBox.returnDimens()[0] * 1.25;
		double h = oldBox.returnDimens()[1] * 1.25;
		double l = oldBox.returnDimens()[2] * 1.25;
		return new Box4(w, h, l);
	}

	public Box4 smallerBox( Box4 oldBox) {
		double w = oldBox.returnDimens()[0] * 0.75;
		double h = oldBox.returnDimens()[1] * 0.75;
		double l = oldBox.returnDimens()[2] * 0.75;
		return new Box4(w, h, l);
	}

	public void print() {
	 System.out.println( "Surface area: "  + surfaceArea() + " volume: " +  volume() );

     System.out.println( "length: " + returnDimens()[2] + " height: " + returnDimens()[1] +
                         " width: " + returnDimens()[0]);
	}

}

class BoxTester4
{

  public static void main ( String[] args )
  {
     Box4 box = new Box4( 2.5, 5.0, 6.0 );
     Box4 identBox = new Box4(box);
     Box4 biggerBox = box.biggerBox( box );
     Box4 smallerBox = box.smallerBox( box );
     box.print();
     identBox.print();
     biggerBox.print();
     smallerBox.print();

  }
}