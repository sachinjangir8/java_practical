public class main{
    public static void main(String[] args) {
        int [] arr={1,3,5,6,7,9,11,13,54};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            boolean isprime=true;
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    isprime=false;
                    break;
                }   
                
            } 
             if(isprime){
                count++;
                System.out.println(arr[i]+" is prime number");
            }
        }
        System.out.println(count);
        
    }
}