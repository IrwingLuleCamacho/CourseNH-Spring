package com.ilulecam.course.user.infrastructure.pas;

import com.ilulecam.course.user.domain.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IUserPasRepository extends PagingAndSortingRepository<User, Long> {
    User findByUsername(String username);

    @Query(value = "select u.* from users u where u.username=?1 and u.password=?2", nativeQuery = true)
    User signInApplication(String username, String password);
}
