package hhplus.lecture.infra.persistence.lecture;

import hhplus.lecture.domain.lecture.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface JpaLectureRepository extends JpaRepository<Lecture, Long> {

    List<Lecture> findByDate(LocalDate date);
}
