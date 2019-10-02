package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "HRM_REPORT", schema = "HRM")
@SequenceGenerator(name="HrmReportSeq", sequenceName = "HRM.SEQ_HRM_REPORT", allocationSize = 1)
@Data
public class HrmReport extends BaseEntity
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "HrmReportSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "DATA")
    private String data;

    @Basic
    @Column(name = "REF_HRM_REPORT_ID")
    private Long refHrmReportId;

    @OneToOne
    @JoinColumn(name = "ID", referencedColumnName = "REF_HRM_REPORT_ID")
    @NotFound(action= NotFoundAction.IGNORE)
    private RefHrmReport refHrmReport;
}