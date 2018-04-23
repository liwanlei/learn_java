/**
 * 
 */

/**
 * @author lileilei
 *Drawable.java
*2018Äê4ÔÂ1ÈÕ
 */
public interface Drawable {
	void draw();
}
class Rectanfle implements Drawable{

	
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
	}
	
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
    public static void main(String args[]) {
        Drawable d = new Circle();// In real scenario, object is provided by
                                    // method e.g. getDrawable()
        d.draw();
    }
}

