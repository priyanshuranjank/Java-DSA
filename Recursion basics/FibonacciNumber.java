public class FibonacciNumber {
    public static void main(String[] args) {
        int num = 5;
       
       System.out.println( fibanacci(num));         
                
            }
        
private static int fibanacci(int num) {
if (num == 1){return 1;}
if(num == 0){return 0;}
    int ans = fibanacci(num - 1) + fibanacci(num - 2);

    return ans;
            }
}
