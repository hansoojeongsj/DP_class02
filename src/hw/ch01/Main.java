package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(6);
        bookShelf.appendBook(new Book("자료구조론","박우창"));
        bookShelf.appendBook(new Book("소프트웨어분석설계","최승훈"));
        bookShelf.appendBook(new Book("프로그래머수학","이주영"));
        bookShelf.appendBook(new Book("컴퓨터동작원리","유견아"));
        bookShelf.appendBook(new Book("컴퓨터그래픽스", "이경미"));
        bookShelf.appendBook(new Book("달러구트 꿈 백화점", "이미예"));

        // 명시적으로 Iterator를 사용하는 방법 
        //Iterator<Book> it = bookShelf.iterator();
        // 순서 반대로 출력
        Iterator<Book> it = bookShelf.iteratorBackWard();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName()+", "+book.getAuthor());

        }
        System.out.println();

        // 확장 for문을 사용하는 방법 
        System.out.println("확장 for문을 사용하는 방법");
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();

        
    }
}
