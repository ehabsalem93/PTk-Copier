/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ptk
 */
public class directoryPackage {
    String source,Distination;

    public directoryPackage(String source, String Distination) {
        this.source = source;
        this.Distination = Distination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDistination() {
        return Distination;
    }

    public void setDistination(String Distination) {
        this.Distination = Distination;
    }
    
    
    
}
