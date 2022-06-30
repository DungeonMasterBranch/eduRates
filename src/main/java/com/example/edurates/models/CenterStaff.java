package com.example.edurates.models;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "center_staff")
@Entity
public class CenterStaff implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "center_id")
    private Center centerId;
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staffId;

    public CenterStaff() {
    }

    public CenterStaff(Center centerId, Staff staffId) {
        this.centerId = centerId;
        this.staffId = staffId;
    }

    public Center getCenterId() {
        return centerId;
    }

    public void setCenterId(Center centerId) {
        this.centerId = centerId;
    }

    public Staff getStaffId() {
        return staffId;
    }

    public void setStaffId(Staff staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "CenterStaff{" +
                "centerId=" + centerId +
                ", staffId=" + staffId +
                '}';
    }
}
