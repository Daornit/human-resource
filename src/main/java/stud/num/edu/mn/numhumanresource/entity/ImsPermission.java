package stud.num.edu.mn.numhumanresource.entity;

import lombok.Data;
import stud.num.edu.mn.numhumanresource.core.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "IMS_PERMISSION", schema = "HRM")
@SequenceGenerator(name="ImsPermissionSeq", sequenceName = "HRM.SEQ_IMS_PERMISSION", allocationSize = 1)
@Data
public class ImsPermission extends BaseEntity
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "ImsPermissionSeq", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Basic
    @Column(name = "NAME")
    private String name;
}