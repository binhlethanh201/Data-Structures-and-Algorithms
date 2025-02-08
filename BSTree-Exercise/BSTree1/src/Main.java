public class Main {

    public static void main(String[] args) {
      int [] a = {6, 2, 7, 1, 3, 5, 4};
      BSTree t = new BSTree();
      t.insertMany(a);
      System.out.println("1. Breadth-first traversal");
      t.breadth(t.root); // 6 2 7 1 3 5 4
      System.out.println();
      System.out.println("2. Pre-order traversal");
      t.preOrder(t.root); // 6 2 1 3 5 4 7
      System.out.println();
      System.out.println("3. In-order traversal");
      t.inOrder(t.root); // 1 2 3 4 5 6 7
      System.out.println();
      System.out.println("4. Post-order traversal");
      t.postOrder(t.root); // 1 4 5 3 2 7 6
      System.out.println();
    }
    
}
