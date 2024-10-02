package hhplus.lecture.infra.persistence.user;

import hhplus.lecture.domain.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<Users, Long> {


}
