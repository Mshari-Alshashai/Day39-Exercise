package com.example.day39exercise.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "name is required")
    private String name;

    @NotNull(message = "age is required")
    @Positive(message = "age must be positive")
    private Integer age;

    @NotEmpty(message = "email is required")
    @Email(message = "email should be in the right format")
    private String email;

    @NotNull(message = "salary is required")
    @Positive(message = "salary should be positive")
    private Integer salary;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address;
}
