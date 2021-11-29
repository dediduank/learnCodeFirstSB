package com.experimen.learnjpa.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lecture_tbl")
public class Lecture implements Serializable{

    @Id
    private String nik;
    
    @Column(name = "nama_dosen", length = 150)
    private String nama;

    @Column(name = "alamat_dosen")
    private String alamat;

    @Column(name = "nohp_dosen", length = 150)
    private String nohp;

    public Lecture() {
    }

    public Lecture(String nik, String nama, String alamat, String nohp) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.nohp = nohp;
    }

    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
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
