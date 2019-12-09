package Java_School_Samples.Arrays;

public class Array_initialization {
    public static void main(String[] args) {
        String[] list1=null;//list1-переменная-массив,ее знач=нулл.Здесь создали массив и положили его в переменную list1
        String[] list=new String[5]; //создали массив на 5 элементов, здесь String[5] указали длину массива
        System.out.println(list[0]); //выведеться null
        int listCount=list.length;
        System.out.println(listCount);//выведет длину массива

        String[] list2=new String[1];
        list2[0]="yo"; //занесем yo в первый элемент
        System.out.println(list2[0]); //печатнем первый элемент

        list=new String[10];
        int n=list.length; //выведет 10




    }


}
