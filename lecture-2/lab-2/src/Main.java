public class Main {
    public static void main(String[] args) {
        var rectangle1 = new Rectangle(2, 4);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getDiagonal());

        var rectangle2 = new Rectangle(3, 6);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getDiagonal());
    }
}