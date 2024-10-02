package hhplus.lecture.application;


import hhplus.lecture.domain.lecture.Lecture;
import hhplus.lecture.domain.lecture.LectureService;
import hhplus.lecture.interfaces.api.lecture.dto.LectureRequestDto;
import org.springframework.stereotype.Component;


/**
 * LectureFacade는 파사드 패턴을 적용하여 컨트롤러와 서비스 사이의 인터페이스 역할을 합니다.
 * 이 클래스는 복잡한 비즈니스 로직을 캡슐화하여 간단한 인터페이스를 제공합니다.
 */
@Component
public class LectureFacade {

    private final LectureService lectureService;

    public LectureFacade(LectureService lectureService) {
        this.lectureService = lectureService;
    }

    /**
     * 특강 신청 로직을 캡슐화하여 처리합니다.
     * @param requestDto - 클라이언트로부터 전달받은 요청 데이터
     * @return 신청 성공 여부
     */
    public boolean applyForLecture(LectureRequestDto requestDto) {
        return lectureService.applyForLecture(requestDto.getLectureId(), requestDto.getUserId());
    }
}
