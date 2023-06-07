package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
//@Document(collection = "books")
public class Book {
    //    @Id
    private String id;
    private String title;
    private String description;
    private String imageLink;
}
