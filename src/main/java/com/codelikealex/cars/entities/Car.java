package com.codelikealex.cars.entities;

import com.codelikealex.cars.util.DateAudit;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "posts")
@Getter
@NoArgsConstructor
public final class Car extends DateAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "price")
    private String price;
    @Column(name = "short_description")
    private String shortDescription;
    @Column(name = "description")
    private String description;
    @Column(name = "additional_information")
    private String additionalInformation;
    @Column(name = "car_location")
    private String carLocation;
    @Column(name="author")
    private String author;

    private Car(String title, String price, String shortDescription, String description, String additionalInformation, String carLocation, String author) {
        this.title = title;
        this.price = price;
        this.shortDescription = shortDescription;
        this.description = description;
        this.additionalInformation = additionalInformation;
        this.carLocation = carLocation;
        this.author = author;
    }

    public static Car createPostWithFullDetails(String title, String price, String shortDescription, String description, String additionalInformation, String carLocation, String author){
        return new Car(title, price, shortDescription, description, additionalInformation, carLocation, author);
    }
}
