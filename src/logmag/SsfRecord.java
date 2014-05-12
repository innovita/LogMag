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
@Table(name="ssf_record")
public class SsfRecord implements Serializable {
    
    @Id @GeneratedValue
    @Column(name="id")
    private int id;
    
    @Column(name="treetag_namuber")
    private String treeTagNumber;
    
    @Column(name="species_id")
    @OneToMany
    @JoinColumn(name="id")
    private Species  species;
    
    
    
    public SsfRecord(){
        
    }
    
    public SsfRecord(int id, String tNumber){
        this.id = id;
        this.treeTagNumber = tNumber;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTreeTagNumber() {
        return treeTagNumber;
    }

    public void setTreeTagNumber(String treeTagNumber) {
        this.treeTagNumber = treeTagNumber;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
    
    
}
