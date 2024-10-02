package hhplus.lecture.domain.lecture;

import hhplus.lecture.domain.user.Users;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "lecture_registration")
@Getter
public class LectureRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

    public LectureRegistration() {
    }

    public LectureRegistration(Users user, Lecture lecture) {
        this.user = user;
        this.lecture = lecture;
    }
}
