package FogDb.Server;

import java.io.File;
import java.io.IOException;

public class DocFile {
	
	public String name; // PROJECT WIDE VAR
	private DocData data = new DocData();
	
	
	public DocFile(String nm) throws IOException{	this.name = nm;	// CONSTRUCTOR
		File ff = new File("./data");	// TESTED
    	if(ff.mkdir()){  System.out.println("Folder is created successfully");  }
		File f = new File("./data/" + nm + ".properties");
		if(f.exists() && !f.isDirectory()){    GetFile(nm);    }
		else if(!f.exists()){    NewFile(nm);    }										}
	
	
	private void NewFile(String name) throws IOException{	// TESTED
		File f = new File("./data/" + name + ".properties");
	    if (f.createNewFile()) {	System.out.println("Doc Made: " + name); }
	    else{	System.out.println("Doc " + name + " already exists"); }				}
	
	
	public void DelFile() throws IOException{	// TESTED
		String name = this.name;		File f = new File("./data/" + name + ".properties");
	    f.delete();						System.out.println("Doc Deleted: " + name);					}
	
	
	private void GetFile(String name){	// TESTED
		File f = new File("./data/" + name + ".properties");
		if(f.exists() && !f.isDirectory()) { System.out.println("Doc Selected: " + name); }			}
	
	
	public void addData(String key, String val)throws Exception{data.addData(key, val, this.name);} // TESTED
	public void editData(String key, String val)throws Exception{data.editData(key, val, this.name);} // TESTED
	public void delData(String key)throws Exception{data.delData(key, this.name);} // |
	public String getData(String key)throws Exception{return data.getData(key, this.name);} // |
	public Boolean exists(String key)throws Exception{return data.exists (key, this.name);} // |
	
}
