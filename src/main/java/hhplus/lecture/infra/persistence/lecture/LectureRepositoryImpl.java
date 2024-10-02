package hhplus.lecture.infra.persistence.lecture;

import hhplus.lecture.domain.lecture.Lecture;
import hhplus.lecture.domain.lecture.LectureRepository;
import hhplus.lecture.domain.lecture.LectureService;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class LectureRepositoryImpl implements LectureRepository {

    private final JpaLectureRepository jpaLectureRepository;

    public LectureRepositoryImpl(JpaLectureRepository jpaLectureRepository) {
        this.jpaLectureRepository = jpaLectureRepository;
    }

    @Override
    public Lecture findById(Long id) {
        return jpaLectureRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 특강이 없습니다."));
    }

    @Override
    public List<Lecture> findAvailableLecturesByDate(LocalDate date) {
        return jpaLectureRepository.findAll().stream()
                .filter(lecture -> lecture.getDate().equals(date))
                .toList();
    }
}
