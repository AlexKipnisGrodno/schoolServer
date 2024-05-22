package edu.school.schoolServer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "teachers")
public class Teacher{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstname", unique = true, nullable = false)
    private String firstName;
    @Column(name = "lastname", unique = true, nullable = false)
    private String lastName;

    private String password;

    private String email;

    private String role;
}
