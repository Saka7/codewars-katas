import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

  public static Set<Integer> getSymmetricDifference(final Set<Integer> a, final Set<Integer> b) {
    if(a == null || b == null) return null;
    
    Set<Integer> symmetricDifference = new HashSet<>(a);
    symmetricDifference.addAll(b);
    
    Set<Integer> intersection = new HashSet<>(a);
    intersection.retainAll(b);
    
    symmetricDifference.removeAll(intersection);
    
    return symmetricDifference;
  }
  
}