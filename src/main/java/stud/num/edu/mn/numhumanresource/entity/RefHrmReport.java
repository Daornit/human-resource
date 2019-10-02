package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "REF_HRM_REPORT", schema = "HRM")
@SequenceGenerator(name="RefHrmReportSeq", sequenceName = "HRM.SEQ_REF_HRM_REPORT", allocationSize = 1)
@Data
public class RefHrmReport extends BaseEntity
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "RefHrmReportSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "CODE")
    private String code;

    @Basic
    @Column(name = "NAME")
    private String name;
}