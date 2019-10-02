package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "HRM_TIME_KEEPING", schema = "HRM")
@SequenceGenerator(name="HrmTimeKeepingSeq", sequenceName = "HRM.SEQ_HRM_TIME_KEEPING", allocationSize = 1)
@Data
public class HrmTimeKeeping extends BaseEntity
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "HrmTimeKeepingSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "WORKER_ID")
    private Long workerId;

    @Basic
    @Column(name = "ARRIVED_TIME")
    private Date arrivedTime;

    @Basic
    @Column(name = "WENT_TIME")
    private Date wentTime;

    @Basic
    @Column(name = "EXTRA_TIME")
    private Long extraTime;

    @Basic
    @Column(name = "REF_TIME_TYPE_ID")
    private Long refTimeTypeId;

    @Basic
    @Column(name = "REPORT_ID")
    private Long reportId;

    @Basic
    @Column(name = "HRM_SETTING_ID")
    private Long hrmSettingId;

    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "REPORT_ID")
    @NotFound(action= NotFoundAction.IGNORE)
    private HrmReport report;

    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "REF_TIME_TYPE_ID")
    @NotFound(action= NotFoundAction.IGNORE)
    private RefTimeType refTimeType;

    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "HRM_SETTING_ID")
    @NotFound(action= NotFoundAction.IGNORE)
    private HrmSetting hrmSetting;


}