package hhplus.lecture.domain.lecture;


import hhplus.lecture.domain.user.Users;
import hhplus.lecture.domain.user.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LectureService {

    private final LectureRepository lectureRepository;
    private final UserRepository userRepository;

    public LectureService(LectureRepository lectureRepository, UserRepository userRepository) {
        this.lectureRepository = lectureRepository;
        this.userRepository = userRepository;
    }

    /**
     * 특정 사용자가 특정 특강에 신청하는 로직을 처리합니다.
     * @param userId - 사용자 ID
     * @param lectureId - 특강 ID
     * @return 신청 성공 여부
     */
    @Transactional
    public boolean applyForLecture(Long lectureId, Long userId) {
        Users user = userRepository.findById(userId);
        Lecture lecture = lectureRepository.findById(lectureId);

        // 이미 사용자가 해당 강의를 신청했는지 확인
        boolean alreadyRegistered = lecture.getRegistration().stream()
                .anyMatch(registration -> registration.getUser().getId().equals(userId));

        if (alreadyRegistered) {
            throw new IllegalStateException("이미 이 강의에 신청하셨습니다."); // 중복 신청 방지
        }

        if(!lecture.canApply()){
            return false;
        }

        LectureRegistration registration = new LectureRegistration(user, lecture);
        lecture.getRegistration().add(registration);
        user.getRegistrations().add(registration);

        return true;
    }
}
