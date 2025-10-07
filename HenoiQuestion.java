class HenoiQuestion {
    public static void towerOfHanoi(int n,  String src,String helpher,String dest) {
        if(n==1){
            System.out.println("transfer disk"+n+"from"+src+"to"+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helpher);
        System.out.println("transfer disk"+n+"from"+src+"to"+dest);
        towerOfHanoi(n-1,helpher,src,dest);
    }
    public static void main (String args[]){
        int n=2;
        towerOfHanoi(n,"s","h","d");
    }

}