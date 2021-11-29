package com.experimen.learnjpa.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_tbl")
public class Student implements Serializable {

    @Id
    private String nim;

    @Column(name = "nama_mhs", length = 150)
    private String name;

    @Column(name = "alamat_mhs", length = 255)
    private String alamat;

    @Column(name = "nohp_mhs", length = 16)
    private String nohp;

    public Student() {
    }

    public Student(String nim, String name, String alamat, String nohp) {
        this.nim = nim;
        this.name = name;
        this.alamat = alamat;
        this.nohp = nohp;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

}
