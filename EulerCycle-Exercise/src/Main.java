public class Main {
  public static void main(String [] args) {
    int [][] b = {
      {0,1,0,1,0},
      {1,0,1,0,2},
      {0,1,0,1,2},
      {1,0,1,0,0},
      {0,2,2,0,0}
     };
     Graph g = new Graph();
     g.setData(b);

     System.out.println("\n1. Display adjacency matrix:");  
     g.dispAdj();

     System.out.println("\n2. Test finding Euler Cycle:");  
     EulerCycle t;
     t = g.findEulerCycle(0);
     t.display(); // A -> D -> C -> E -> B -> E -> C -> B -> A
     System.out.println();  
   }
 }
