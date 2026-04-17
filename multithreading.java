class chef extends Thread {
    String ordername;

    chef(String ordername){
        this.ordername=ordername;
    }

    public void run(){
        try{
            System.out.println("chef started preparing"+ ordername);
            for(int i=0;i<=5;i++){
                System.out.println(ordername + "-step"+i+"completed");
                Thread.sleep(1);
            }
            System.out.println(ordername+"is ready for delivery!\n");
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class multithreading {
    public static void main(String[] args) {
        
    }
}
