package hhplus.lecture.interfaces.api.lecture.dto;

import hhplus.lecture.domain.lecture.Lecture;

public class LectureResponseDto {

    private Long id;
    private String name;
    private String instructor;

    public static LectureResponseDto forEntity(Lecture lecture) {
        LectureResponseDto dto = new LectureResponseDto();
        dto.id = lecture.getId();
        dto.name = lecture.getName();
        dto.instructor = lecture.getInstructor();
        return dto;
    }
}
