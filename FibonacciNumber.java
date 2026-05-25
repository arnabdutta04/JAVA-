class Solution {
    public int fib(int n) {
        if(n>=1){
            System.out.println(n);
        }
      int f0=0;
      int f1=1;
      for(int i=2;i<=n;i++){
        int curr=f0+f1;
        f0=f1;
        f1=curr;
      }
      return f1;
    }
}
