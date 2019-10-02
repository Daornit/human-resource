package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "HRM_SETTING", schema = "HRM")
@SequenceGenerator(name="HrmSettingSeq", sequenceName = "HRM.SEQ_HRM_SETTING", allocationSize = 1)
@Data
public class HrmSetting extends BaseEntity
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "HrmSettingSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "NAME")
    private String name;

    @Basic
    @Column(name = "REF_TYPE_ID")
    private Long refTypeId;

    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "REF_TYPE_ID")
    @NotFound(action= NotFoundAction.IGNORE)
    private RefHrmSettingType refHrmSettingType;
}