package hhplus.lecture.interfaces.api.lecture;


import hhplus.lecture.application.LectureFacade;
import hhplus.lecture.interfaces.api.lecture.dto.LectureRequestDto;
import hhplus.lecture.interfaces.api.lecture.dto.LectureResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lecture")
public class LectureController {

    private final LectureFacade lectureFacade;

    public LectureController(LectureFacade lectureFacade) {
        this.lectureFacade = lectureFacade;
    }

    @PostMapping("/apply")
    public ResponseEntity<String> apply(@RequestBody LectureRequestDto requestDto) {
             boolean applied = lectureFacade.applyForLecture(requestDto);

        if (applied) {
            return ResponseEntity.ok("신청 성공");
        } else {
            return ResponseEntity.badRequest().body("신청 실패 : 정원이 초과했습니다.");
        }
    }
}
