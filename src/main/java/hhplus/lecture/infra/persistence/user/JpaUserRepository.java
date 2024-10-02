package hhplus.lecture.infra.persistence.user;

import hhplus.lecture.domain.lecture.Lecture;
import hhplus.lecture.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User, Long> {


}
