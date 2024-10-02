package hhplus.lecture.infra.persistence.lecture;

import hhplus.lecture.domain.lecture.Lecture;
import hhplus.lecture.domain.lecture.LectureRepository;
import hhplus.lecture.domain.lecture.LectureService;

import java.time.LocalDate;
import java.util.List;

public class LectureRepositoryImpl implements LectureRepository {

    private final JpaLectureRepository jpaLectureRepository;

    public LectureRepositoryImpl(JpaLectureRepository jpaLectureRepository) {
        this.jpaLectureRepository = jpaLectureRepository;
    }

    @Override
    public List<Lecture> findByDate(LocalDate date) {
        return jpaLectureRepository.findByDate(date);
    }
}
