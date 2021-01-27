package com.statt.todo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;

    @NonNull
    @NotBlank(message = "Title can't be blank")
    @Size(min = 5, max = 255, message = "Title must be between {min} and {max} characters.")
    private String title;

    private Boolean completed = false;
}
