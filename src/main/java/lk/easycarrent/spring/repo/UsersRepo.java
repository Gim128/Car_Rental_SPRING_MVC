package lk.easycarrent.spring.repo;

import lk.easycarrent.spring.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users,String> {
}
