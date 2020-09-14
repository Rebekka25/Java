package tutorial.collections.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * Array List ist ein Dynamisches Array,
 * man kann mehrer vom gleichen Objekt in die Liste hinzufügen.
 * 
 */
public class ArrayListOverview {

	ArrayList <Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	ArrayList<Integer> list3 = new ArrayList<Integer>();
	
	/*
	 * hier wird die Liste befühlt 
	 */
	public void generateLists() {
		list1 = new ArrayList<Integer>();
		int zahl = 1;
//		Primitive Datentypen können in der ArrayList nicht hinzugefügt werden, man benötigt die Zugehörige Wrapper Klasse
//		Diese Wrapper Klasse sind Immutable uveränderbar
//		list.add(zahl);
		Integer zahl2 = 20;
		list1.add(zahl2);
		list1.add(30);
		list1.add(40);
		list1.add(20);
		list1.add(60);
		list1.add(60); // mit add werden Elemente in der Liste hinzu gefügt
		
		
		list2.add(50);
		list2.add(10);
		list2.add(40);
		list2.add(80);
		list2.add(90);
		
	}
	
	/*
	 * Hier werden die Wichtigsten Operationen von ArrayList dargestellt und Erklärt.
	 *
	 */
	public void operation(){
		  list1.set(3, 100);
		  //Würde auf ein IndexOutOfBoundsException werfen, da die list1 nicht groß genug ist
		  //list1.set(20, 200);
		  
		  System.out.println("Hinzufügen an der list1, an dem Index 3 mit den Wert 100 "+list1);
		  System.out.println("list1.remove(2) entfernt aus der list1, an der Position(Index) 2");
		  list1.remove(2);
		  System.out.println("Gibt die list1 durch eine forEach Schleife aus");
		  //Dies ist seit Java 8 möglich
		  list1.forEach((i) -> System.out.print(i+"  "));
		  System.out.println();
		  System.out.println();
		  Iterator iterator = list1.iterator();
		 
		  /*
		   * Ausgabe durch den Iterator
		   * der Iterator gibt eine Datenstruktur wieder
		   * hasNext() überprüft ob ein nächsten Wert gibt
		   * next(); gibt den nächsten folgenden Wert aus
		   */
		  while(iterator.hasNext()) {
			 System.out.print(iterator.next()+"  ");
		 }
		  System.out.println();
		  System.out.println();
		  //Sotriert die list1
		  Collections.sort(list1);
		  System.out.println("Sotierte list1 mit Collections.sort "+list1);
		  list1.stream();
		  System.out.println("mit der Methode subList(int fromIndex, int toIndex) bekommt man eine Teillist zurück "+list1.subList(2, 4));
		  
		  
	}
	
	public void deleteList() {
		list1.clear();
	}
	
	public void display() {
		System.out.println("Ausgabe von Listen Element an Index 1: "+list1.get(1)+"  Ausgabe von Listen Element an Index 3: "+list1.get(3));

		System.out.println("Gibt zurück ob die Zahl 2 in der Liste drin ist: " + list1.contains(2));
		System.out.println("list1.isEmpty() gibt ein boolean zurück, ob eine Liste leer ist oder nicht  "+list1.isEmpty());
		System.out.println("Mit list1.size() gibt man die größe des ListArrays zurück: "+list1.size());
		System.out.println();
		System.out.println("Mit equals(Object o) vergleicht man Listen miteinander (list2.equals(list1)): "+list2.equals(list1));
		//Hier findet autoboxing statt, da 20 ein primitiver Datentyp ist, wird er automatisch in seine Wrapper Klasse umgewandelt
		System.out.println("list1.contains(20) hier wird Überprüft ob die Zahl 20 in list1 enthalten ist "+list1.contains(20));
		System.out.println();
		System.out.println("list1.indexOf(20) gibt den Index aus, wo der passenden Objekt drin ist (er gibt immer den ersten Index aus) "+ list1.indexOf(20));
		System.out.println("list1.lastIndexOf(20) gibt den Index aus, wo der passenden Objekt drin ist (er gibt den letzten Index aus) "+ list1.indexOf(20));
		list1.toArray();
		System.out.println();
		System.out.println("Ausgabe von der Methode operation()");
		operation();
		deleteList();
		System.out.println("hier wird die gelösche Liste ausgegeben: "+list1.toString());
	}
}
