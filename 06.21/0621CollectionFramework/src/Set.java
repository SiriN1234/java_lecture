import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "g", "a"};
		
		HashSet<String> alphabetSet = new HashSet<>();
		HashSet<String> alphabetSet2 = new HashSet<>();
		
		for(String spell: alphabet) {
			alphabetSet.add(spell);
			alphabetSet2.add(spell);
		}
		
		alphabetSet.add("z");
		alphabetSet.remove("a");
		
		System.out.println(alphabetSet);
		System.out.println(alphabetSet.contains("b"));
		System.out.println(alphabetSet.size());
		System.out.println(alphabetSet.equals(alphabetSet2));
		
		System.out.println(alphabetSet.hashCode());
		System.out.println(alphabetSet2.hashCode());
	}

}
