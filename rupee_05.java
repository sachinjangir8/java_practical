
import java.util.Scanner;

class rupee {
    Scanner sc=new Scanner(System.in);
    int rs;
    int paisa;
    double total =0.0;

    public rupee(int rs,int paisa){
        this.rs=rs;
        this.paisa=paisa;
    }
    public void convert(){
        total=rs+(paisa/100.0);
        System.out.println("the value of rupee in paisa is : "+total +"and the value of paisa in rupee is : "+(paisa/100.0));
    }
}
public class rupee_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the rupee and paisa : ");
        int rupee=sc.nextInt();
        System.out.print("enter the paisa : ");
        int paisa=sc.nextInt();
        
        rupee r=new rupee(rupee,paisa);
        r.convert();
        
    }
}
