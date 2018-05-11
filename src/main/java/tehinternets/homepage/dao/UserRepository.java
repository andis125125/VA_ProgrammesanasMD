package tehinternets.homepage.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tehinternets.homepage.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
