package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "HRM_SALARY", schema = "HRM")
@SequenceGenerator(name="HrmSalarySeq", sequenceName = "HRM.SEQ_HRM_SALARY", allocationSize = 1)
@Data
public class HrmSalary extends BaseEntity
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "HrmSalarySeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "POSITION_ID")
    private Long positionId;

    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "POSITION_ID")
    @NotFound(action= NotFoundAction.IGNORE)
    private HrmPosition hrmPosition;

    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<HrmTimeKeeping> timeKeepings = new ArrayList<>();
}