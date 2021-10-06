import java.util.*;

interface Shape {
    double perimeter();
    double area();
    void drawShape();

	class InterfaceShape {
		public static void main(String[] args) {
            Square square = new Square(3);
            System.out.println(square.getClass());
            System.out.println(square.getLength());
            System.out.println(square.perimeter());
            System.out.println(square.area());
            square.drawShape();
		}
	}

}

class Square implements Shape {
    private int length;
    public Square(int aLength) {
        length = aLength;
    }

    public int getLength() {
        return length;
    }

    public double perimeter() {
        return length * 4;
    }

    public double area() {
        return length * length;
    }

    public void drawShape() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}
