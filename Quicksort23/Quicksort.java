package Quicksort23;

public class Quicksort {

    public static int vt [] = {4,2,6,3,75,12,64};

    public static void quicksort(int left, int right){
        int i = left;
        int j = right;
        
        int pivot = vt[(left + right) / 2]; 

        do {
                
            while (vt[i] < pivot){
                i++;
            }
            while(pivot < vt[j]){
                j--;
            }
            if(i<=j){
                scambio(i,j);
                i++;
                j--;
            }
        }while(i <= j);

        if(left < j)
        quicksort(left,j);
        if(i < right)
        quicksort(right,i);
    }

    private static void scambio(int i, int j) {
        int temp;
        temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        quicksort(0,vt.length);
        for (int numero : vt) {
            System.out.println(numero);
        }
    }
}
