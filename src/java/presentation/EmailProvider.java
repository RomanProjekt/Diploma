/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

/**
 *
 * @author hp
 */
public class EmailProvider {
    
    private int providerid;
    private String anbieter;
    private String smtpHost;
    private String smtPort;
    
    // Benutzername und passwort Anbieter /Ak
    // Benutzername und passwort Anbieter /Ak
    static final String mbenutzername = "testdiplomarbeit@gmx.at";
    static final String passwort = "TiegerMade12Acht";
    static final String absender = "testdiplomarbeit@gmx.at";
    static final String empfanger = "roman.grof@gmx.at";

    public EmailProvider(int providerid, String anbieter, String smtpHost, String smtPort) {
        this.providerid = providerid;
        this.anbieter = anbieter;
        this.smtpHost = smtpHost;
        this.smtPort = smtPort;
    }

 
    public String getSmtpHost() {
        return smtpHost;
    }

    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public String getSmtPort() {
        return smtPort;
    }

    public void setSmtPort(String smtPort) {
        this.smtPort = smtPort;
    }

    public String getAnbieter() {
        return anbieter;
    }

    public void setAnbieter(String anbieter) {
        this.anbieter = anbieter;
    }

    public int getProviderid() {
        return providerid;
    }

    public void setProviderid(int providerid) {
        this.providerid = providerid;
    }
    
    
    
    
}
