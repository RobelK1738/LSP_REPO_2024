package org.howard.edu.lsp.midterm.question1;

/**
 * The Book class represents a book in a library with title, author, ISBN, and year published.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Constructor for the Book class to initialize a new book object.
     *
     * @param title         The title of the book.
     * @param author        The author of the book.
     * @param ISBN          The ISBN of the book.
     * @param yearPublished The year the book was published.
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getters and Setters

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The new title of the book.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author The new author of the book.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the ISBN of the book.
     *
     * @param ISBN The new ISBN of the book.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Gets the year the book was published.
     *
     * @return The year the book was published.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the year the book was published.
     *
     * @param yearPublished The new year the book was published.
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * Overrides the equals method to compare two Book objects. Two books are considered equal if they
     * have the same ISBN and author.
     *
     * @param obj The object to compare with.
     * @return true if the books are considered equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // If the objects are the same instance, return true
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // If the object is null or not a Book, return false
        }

        Book otherBook = (Book) obj; // Cast obj to Book

        // Compare ISBN and author to determine equality
        return this.ISBN.equals(otherBook.ISBN) && this.author.equals(otherBook.author);
    }

    /**
     * Overrides the toString method to return a meaningful string representation of a Book object.
     *
     * @return A string representation of the Book.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
