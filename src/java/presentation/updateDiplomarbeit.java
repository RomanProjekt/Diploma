/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pojo.Autor;
import pojo.Diplomarbeit;
import pojo.Schlagwort;
import service.DatabaseManagerService;

/**
 *
 * @author dople
 */
public class updateDiplomarbeit {

    private Diplomarbeit aktDip;

    private boolean autEdit = false;
    private String autor;
    private List<Autor> autList;
    private List<Autor> editAutList;
    private List<Autor> insertAutList;
    private List<Autor> removeAutList;

    private List<Autor> oldAutList;
    private String schule;

    private boolean schlagEdit = false;
    private String schlagwort;
    private List<Schlagwort> schlagwortList;
    private List<Schlagwort> editSchlagList;
    private List<Schlagwort> insertSchlagList;
    private List<Schlagwort> removeSchlagList;

    private List<Schlagwort> oldSchlagwortList;

    private DatabaseManagerService dbService;

    private int autId;

    /**
     * Creates a new instance of updateDiplomarbeit
     */
    public updateDiplomarbeit() {
        editAutList = new ArrayList<>();
        insertAutList = new ArrayList<>();
        removeAutList = new ArrayList<>();

        editSchlagList = new ArrayList<>();
        insertSchlagList = new ArrayList<>();
        removeSchlagList = new ArrayList<>();
    }

    public Object editDiplomarbeit(Diplomarbeit dip) {
        aktDip = dip;

        this.autList = dbService.getAllAutor(aktDip.getDa_id());

        this.oldAutList = autList;

        this.schule = dbService.getOneSchule(aktDip.getSchule_id()).getName();
        this.schlagwortList = dbService.getAllSchlagwoerter(aktDip.getDa_id());

        this.oldSchlagwortList = schlagwortList;

        autId = autList.get(autList.size() - 1).getAutor_id() + 1;
        return "updateDiplomarbeit.xhtml?faces-redirect=true";
    }

    public Object editAutor() {

        autEdit = true;
        return null;
    }

    public Object saveAutor(Autor autor) {

        autEdit = false;
        return null;
    }

    public Object addTag() {
        if (!"".equals(schlagwort) && schlagwort != null) {
            Schlagwort schlag = new Schlagwort(0, schlagwort);
            this.schlagwortList.add(schlag);
            this.insertSchlagList.add(schlag);
        }
        schlagwort = "";
        return null;
    }

    public Object addAutor() {
        if (!"".equals(autor) && autor != null) {
            Autor aut = new Autor(autId, autor, aktDip.getDa_id());
            this.autList.add(aut);
            this.insertAutList.add(aut);
        }
        autor = "";
        autId += 1;
        return null;
    }

    public Object removeTag(Schlagwort schlagw) {
        this.schlagwortList.remove(schlagw);
        if (schlagw.getTag_id() == 0) {
            this.insertSchlagList.remove(schlagw);
        } else {
            this.removeSchlagList.add(schlagw);
        }

        return null;
    }

    public Object removeAutor(Autor autor) {
        this.autList.remove(autor);
        if (autor.getAutor_id() == 0) {
            this.insertAutList.remove(autor);
        } else {
            this.removeAutList.add(autor);
        }
        return null;
    }

    public Object save() {

        return "index.xhtml?faces-redirect=true";
    }

    public Diplomarbeit getAktDip() {
        return aktDip;
    }

    public List<Autor> getAutList() {
        return autList;
    }

    public String getSchule() {
        return schule;
    }

    public List<Schlagwort> getSchlagwortList() {
        return schlagwortList;
    }

    public DatabaseManagerService getDbService() {
        return dbService;
    }

    public void setAktDip(Diplomarbeit aktDip) {
        this.aktDip = aktDip;
    }

    public void setAutList(List<Autor> autList) {
        this.autList = autList;
    }

    public void setSchule(String schule) {
        this.schule = schule;
    }

    public void setSchlagwortList(List<Schlagwort> schlagwortList) {
        this.schlagwortList = schlagwortList;
    }

    public void setDbService(DatabaseManagerService dbService) {
        this.dbService = dbService;
    }

    public String getSchlagwort() {
        return schlagwort;
    }

    public void setSchlagwort(String schlagwort) {
        this.schlagwort = schlagwort;
    }

    public List<Autor> getOldAutList() {
        return oldAutList;
    }

    public List<Schlagwort> getOldSchlagwortList() {
        return oldSchlagwortList;
    }

    public void setOldAutList(List<Autor> oldAutList) {
        this.oldAutList = oldAutList;
    }

    public void setOldSchlagwortList(List<Schlagwort> oldSchlagwortList) {
        this.oldSchlagwortList = oldSchlagwortList;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Autor> getEditAutList() {
        return editAutList;
    }

    public List<Autor> getInsertAutList() {
        return insertAutList;
    }

    public List<Autor> getRemoveAutList() {
        return removeAutList;
    }

    public List<Schlagwort> getEditSchlagList() {
        return editSchlagList;
    }

    public List<Schlagwort> getInsertSchlagList() {
        return insertSchlagList;
    }

    public List<Schlagwort> getRemoveSchlagList() {
        return removeSchlagList;
    }

    public void setEditAutList(List<Autor> editAutList) {
        this.editAutList = editAutList;
    }

    public void setInsertAutList(List<Autor> insertAutList) {
        this.insertAutList = insertAutList;
    }

    public void setRemoveAutList(List<Autor> removeAutList) {
        this.removeAutList = removeAutList;
    }

    public void setEditSchlagList(List<Schlagwort> editSchlagList) {
        this.editSchlagList = editSchlagList;
    }

    public void setInsertSchlagList(List<Schlagwort> insertSchlagList) {
        this.insertSchlagList = insertSchlagList;
    }

    public void setRemoveSchlagList(List<Schlagwort> removeSchlagList) {
        this.removeSchlagList = removeSchlagList;
    }

    public boolean isAutEdit() {
        return autEdit;
    }

    public boolean isSchlagEdit() {
        return schlagEdit;
    }

    public void setAutEdit(boolean autEdit) {
        this.autEdit = autEdit;
    }

    public void setSchlagEdit(boolean schlagEdit) {
        this.schlagEdit = schlagEdit;
    }

    public int getAutId() {
        return autId;
    }

    public void setAutId(int autId) {
        this.autId = autId;
    }

}
