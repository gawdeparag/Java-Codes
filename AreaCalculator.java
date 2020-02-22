class AreaCalculator{
    public static void main(String[] args){

        System.out.println(area(5));
        System.out.println(area(5, 6));
        System.out.println(area(5.2));
    }

    public static long area(long s) {
        return s * s;
    }

    public static long area(long a, long b) {
        return a * b;
    }

    public static double area(double r) {
        return 3.14*r*r;
    }

    // This is a classic example of "Method Overloading"
}