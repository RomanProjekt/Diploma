/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author patri
 */
public class Diplomarbeit {
    private int da_id;
    private String title;
    private int autor_id;
    private int sw_id;
    private String pdf;
    private String user_id;
    private String datum;
    private String bild;
    private int download_count;
    private int click_count;

    public Diplomarbeit(int da_id, String title, int autor_id, int sw_id, String pdf, String user_id, String datum, String bild, int download_count, int click_count) {
        this.da_id = da_id;
        this.title = title;
        this.autor_id = autor_id;
        this.sw_id = sw_id;
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

    public int getSw_id() {
        return sw_id;
    }

    public void setSw_id(int sw_id) {
        this.sw_id = sw_id;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
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
    
    
}
