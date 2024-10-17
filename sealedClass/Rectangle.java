package sealedClass;

final class Rectangle implements Shape{
    final double length, width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}
