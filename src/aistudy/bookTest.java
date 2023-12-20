package aistudy;


class book {
    private String title;
    private String author;
    private int pages;

    public book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}

public class bookTest {
    public static void main(String[] args) {
        book b = new book("나와 고양이", "김주혁", 200);

        System.out.println(b.getTitle()+"," + b.getAuthor() +","+ b.getPages());
    }
}
