package tutorial.collections.set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set ist ein Interface und dazu existieren verschiedene Implementierungen: TreeSet, HashSet, LinkedHashSet,
 * CopyOnWriteArraySet und EnumSet
 * Bei Set ist der unterschied zur Liste, das ein Objekt nur einmal abgespeichert wird.
 * HashSet:Jedes Objekt wird mit seiner Hashwert in einen bucket zu geordnet(deswegen ist das finden des Objekts in einer Hash-Set schnell)
 * Aber auch nur dann wenn der Hashwert von der Object Klasse Überschrieben wird, ansonsten landen alle in einen bucket rein was das finden eines Objectes langsamer macht.
 * 
 *TreeSet: arbeitet mit Binärbäume, diese können Sotiertwerden
 *
 *EnumSet: ist ausschließlich für Enum
 */
public class SetOverview {
	
	public Set<ClassExample> getClassExampleSet(){
		Set<ClassExample> classExampleHashSet = new HashSet();
		ClassExample classExample1 = new ClassExample();
		classExample1.field="ClassExample1";
		ClassExample classExample2 = new ClassExample();
		classExample1.field="ClassExample2";
		classExampleHashSet.add(classExample1);
		//auch wenn man versucht mehrere gleiche Objekte hinzuzufügen gelingt das nicht
		//es kommt nicht hinzu
		classExampleHashSet.add(classExample1);
		classExampleHashSet.add(classExample2);
		System.out.println(classExampleHashSet.size());
		//Mit den Itterator kann man in Collections sqeuentiel durch gehen
		Iterator iterator = classExampleHashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		return classExampleHashSet;
	}

}
