package Arrays;

public class Array_ballSorting {
    //Пузырьковая сортировка9сорт.Пузырьком).Дан массив,отсортировать его в обратном порядке
    public static void main(String[] args) {
        int[] array={89,-45,2,78,0,-3,6};
        int temp;
        for (int i=0;i < array.length-1;i++){
            for (int j=0;j < array.length-1-i;j++){
                if (array[j]<array[j+1]) {
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                }
            }
        }
        System.out.println("dest array:");
        outarray(array);

    }
    public static void outarray(int[] array){
        for (int i=0;i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
