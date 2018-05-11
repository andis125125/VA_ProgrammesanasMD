package tehinternets.homepage.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tehinternets.homepage.domain.Advertesment;

import java.util.List;

@Repository
public interface DataBaseOperations extends CrudRepository<Advertesment, Long> {
    List<Advertesment> findByAuthor(String author);
}
