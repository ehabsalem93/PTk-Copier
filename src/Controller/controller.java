/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.directoryPackage;
import java.awt.List;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author ptk
 */
public class controller {

    private static ArrayList<File> list_Directory;
    
  

    public static void init() {
        list_Directory = new ArrayList();
        
    }

    public ArrayList<File> getList_Directory() {
        return list_Directory;
    }

  public void removeAT(int index){
  list_Directory.remove(index);
  }
    public void fill_directory(File[] file)
    {
        if(null==list_Directory)
            list_Directory=new ArrayList<File>();
        for(int x=0;x <file.length;x++)
         list_Directory.add(file[x]);
    }
    
    public String[] get_paths()
    {
    String file []=new String[list_Directory.size()];
    for(int x=0;x<list_Directory.size();x++)
        file[x]=list_Directory.get(x).getAbsolutePath();
    
    return file;
    }
}
