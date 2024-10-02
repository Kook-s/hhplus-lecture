package hhplus.lecture.domain.lecture;

import hhplus.lecture.domain.user.User;
import jakarta.persistence.*;

@Entity
public class LectureRegistration {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User  user;

    @ManyToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

    public LectureRegistration() {
    }
}
