package com.OOP2again;

public class Rectangle {
	private int length, width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	public int perimeter() {
		return 2 * (length + width);
	}

	public String tostring() {
		return String.format("length- %d, width - %d, area - %d, perimeter - %d", length, width, area(), perimeter());
	}

}
