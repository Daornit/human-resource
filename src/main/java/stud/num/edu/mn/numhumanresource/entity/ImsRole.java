package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "IMS_ROLE", schema = "HRM")
@SequenceGenerator(name="ImsPermissionSeq", sequenceName = "HRM.SEQ_IMS_ROLE", allocationSize = 1)
@Data
public class ImsRole extends BaseEntity
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "ImsPermissionSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "NAME")
    private String name;

    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ImsPermission> permission = new ArrayList<>();
}