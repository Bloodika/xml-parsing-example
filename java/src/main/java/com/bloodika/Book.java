package com.bloodika;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@ToString
public class Book {
    String author;
    String title;
    String genre;
    double price;
    String publishDate;
    String description;
}
