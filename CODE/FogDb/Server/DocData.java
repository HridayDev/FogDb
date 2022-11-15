package FogDb.Server;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class DocData {
	
	public void addData(String key, String val, String name) throws Exception { // TESTED
		Properties prop = new Properties();
		prop.load(new FileInputStream("./data/" + name + ".properties"));
		prop.setProperty(key, val);
		prop.store(new FileOutputStream("./data/" + name + ".properties"), "Document: " + name);
		System.out.println("Data Added To Doc: " + name);														}
	
	public void editData(String key, String val, String name) throws Exception { // TESTED
		FileInputStream in = new FileInputStream("./data/" + name + ".properties");
		Properties props = new Properties();
		props.load(in);
		in.close();
		FileOutputStream out = new FileOutputStream("./data/" + name + ".properties");
		props.setProperty(key, val); System.out.println("Data Edited In Doc: " + name);
		props.store(out, "Document: " + name);		out.close();				}
	
	public void delData(String key, String name) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("./data/" + name + ".properties"));
		prop.remove(key);
		prop.store(new FileOutputStream("./data/" + name + ".properties"), "Document: " + name);
		System.out.println("Data Deleted From Doc: " + name);					}
	
	public String getData(String key, String name) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("./data/" + name + ".properties"));
		return prop.getProperty(key);												}
	
	public Boolean exists(String key, String name) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("./data/" + name + ".properties"));
		if(prop.getProperty(key) != null){	return true; }
		return false;
	}
	
}
