class Sum {
    int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + (sum(n - 1));
    }

    public static   class Sum1{
        public static void main(String[] args) {
            Sum obj = new Sum();
            int result = obj.sum(5);
            System.out.println("sum of first five numbers " +result);

        }
    }
}