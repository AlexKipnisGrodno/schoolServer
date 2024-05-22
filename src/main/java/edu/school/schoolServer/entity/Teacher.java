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
@Table(name = "teachers")
public class Teacher{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;

    private String password;

    private String email;

    private int age;
    @Column(name = "birth_date")
    private Date birthDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private DaySchedule schedule;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Subject subject;
}