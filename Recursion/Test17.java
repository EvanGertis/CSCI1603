public class Test17 {
    public static void main(String args[]){
        String message = "myMessage";
        int    n       = 3; 
        nPrintln(message, n);
    }

    public static void nPrintln(String message, int times){
        if(times >= 1){
            System.out.println(message);
            nPrintln(message, times -1);
        }
    }
}
