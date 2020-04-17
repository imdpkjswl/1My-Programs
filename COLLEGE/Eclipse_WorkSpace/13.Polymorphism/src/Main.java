class shape {
	void draw()
	{
		System.out.println("Drawing...");
	}
}

class Rectangle extends shape {
	void draw()
	{
		System.out.println("Drawing Rectangle...");
	}
}

class Circle extends shape {
	void draw()
	{
		System.out.println("Drawing Circle...");
	}
}

class Triangle extends shape {
	void draw()
	{
		System.out.println("Drawing Triangle...");
	}
}

public class Main {

	public static void main(String[] args) {
		
		shape s; // Upcasting
		
		s = new Rectangle();
		s.draw();

		s = new Circle();
		s.draw();
		
		s = new Triangle();
		s.draw();
		
	}

}
