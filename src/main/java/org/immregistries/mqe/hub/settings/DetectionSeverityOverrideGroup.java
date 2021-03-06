package org.immregistries.mqe.hub.settings;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DETECTION_SEVERITY_OVERRIDE_GROUP", indexes = { @Index(name = "IDX_DETECTION_SEVERITY_OVERRIDE_GROUP_X1", columnList = "name") })
public class DetectionSeverityOverrideGroup {

  @Id
  @SequenceGenerator(name = "DETECTION_SEVERITY_OVERRIDE_GROUP_GENERATOR", sequenceName = "DETECTION_SEVERITY_OVERRIDE_GROUP_SEQ")
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DETECTION_SEVERITY_OVERRIDE_GROUP_GENERATOR")
  @Column(name = "DETECTION_SEVERITY_OVERRIDE_GROUP_ID")
  private long id;

  private String name;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdDate;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public String toString() {
    return "DETECTION_SEVERITY_OVERRIDE_GROUP{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", createdDate=" + createdDate +
        '}';
  }
}
