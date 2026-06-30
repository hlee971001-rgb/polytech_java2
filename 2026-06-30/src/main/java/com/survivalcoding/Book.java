package com.survivalcoding;

import java.util.Date;
import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private Date publishDate;
    private String comment;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(title, book.title) && Objects.equals(publishDate, book.publishDate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(publishDate);
        return result;
    }

    @Override
    public int compareTo(Book other) {
        return other.publishDate.compareTo(this.publishDate);
    }

    @Override
    public Book clone() {
        Book result = new Book();
        result.title = this.title;
        result.publishDate = (Date) this.publishDate.clone();
        result.comment = this.comment;
        return result;
    }
}