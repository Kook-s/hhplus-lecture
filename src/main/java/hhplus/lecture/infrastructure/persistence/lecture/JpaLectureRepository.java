package hhplus.lecture.infrastructure.persistence.lecture;

import hhplus.lecture.domain.lecture.Lecture;
import hhplus.lecture.domain.lecture.LectureRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaLectureRepository extends JpaRepository<Lecture, Long> {
}
