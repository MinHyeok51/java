package inheritance;

//원
class Circle extends Shape {
int radius; // 반지름

/* 3. 원의 넓이를 구하도록 area()를 재정의하세요. */
public double area() {
	return Math.PI*radius*radius;
}
}
