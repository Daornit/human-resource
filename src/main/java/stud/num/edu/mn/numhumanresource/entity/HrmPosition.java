package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "HRM_POSITION", schema = "HRM")
@SequenceGenerator(name="HrmPositionSeq", sequenceName = "HRM.SEQ_HRM_POSITION", allocationSize = 1)
@Data
public class HrmPosition extends BaseEntity
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "HrmPositionSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "NAME")
    private String name;

    @Basic
    @Column(name = "CODE")
    private String code;

    @Basic
    @Column(name = "BASE_SALARY")
    private Long baseSalary;

    @Basic
    @Column(name = "ADDITIONAL_SALARY")
    private Long additionalSalary;

    @Basic
    @Column(name = "IMS_ROLE_ID")
    private Long imsRoleId;

    @Basic
    @Column(name = "REF_POSITION_TYPE_ID")
    private Long refPositionTypeId;

    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "REF_POSITION_TYPE_ID")
    @NotFound(action= NotFoundAction.IGNORE)
    private RefHrmPositionType positionType;
}