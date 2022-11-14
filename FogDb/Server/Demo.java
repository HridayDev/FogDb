package FogDb.Server;

public class Demo {
	
	public static void main(String args[]) throws Exception{
		
		DocFile doc = new DocFile("sample");
		System.out.println(doc.exists("Word"));
		doc.addData("Word", "def");  System.out.println(doc.getData("Word") + " " + doc.exists("Word"));
		doc.editData("Word", "idk"); System.out.println(doc.getData("Word") + " " + doc.exists("Word"));
		doc.delData("Word");         System.out.println(doc.exists("Word"));
		doc.DelFile();
		
	}
	
}
