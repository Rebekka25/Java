package tutorial.collections.list;
import java.util.Set;

public class Main {
	
	public static void main(String args[]) {
		ArrayListOverview arrayListOverview = new ArrayListOverview();
		arrayListOverview.generateLists();
		//toString() gibt den Array aus und nicht den Referenzwert da dies in ArrayList die von der Object Klasse Überschreibt
		System.out.println("Gibt die list1 aus: "+arrayListOverview.list1.toString()); 
		System.out.println("Gibt die list2 aus: "+arrayListOverview.list2.toString()); 
		//gibt nur den Referenzwert raus, da toString() nicht überschrieben wird
		System.out.println("Gibt das Objekt ArrayListOverview aus: "+arrayListOverview.toString());
		System.out.println();
	
		arrayListOverview.display();
		
		
		
	}
	
}
