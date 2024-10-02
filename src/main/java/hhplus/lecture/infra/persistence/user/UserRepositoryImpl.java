package hhplus.lecture.infra.persistence.user;

import hhplus.lecture.domain.lecture.LectureService;
import hhplus.lecture.domain.user.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    private final JpaUserRepository jpaUserRepository;

    public UserRepositoryImpl(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

}
