public class PowerFunction {
    public static void main(String[] args) {
        int n=2;
        int e=10;
        int res=PowerFunction(n,e);
        System.out.println(n+ " ^ " + e + " : " +res);
    }
    static int PowerFunction(int n,int e){
        if (e==0){
            return 1;
        }
        return n*PowerFunction(n,e-1);
    }
}
