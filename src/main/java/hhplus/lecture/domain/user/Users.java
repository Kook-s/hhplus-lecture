package hhplus.lecture.domain.user;

import hhplus.lecture.domain.lecture.LectureRegistration;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
public class Users {

    @Id
    @Column(name = "id")
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<LectureRegistration> registrations = new HashSet<>();

    public Users() {
    }

    public Users(Long id, String name, String email, Set<LectureRegistration> registrations) {
        this.name = name;
        this.email = email;
    }
}
