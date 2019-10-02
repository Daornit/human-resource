package stud.num.edu.mn.numhumanresource.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import stud.num.edu.mn.numhumanresource.entity.ImsRole;

@Repository
public interface ImsRoleDAO extends JpaRepository<ImsRole, Long> {
    @Query("SELECT s FROM ImsRole s where id = ?1")
    ImsRole findByIdTest(Long id);
}
