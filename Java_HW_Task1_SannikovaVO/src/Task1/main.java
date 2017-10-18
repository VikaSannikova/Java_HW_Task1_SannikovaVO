package Task1;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"black");
        System.out.println(circle.toString());
        System.out.println("area "+circle.getArea());
        System.out.println();

        Rectangle rectangle = new Rectangle(2,5);
        System.out.println(rectangle.toString());
        System.out.println("area "+rectangle.getArea());
        System.out.println("petimetr "+ rectangle.getPerimetr());
        System.out.println();

        Employee employee = new Employee(1,"Olya", "Petrova",10000);
        System.out.println(employee.toString());
        System.out.println("year "+employee.getAnnualSalary());
        System.out.println("percent 25 "+employee.raiseSalary(25));
        System.out.println(employee);
        System.out.println();

        Author author1 = new Author("Petya", "e1",'m');
        Author author2 = new Author("Vasya", "e2",'m');
        Author[] manyAuthors = new Author[]{author1,author2};
        Book book = new Book("WAR",manyAuthors,200,3);
        System.out.println(book);
        System.out.println(book.getAuthorsNames());
        System.out.println();

        MyPoint point = new MyPoint(1,2);
        MyPoint point1 = new MyPoint(1,0);
        MyPoint point2 = new MyPoint(3,4);
        System.out.println(point.toString());
        System.out.println("dist(0.0) "+ point.distance());
        System.out.println("dist "+point.distance(point1));
        System.out.println();




        MyTriangle triangle = new MyTriangle(0,0, 0,3, 4,0 );
        MyTriangle triangle1 = new MyTriangle(point,point1,point2);
        System.out.println(triangle.toString());
        System.out.println(triangle1.toString());
        System.out.println("perimetr "+triangle.getPerimetr());
        System.out.println("type t1 "+triangle.getType());
        System.out.println("type t2 "+triangle1.getType());


    }
}
