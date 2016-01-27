class Box5 {
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
		return (2 * faceArea()) + (2 * sideArea()) + (2 * baseArea());
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

	Box5(double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}

	Box5( Box5 oldBox) {
		width = oldBox.returnDimens()[0];
		height = oldBox.returnDimens()[1];
		length = oldBox.returnDimens()[2];
	}

	public Box5 biggerBox( Box5 oldBox ) {
		double w = oldBox.returnDimens()[0] * 1.25;
		double h = oldBox.returnDimens()[1] * 1.25;
		double l = oldBox.returnDimens()[2] * 1.25;
		return new Box5(w, h, l);
	}

	public Box5 smallerBox( Box5 oldBox) {
		double w = oldBox.returnDimens()[0] * 0.75;
		double h = oldBox.returnDimens()[1] * 0.75;
		double l = oldBox.returnDimens()[2] * 0.75;
		return new Box5(w, h, l);
	}

	public boolean nests( Box5 outsideBox ) {
		return (length < outsideBox.returnDimens()[2] && height < outsideBox.returnDimens()[1] && width < outsideBox.returnDimens()[0]);
	}

	public void print() {
	 System.out.println( "Surface area: "  + surfaceArea() + " volume: " +  volume() );

     System.out.println( "length: " + returnDimens()[2] + " height: " + returnDimens()[1] +
                         " width: " + returnDimens()[0]);
	}

}

class BoxTester5
{

  public static void main ( String[] args )
  {
     Box5 box = new Box5( 2.5, 5.0, 6.0 );
     Box5 identBox = new Box5(box);
     Box5 biggerBox = box.biggerBox( box );
     Box5 smallerBox = box.smallerBox( box );
     box.print();
     identBox.print();
     biggerBox.print();
     smallerBox.print();

     System.out.println(box.nests(smallerBox)); //false
     System.out.println(box.nests(biggerBox)); //true
     System.out.println(smallerBox.nests(biggerBox)); //true

  }
}