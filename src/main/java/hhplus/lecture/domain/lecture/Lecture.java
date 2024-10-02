package hhplus.lecture.domain.lecture;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Lecture {

    @Id
    @Column(name = "id")
    private Long id;

    private String name;
    private String instructor;
    private LocalDate date;
    @Column(name = "max_applicants")
    private int maxApplication;

    @OneToMany(mappedBy = "lecture", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<LectureRegistration> registration = new HashSet<>();

    @Version
    private Integer version;

    public Lecture() {
    }

    public Lecture(int maxApplication, LocalDate date, String instructor, String name, Long id) {
        this.maxApplication = maxApplication;
        this.date = date;
        this.instructor = instructor;
        this.name = name;
        this.id = id;
    }

    public boolean canApply() {
       return registration.size() < maxApplication;
    }


}
