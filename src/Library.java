
    class Book {
    private String title;
    private String author;
    public int pages;

    public Book(String title, String author, int pages) {
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

    public class Library {
        public static void main(String[] args) {
            Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
            Book book2 = new Book("1984", "George Orwell", 328);
            int page = book1.pages;
            System.out.println(page);
            System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor() + " (" + book1.getPages() + " pages)");
            System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor() + " (" + book2.getPages() + " pages)");
        }
    }