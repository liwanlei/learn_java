package com.studay;

public class ShapeFactary {
	public Shape getShap(String shapeType) {
		if (shapeType==null) {
			return null;
		} 
		if (shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		}else if (shapeType.equalsIgnoreCase("Rec")) {
			return new Rectangle();
		}else if (shapeType.equalsIgnoreCase("Squire")) {
			return new Square();
		}
		return null;
	}
	public static void main(String[] args) {
		ShapeFactary shapeFactary=new ShapeFactary();
		Shape shape=shapeFactary.getShap("circle");
		shape.draw();
	}
}
