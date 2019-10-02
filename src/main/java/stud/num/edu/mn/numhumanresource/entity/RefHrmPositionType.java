package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "REF_HRM_POSITION_TYPE", schema = "HRM")
@SequenceGenerator(name="RefHrmPositionTypeSeq", sequenceName = "HRM.SEQ_REF_HRM_POSITION_TYPE", allocationSize = 1)
@Data
public class RefHrmPositionType extends BaseEntity
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "RefHrmPositionTypeSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "CODE")
    private String code;

    @Basic
    @Column(name = "NAME")
    private String name;
}