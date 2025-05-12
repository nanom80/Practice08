package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//equals() 메소드를 작성하세요.
	@Override
    public boolean equals(Object obj) {
        // 같은 객체일 경우 true
        if (this == obj) return true;

        // null 또는 클래스 타입이 다르면 false
        if (obj == null || getClass() != obj.getClass()) return false;

        // 다운캐스팅 후 x 값 비교
        Point other = (Point) obj;
        return this.x == other.x;
    }
	
}
