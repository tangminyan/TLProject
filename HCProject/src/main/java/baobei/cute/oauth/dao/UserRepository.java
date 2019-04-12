package baobei.cute.oauth.dao;

import baobei.cute.oauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tangminyan on 2019/3/19.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameCaseInsensitive(String lowerCaseLogin);
}
