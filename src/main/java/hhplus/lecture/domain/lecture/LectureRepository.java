package hhplus.lecture.domain.lecture;

import hhplus.lecture.infra.persistence.lecture.JpaLectureRepository;

import java.time.LocalDate;
import java.util.List;

public interface LectureRepository {
    Lecture findById(Long id);
    List<Lecture> findAvailableLecturesByDate(LocalDate date);
}
