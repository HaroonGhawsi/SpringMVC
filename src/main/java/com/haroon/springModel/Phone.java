package com.haroon.springModel;

import javax.persistence.*;
import java.util.Objects;

/**
 * Entitz bean with JPA annotations Hibernate provides JPA implementatioin
 */

@Entity
@Table(name = "PHONE")
public class Phone {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "review")
    private String review;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", review='" + review + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return getId() == phone.getId() &&
                Objects.equals(getName(), phone.getName()) &&
                Objects.equals(getReview(), phone.getReview());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getReview());
    }
}
