public class Recursion {
    public static double future(double amount,int years,double growthRate){

            if(years==0) return amount;

            return future(amount,years-1,growthRate)*(1+growthRate);
    }
    

    public static void main(String args[]){
        double amount=10000.0;
        int years=2;
        double growthRate = 0.5;

        double res = future(amount,years,growthRate);
        System.out.println(res);
    }
}
// Time Complexity : O(n) 
// Space Complexity : O(n) 
