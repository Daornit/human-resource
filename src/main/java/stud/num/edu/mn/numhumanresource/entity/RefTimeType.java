package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "REF_TIME_TYPE", schema = "HRM")
@SequenceGenerator(name="refTimeTypeSeq", sequenceName = "HRM.SEQ_REF_TIME_TYPE", allocationSize = 1)
@Data
public class RefTimeType extends BaseEntity implements Serializable
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "refTimeTypeSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "CODE")
    private String code;

    @Basic
    @Column(name = "NAME")
    private String name;
}