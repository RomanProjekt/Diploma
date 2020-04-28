/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author patri
 */
public class Diplomarbeit {

    private int da_id;
    private String title;
    private int autor_id;
    private int schule_id;
    private String pdf;
    private int user_id;
    private Date datum;
    private String bild;
    private int download_count;
    private int click_count;

    //Default Konstruktor
    public Diplomarbeit() {

    }

    public Diplomarbeit(int da_id, String title, int autor_id, int schule_id, String pdf, int user_id, Date datum, String bild, int download_count, int click_count) {
        this.da_id = da_id;
        this.title = title;
        this.autor_id = autor_id;
        this.schule_id = schule_id;
        this.pdf = pdf;
        this.user_id = user_id;
        this.datum = datum;
        this.bild = bild;
        this.download_count = download_count;
        this.click_count = click_count;
    }

    public int getDa_id() {
        return da_id;
    }

    public void setDa_id(int da_id) {
        this.da_id = da_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }


    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSchule_id() {
        return schule_id;
    }

    public void setSchule_id(int schule_id) {
        this.schule_id = schule_id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getBild() {
        return bild;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }

    public int getDownload_count() {
        return download_count;
    }

    public void setDownload_count(int download_count) {
        this.download_count = download_count;
    }

    public int getClick_count() {
        return click_count;
    }

    public void setClick_count(int click_count) {
        this.click_count = click_count;
    }

    @Override
    public String toString() {
        return "DA: |||" + title + "|||";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.da_id;
        hash = 73 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Diplomarbeit other = (Diplomarbeit) obj;
        if (this.autor_id != other.autor_id) {
            return false;
        }
        if (this.schule_id != other.schule_id) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.pdf, other.pdf)) {
            return false;
        }
        if (!Objects.equals(this.bild, other.bild)) {
            return false;
        }
        return Objects.equals(this.datum, other.datum);
    }

}
