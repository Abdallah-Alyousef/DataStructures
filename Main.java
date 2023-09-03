public class Main {
  public static void main(String[] args) {


    // ArrayList<String> a1 = new ArrayList<String>(10);
    LinkedList<String> a1 = new LinkedList<String>();
    String s1 = "xyz", s2="abc";
    String s3 = "adc";
    a1.insert(s1);
    a1.insert(s2);
    // a1.findFirst();

    // System.out.println(a1.retrieve());
    // System.out.println(a1.full());

    // System.out.println(LinkedList.lenght(a1));
    // System.out.println("Hello, World");

    // System.out.println(Recursion.factorial(4));
    // System.out.println(Recursion.sum(4));

    System.out.println(a1.search(a1, s2));
    System.out.println(a1.search(a1, s3));
    


  }
}