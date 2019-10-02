package stud.num.edu.mn.numhumanresource.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import stud.num.edu.mn.numhumanresource.entity.RefTimeType;

@Repository
public interface RefTimeTypeDAO extends CrudRepository<RefTimeType, Long> {
}
