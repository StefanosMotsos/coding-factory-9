package gr.aueb.cf.cf9.ch16.builder_pattern;

public class Book {
    private final long id;
    private final String title;
    private final String author;
    private final String isbn;

    private Book (Builder builder) {
        this.id = builder.id;
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.author = builder.author;
    }

    public long getId() {return id;}

    public String getIsbn() {return isbn;}

    public String getTitle() {return title;}

    public String getAuthor() {return author;}



    public static class Builder {
        private final long id;
        private final String isbn;
        private String title = "";
        private String author = "";

        public Builder(long id, String isbn) {
            this.id = id;
            this.isbn = isbn;
        }

        //Fluent Setter - returns the Builder object.
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.title = author;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
