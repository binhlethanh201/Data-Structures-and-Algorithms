class Graph {
  int [][] a; int n;
  char [] v;
  Graph() {n=0; v = "ABCDEFGHIJKLMN".toCharArray();}
  void setData(int [][] b) {
     n=b.length;
     a=new int[n][n];
     int i,j;
     for(i=0;i<n;i++)
      for(j=0;j<n;j++) a[i][j]=b[i][j];
    }
  void dispAdj() {
    int i,j;
    for(i=0;i<n;i++) {
     System.out.println();
        for(j=0;j<n;j++) System.out.printf("%5d",a[i][j]);
    }   
   }
 void visit(int i) {System.out.print(v[i] + "  ");}
 boolean isDirected() {
    int i,j;
    for(i=0;i<n;i++)
     for(j=0;j<n;j++)
        if(a[i][j] != a[j][i]) return(true);
     return(false);
   }
 int deg(int i) {
    int s,j;
    s=0;
    for(j=0;j<n;j++) s += a[i][j];
    if(a[i][i]>0) s += a[i][i];
    return(s);
   }
 boolean isConnected() {
    MyStack s = new MyStack();
    boolean [] p = new boolean[n];
    int i,j,r;
    for(i=0;i<n;i++) p[i]=false;
    s.push(0);p[0]=true;
    while(!s.isEmpty()) {
       r = s.pop();
       for(i=0;i<n;i++)
          if(!p[i] && a[r][i]>0) {s.push(i); p[i]=true;}
      }
    for(i=0;i<n;i++) if(!p[i]) return(false);
    return(true);
  }
 boolean isEvenDegree() {
   for(int i=0;i<n;i++)
       if(deg(i) %2 !=0) return(false);
   return(true);
  }  
boolean hasIsolatedVertex() {
  for(int i=0;i<n;i++) 
    if(deg(i)==0) return(true);
   return(false);
 }
EulerCycle findEulerCycle(int k) {
  if(isDirected() || !isConnected() || !isEvenDegree() || hasIsolatedVertex()) {
      System.out.println(" The conditions for Euler Cycle are not satisfied");
      return(null);
     }
   MyStack s = new MyStack();
   int [][] b = new int[n][n];
   int i,j,r;
   for(i=0;i<n;i++)
     for(j=0;j<n;j++) b[i][j]=a[i][j];
   EulerCycle t = new EulerCycle();
   s.push(k);
   while(!s.isEmpty()) {
     r = s.top();
     i=0;
     while(i<n && a[r][i]==0) i++;
     if(i==n) { // The vertex r is now isolated
       r = s.pop();
       t.add(r);
      }
       else {
         s.push(i); a[r][i]--; a[i][r]--;
        }
     }
   setData(b);
   return(t);  
  }
 }
