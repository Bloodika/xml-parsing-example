package com.bloodika;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException, JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Catalog.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Catalog catalog = (Catalog) unmarshaller.unmarshal(Files.newInputStream(Path.of("src/main/resources/Example.xml")));
        catalog.books.forEach(System.out::println);
    }
}