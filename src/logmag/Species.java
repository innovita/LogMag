/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logmag;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author lanfiamoussa
 */
@Entity
@Table(name="species")
public class Species implements Serializable {
    
    @Id @GeneratedValue
    @Column(name="id")
    private int id;
    
    @Column(name="species_code")
    private String speciesCode;
    
    @Column(name="species_bioname")
    private String speciesBioName;
    
    @Column(name="species_libname")
    private String speciesLibName;
    
    public Species(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpeciesCode() {
        return speciesCode;
    }

    public void setSpeciesCode(String speciesCode) {
        this.speciesCode = speciesCode;
    }

    public String getSpeciesBioName() {
        return speciesBioName;
    }

    public void setSpeciesBioName(String speciesBioName) {
        this.speciesBioName = speciesBioName;
    }

    public String getSpeciesLibName() {
        return speciesLibName;
    }

    public void setSpeciesLibName(String speciesLibName) {
        this.speciesLibName = speciesLibName;
    }
    

    
}
