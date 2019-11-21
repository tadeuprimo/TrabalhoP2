/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbd;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "CADASTRO", catalog = "", schema = "ROOT")
@NamedQueries({
    @NamedQuery(name = "Cadastro.findAll", query = "SELECT c FROM Cadastro c")
    , @NamedQuery(name = "Cadastro.findById", query = "SELECT c FROM Cadastro c WHERE c.id = :id")
    , @NamedQuery(name = "Cadastro.findByDecolagem", query = "SELECT c FROM Cadastro c WHERE c.decolagem = :decolagem")
    , @NamedQuery(name = "Cadastro.findByPouso", query = "SELECT c FROM Cadastro c WHERE c.pouso = :pouso")
    , @NamedQuery(name = "Cadastro.findByTipo", query = "SELECT c FROM Cadastro c WHERE c.tipo = :tipo")
    , @NamedQuery(name = "Cadastro.findByDesembarque", query = "SELECT c FROM Cadastro c WHERE c.desembarque = :desembarque")
    , @NamedQuery(name = "Cadastro.findByEmbarque", query = "SELECT c FROM Cadastro c WHERE c.embarque = :embarque")
    , @NamedQuery(name = "Cadastro.findByCarga", query = "SELECT c FROM Cadastro c WHERE c.carga = :carga")
    , @NamedQuery(name = "Cadastro.findByComandante", query = "SELECT c FROM Cadastro c WHERE c.comandante = :comandante")
    , @NamedQuery(name = "Cadastro.findByAnac", query = "SELECT c FROM Cadastro c WHERE c.anac = :anac")})
public class Cadastro implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DECOLAGEM")
    private String decolagem;
    @Column(name = "POUSO")
    private String pouso;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "DESEMBARQUE")
    private Integer desembarque;
    @Column(name = "EMBARQUE")
    private Integer embarque;
    @Column(name = "CARGA")
    private Integer carga;
    @Column(name = "COMANDANTE")
    private String comandante;
    @Column(name = "ANAC")
    private Integer anac;

    public Cadastro() {
    }

    public Cadastro(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getDecolagem() {
        return decolagem;
    }

    public void setDecolagem(String decolagem) {
        String oldDecolagem = this.decolagem;
        this.decolagem = decolagem;
        changeSupport.firePropertyChange("decolagem", oldDecolagem, decolagem);
    }

    public String getPouso() {
        return pouso;
    }

    public void setPouso(String pouso) {
        String oldPouso = this.pouso;
        this.pouso = pouso;
        changeSupport.firePropertyChange("pouso", oldPouso, pouso);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        String oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public Integer getDesembarque() {
        return desembarque;
    }

    public void setDesembarque(Integer desembarque) {
        Integer oldDesembarque = this.desembarque;
        this.desembarque = desembarque;
        changeSupport.firePropertyChange("desembarque", oldDesembarque, desembarque);
    }

    public Integer getEmbarque() {
        return embarque;
    }

    public void setEmbarque(Integer embarque) {
        Integer oldEmbarque = this.embarque;
        this.embarque = embarque;
        changeSupport.firePropertyChange("embarque", oldEmbarque, embarque);
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        Integer oldCarga = this.carga;
        this.carga = carga;
        changeSupport.firePropertyChange("carga", oldCarga, carga);
    }

    public String getComandante() {
        return comandante;
    }

    public void setComandante(String comandante) {
        String oldComandante = this.comandante;
        this.comandante = comandante;
        changeSupport.firePropertyChange("comandante", oldComandante, comandante);
    }

    public Integer getAnac() {
        return anac;
    }

    public void setAnac(Integer anac) {
        Integer oldAnac = this.anac;
        this.anac = anac;
        changeSupport.firePropertyChange("anac", oldAnac, anac);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastro)) {
            return false;
        }
        Cadastro other = (Cadastro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "testbd.Cadastro[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
