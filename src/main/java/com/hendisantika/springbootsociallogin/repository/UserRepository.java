package com.hendisantika.springbootsociallogin.repository;

import com.hendisantika.springbootsociallogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-social-login
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/05/20
 * Time: 07.00
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(final String username);
}
