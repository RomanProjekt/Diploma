/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import javax.annotation.PostConstruct;
import pojo.Autor;
import pojo.Diplomarbeit;
import pojo.Schlagwort;
import pojo.Schule;
import service.DatabaseManagerService;

/**
 *
 * @author dople
 */
public class updateDiplomarbeit  {

    private Diplomarbeit aktDip;
    private Diplomarbeit oldDip;

    private boolean autEdit = false;
    private boolean schlagEdit = false;
    private Schule realSchule;
    private List<Schule> schulList;

    private String schule;
    private String schlagwort;
    private String autor;
    private Date datum;

    private final List<String> typeaheadSchl;
    private DatabaseManagerService dbService;
    
    private List<Schlagwort> schlagwortList;
    private HashMap<String, Integer> allSchlagwortMap;
    private List<Schlagwort> allSchlagwortList;
 
    //Autor einfügen
    private List<Autor> autList;
    private int autId;
    private int schlagId;
    private HashMap<Integer, Autor> editAutMap;
    private HashMap<Integer, Autor> insAutMap;
    private HashMap<Integer, Schlagwort> insSchlagMap;
    private List<Schlagwort> insertSchlagList;
    private HashMap<Integer, Autor> remAutMap;
    private HashMap<Integer, Schlagwort> remSchlagMap;

    /**
     * Creates a new instance of updateDiplomarbeit
     */
    public updateDiplomarbeit() {

        insertSchlagList = new ArrayList<>();

        editAutMap = new HashMap<>();

        insAutMap = new HashMap<>();
        insSchlagMap = new HashMap<>();

        remAutMap = new HashMap<>();
        remSchlagMap = new HashMap<>();

        typeaheadSchl = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
        schulList = dbService.getSchuleList();
        schlagwortList = new ArrayList<>();
        this.allSchlagwortMap = dbService.getAllSchlagwoerterHashMap();
        
    }

    public Object editDiplomarbeit(Diplomarbeit dip) {
        
        aktDip = new Diplomarbeit(dip.getDa_id(), dip.getTitle(), dip.getTextname(), dip.getSchule_id(), dip.getPdf(), dip.getUser_id(), dip.getDatum(), dip.getBild(), 0, 0);
        oldDip = new Diplomarbeit(dip.getDa_id(), dip.getTitle(), dip.getTextname(), dip.getSchule_id(), dip.getPdf(), dip.getUser_id(), dip.getDatum(), dip.getBild(), 0, 0);
        
        this.autList = dbService.getAllAutor(aktDip.getDa_id());

        this.datum = aktDip.getDatum();
        this.allSchlagwortMap = dbService.getAllSchlagwoerterHashMap();

        this.realSchule = dbService.getOneSchule(aktDip.getSchule_id());
        this.schlagwortList = dbService.getAllSchlagwoerter(aktDip.getDa_id());
        this.allSchlagwortList = dbService.getAllSchlagwörter();

        allSchlagwortList.forEach((schlagwort1) -> {
            typeaheadSchl.add(schlagwort1.getWord());
        });

        if (autList.size() > 0) {
            autId = autList.get(autList.size() - 1).getAutor_id() + 1;
        } else {
            autId = 1;
        }
        if (allSchlagwortList.size() > 0) {
            schlagId = allSchlagwortList.get(allSchlagwortList.size() - 1).getTag_id() + 1;
        } else {
            schlagId = 1;
        }

        return "updateDiplomarbeit.xhtml?faces-redirect=true";
    }

    public Object editAutor() {
        autEdit = true;
        return null;
    }

    public Object saveAutor(Autor autor) {
        
        if (insAutMap.containsKey(autor.getAutor_id())) {
            insAutMap.replace(autor.getAutor_id(), autor);
        } else if (editAutMap.containsKey(autor.getAutor_id())) {
            editAutMap.replace(autor.getAutor_id(), autor);
        } else {
            editAutMap.put(autor.getAutor_id(), autor);
        }
        autEdit = false;
        return null;
    }
    
    

    public Object addTag() {
        
        if (!"".equals(schlagwort) && schlagwort != null) {
            
            if (allSchlagwortMap.containsKey(schlagwort)) {
                Schlagwort schlag = new Schlagwort(allSchlagwortMap.get(schlagwort), schlagwort);
                this.schlagwortList.add(schlag);
                this.insSchlagMap.put(schlag.getTag_id(), schlag);
                
            } else {
                Schlagwort schlag = new Schlagwort(schlagId, schlagwort);
                this.schlagwortList.add(schlag);
                this.insertSchlagList.add(schlag);
                this.insSchlagMap.put(schlagId, new Schlagwort(schlagId, schlagwort));
                this.schlagId += 1;
            }

        }
        schlagwort = "";
        return null;
    }

    public Object addAutor() {
        if (!"".equals(autor) && autor != null) {
            Autor aut = new Autor(autId, autor, aktDip.getDa_id());
            this.autList.add(aut);
            this.insAutMap.put(autId, new Autor(autId, autor, aktDip.getDa_id()));
        }
        autor = "";
        autId += 1;
        return null;
    }

    public Object removeTag(Schlagwort schlagw) {
        
        

        if (insSchlagMap.containsKey(schlagw.getTag_id())) {
            
            this.insSchlagMap.remove(schlagw.getTag_id());
            
        } else {
            
            this.remSchlagMap.put(schlagw.getTag_id(), schlagw);
            
        }
        
//        this.schlagwortList.remove(schlagw);
        dbService.getSchlagwortList().remove(schlagw);
        
        return null;
    }

    public Object removeAutor(Autor autor) {

        if (insAutMap.containsKey(autor.getAutor_id())) {
            this.insAutMap.remove(autor.getAutor_id());
        } else {
            this.remAutMap.put(autor.getAutor_id(), autor);
            if (editAutMap.containsKey(autor.getAutor_id())) {

                this.editAutMap.remove(autor.getAutor_id());
            }

        }
        this.autList.remove(autor);
        return null;
    }

    public Object save() {

        if (!(aktDip.getTitle().equals(oldDip.getTitle()))) {
            dbService.updateDPTitle(aktDip.getDa_id(), aktDip.getTitle());
        }

        if (!(aktDip.getSchule_id() == oldDip.getSchule_id())) {
            dbService.updateDPSchule(aktDip.getDa_id(), aktDip.getSchule_id());
        }

        if (!(oldDip.getDatum().equals(this.datum))) {
            dbService.updateDPDatum(aktDip.getDa_id(), new java.sql.Date(datum.getTime()));
        }

        if (remAutMap != null && !remAutMap.isEmpty()) {
            dbService.deleteAutors(remAutMap);
        }

        if (insAutMap != null && !insAutMap.isEmpty()) {
            dbService.insertAutors(insAutMap);
        }

        if (editAutMap != null && !editAutMap.isEmpty()) {
            dbService.updateAutors(editAutMap);
        }

        if (remSchlagMap != null && !remSchlagMap.isEmpty()) {
            dbService.deleteSW_DA(remSchlagMap, this.aktDip.getDa_id());
        }

        //New Schlagwort gets inserted into Schlagwort Table
        if (insertSchlagList != null && !insertSchlagList.isEmpty()) {
            dbService.insertSchlagwortList(insertSchlagList);
        }

        //Existing Schlagwort Inserting into connection Table
        if (insSchlagMap != null && !insSchlagMap.isEmpty()) {
            dbService.insertSW_DAMap(insSchlagMap, this.aktDip.getDa_id());
        }

        insAutMap.clear();
        insSchlagMap.clear();
        insertSchlagList.clear();

        remAutMap.clear();
        remSchlagMap.clear();

        editAutMap.clear();

        return "index.xhtml?faces-redirect=true";
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Schule getRealSchule() {
        return realSchule;
    }

    public List<Schule> getSchulList() {
        return schulList;
    }

    public void setRealSchule(Schule realSchule) {
        this.realSchule = realSchule;
    }

    public void setSchulList(List<Schule> schulList) {
        this.schulList = schulList;
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

    public HashMap<String, Integer> getAllSchlagwortMap() {
        return allSchlagwortMap;
    }

    public void setAllSchlagwortMap(HashMap<String, Integer> allSchlagwortMap) {
        this.allSchlagwortMap = allSchlagwortMap;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Schlagwort> getInsertSchlagList() {
        return insertSchlagList;
    }

    public void setInsertSchlagList(List<Schlagwort> insertSchlagList) {
        this.insertSchlagList = insertSchlagList;
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

    public HashMap<Integer, Autor> getEditAutMap() {
        return editAutMap;
    }

    public void setEditAutMap(HashMap<Integer, Autor> editAutMap) {
        this.editAutMap = editAutMap;
    }

    public int getSchlagId() {
        return schlagId;
    }

    public void setSchlagId(int schlagId) {
        this.schlagId = schlagId;
    }

    public Diplomarbeit getOldDip() {
        return oldDip;
    }

    public HashMap<Integer, Autor> getInsAutMap() {
        return insAutMap;
    }

    public HashMap<Integer, Schlagwort> getInsSchlagMap() {
        return insSchlagMap;
    }

    public HashMap<Integer, Autor> getRemAutMap() {
        return remAutMap;
    }

    public HashMap<Integer, Schlagwort> getRemSchlagMap() {
        return remSchlagMap;
    }

    public void setOldDip(Diplomarbeit oldDip) {
        this.oldDip = oldDip;
    }

    public void setInsAutMap(HashMap<Integer, Autor> insAutMap) {
        this.insAutMap = insAutMap;
    }

    public void setInsSchlagMap(HashMap<Integer, Schlagwort> insSchlagMap) {
        this.insSchlagMap = insSchlagMap;
    }

    public void setRemAutMap(HashMap<Integer, Autor> remAutMap) {
        this.remAutMap = remAutMap;
    }

    public void setRemSchlagMap(HashMap<Integer, Schlagwort> remSchlagMap) {
        this.remSchlagMap = remSchlagMap;
    }

    public List<Schlagwort> getAllSchlagwortList() {
        return allSchlagwortList;
    }

    public void setAllSchlagwortList(List<Schlagwort> allSchlagwortList) {
        this.allSchlagwortList = allSchlagwortList;
    }

    public List<String> getTypeaheadSchl() {
        return typeaheadSchl;
    }
    
    
     
  

}
