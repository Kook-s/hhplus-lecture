package hhplus.lecture.domain.lecture;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Getter
public class Lecture {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String instructor;
    private LocalDate date;
    private int maxApplication;



}
