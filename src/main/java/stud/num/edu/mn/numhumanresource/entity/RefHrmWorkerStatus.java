package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ref_hrm_worker_status", schema = "HRM")
@SequenceGenerator(name="RefHrmWorkerStatusSeq", sequenceName = "HRM.SEQ_ref_hrm_worker_status", allocationSize = 1)
@Data
public class RefHrmWorkerStatus extends BaseEntity
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "RefHrmWorkerStatusSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "CODE")
    private String code;

    @Basic
    @Column(name = "NAME")
    private String name;
}