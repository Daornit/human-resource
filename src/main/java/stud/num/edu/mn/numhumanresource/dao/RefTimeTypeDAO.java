package stud.num.edu.mn.numhumanresource.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import stud.num.edu.mn.numhumanresource.entity.RefTimeType;

import java.util.List;

@Repository
public interface RefTimeTypeDAO extends CrudRepository<RefTimeType, Long> {
    @Query("SELECT a FROM RefTimeType a")
    List<RefTimeType> findAllByQuery();
}
