import javax.print.event.PrintEvent;

public class Test19 {
    public static void main(String args[]){
        double[] list = {1,2,4,1,2,3,10,1,4};
        printArray(list);
        sort(list,0, list.length-1);
        printArray(list);
    }

    public static void printArray(double[] list){
        for(int i=0; i < list.length; i++){
            System.out.print(list[i]+" | ");
        }
        System.out.println();
    }

    public static void sort(double[] list, int low, int high){
        if(low < high){
            //Find the smallesst number and its index
            //in list (low...high)
            int indexOfMin = low;
            double min = list[low];
            for(int i=low +1; i <= high; i++){
                if(list[i] < min){
                    min = list[i];
                    indexOfMin = i;
                }
            }
            //swap the smallest in the list(low...high) with
            //list(low)
            list[indexOfMin] = list[low];
            list[low] = min;

            sort(list, low+1, high);
        }
    }
}
