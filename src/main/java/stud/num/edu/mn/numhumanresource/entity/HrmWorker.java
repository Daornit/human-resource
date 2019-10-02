package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "HRM_WORKER", schema = "HRM")
@SequenceGenerator(name="HrmWorkerSeq", sequenceName = "HRM.SEQ_HRM_WORKER", allocationSize = 1)
@Data
public class HrmWorker extends BaseEntity
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "HrmWorkerSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "LAST_NAME")
    private String lastName;

    @Basic
    @Column(name = "FIRST_NAME")
    private String firstName;

    @Basic
    @Column(name = "BIRTH_DATE")
    private String birthDate;

    @Basic
    @Column(name = "REPORT_ID")
    private Long reportId;

    @Basic
    @Column(name = "POSITION_ID")
    private Long positionId;

    @Basic
    @Column(name = "GENDER")
    private Long gender;

    @Basic
    @Column(name = "REF_WORKER_STATUS_ID")
    private Long refWorkerStatusId;

    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "REF_WORKER_STATUS_ID")
    @NotFound(action= NotFoundAction.IGNORE)
    private RefHrmWorkerStatus refHrmWorkerStatus;

    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "REPORT_ID")
    @NotFound(action= NotFoundAction.IGNORE)
    private HrmReport hrmReport;
}