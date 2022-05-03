public class HeapSortTest {
    public static void main(String args[]) {
    HeapSort<Integer> heap = new HeapSort<>();
    heap.add(45);
    System.out.printf("heap.add(%d);\n",45);
    heap.add(11);
    System.out.printf("heap.add(%d);\n",11);
    heap.add(50);
    System.out.printf("heap.add(%d);\n",50);
    heap.add(59);
    System.out.printf("heap.add(%d);\n",59);
    heap.add(60);
    System.out.printf("heap.add(%d);\n",60);
    heap.add(2);
    System.out.printf("heap.add(%d);\n",2);
    heap.add(4);
    System.out.printf("heap.add(%d);\n",4);
    heap.add(7);
    System.out.printf("heap.add(%d);\n",7);
    heap.add(10);
    System.out.printf("heap.add(%d);\n",10);
    System.out.print("Heap : ");
    for(int i=0; i < heap.getSize(); i++){
        System.out.print(heap.get(i)+" ");
    }
}
}
