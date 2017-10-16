package Task1;

public class main {
    public static void main(String[] args) {
        MyTriangle triangle = new MyTriangle(0,0, 0,3, 4,0 );
        System.out.println(triangle);
        Author author1 = new Author("Petya", "e1",'m');
        Author author2 = new Author("Vasya", "e2",'m');
        Author[] manyAuthors = new Author[]{author1,author2};
        Book book = new Book("WAR",manyAuthors,200,3);
        System.out.println(book);
        System.out.println(book.getAuthorsNames());
    }
}
