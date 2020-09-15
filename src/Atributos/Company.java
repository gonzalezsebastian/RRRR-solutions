/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atributos;

/**
 *
 * @author German David
 */
public class Company {
    String name;
    String catchPhrase;
    String bs;

    public Company(String name, String catchPhrase, String bs) {
        this.name= name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    public Company() {
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Company: "+"\n");
        sb.append(" name: "+name+"\n");
        sb.append(" catchPhrase: "+catchPhrase+"\n");
        sb.append(" bs: "+bs+"\n");
        return sb.toString();
    }
    
    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }
    
    
}
