package com.sctrcd.supermini.domain;

import java.util.Date;
import javax.persistence.*;


/**
 * Created by user on 11/1/2016.
 */
@Entity
public class Version {

    @Id
    private String versionNo;
    @Column
    @Temporal(TemporalType.DATE)
    private Date creationDate;


    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

}
