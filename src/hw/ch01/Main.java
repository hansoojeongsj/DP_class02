package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days","csh"));
        bookShelf.appendBook(new Book("Bible","hsj"));
        bookShelf.appendBook(new Book("Cinderella","ljh"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs","ljy"));

        // 명시적으로 Iterator를 사용하는 방법 
        //Iterator<Book> it = bookShelf.iterator();
        // 순서 반대로 출력
        Iterator<Book> it = bookShelf.iteratorBackWard();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법 
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();

        
    }
}
