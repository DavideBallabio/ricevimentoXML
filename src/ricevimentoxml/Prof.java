/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricevimentoxml;


/**
 *
 * @author ballabio_davide
 */
public class Prof {
    String nome,giorno,commento,ora;
    int ID;

    public Prof(int ID, String nome, String giorno, String commento, String ora) {
        this.ID = ID;
        this.nome = nome;
        this.giorno = giorno;
        this.commento = commento;
        this.ora = ora;
    }

    public Prof() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGiorno() {
        return giorno;
    }

    public void setGiorno(String giorno) {
        this.giorno = giorno;
    }

    public String getCommento() {
        return commento;
    }

    public void setCommento(String commento) {
        this.commento = commento;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }
    
    public String toString(){
        return nome+giorno+ora+commento;
    }


}