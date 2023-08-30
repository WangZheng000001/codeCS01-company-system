package com.seisoul.entity;

import java.sql.Date;
import java.time.LocalTime;

public class ReserveEntity {

   private String reserveName;
   private Integer reserveId;
   private String reserveReason;
   private Date reserveDate;
   private LocalTime reserveTime;
   private String reserveEmail;

    public String getReserveName() {
        return reserveName;
    }

    public void setReserveName(String reserveName) {
        this.reserveName = reserveName;
    }

    public Integer getReserveId() {
        return reserveId;
    }

    public void setReserveId(Integer reserveId) {
        this.reserveId = reserveId;
    }

    public String getReserveReason() {
        return reserveReason;
    }

    public void setReserveReason(String reserveReason) {
        this.reserveReason = reserveReason;
    }

    public Date getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }

    public LocalTime getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(LocalTime reserveTime) {
        this.reserveTime = reserveTime;
    }

    public String getReserveEmail() {
        return reserveEmail;
    }

    public void setReserveEmail(String reserveEmail) {
        this.reserveEmail = reserveEmail;
    }
}


