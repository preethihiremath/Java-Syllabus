import java.util.ArrayList;

public class ArrayListEx {
  public static void main(String[] args) {
    ArrayList<String> hp = new ArrayList<String>();
    hp.add("Harry");
    hp.add("Ron");
    hp.add("Luna");
    
    System.out.println(hp);
    hp.remove(1);
    System.out.println(hp);
    hp.remove("Luna");
    hp.add("Fred");
    System.out.println(hp);
  }
}