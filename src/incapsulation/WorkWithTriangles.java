package incapsulation;

import java.util.Scanner;

public class WorkWithTriangles {
    //ввести массив треугольника и найти треугольник с максимальным периметром
    public static void main(String[] args) {
        Triangle[] triangles;
        int n;
        int triangleWithMaxPerim=0;
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        n=in.nextInt();
        triangles=new Triangle[n];
        for (int i = 0;i < triangles.length;i++ ){
            System.out.println("input"+" "+i+" "+"trianglr sides");
            triangles[i]=new Triangle(in.nextInt(),in.nextInt(),in.nextInt());
        }
        for (int i=1;i < triangles.length;i++){
            if (triangles[i].getPerim()>triangles[i].getPerim()){
                triangleWithMaxPerim=i;
            }
        }
        System.out.println("triangle with max perim=");
        System.out.println(triangles[triangleWithMaxPerim].a+" "+triangles[triangleWithMaxPerim].b+" "+triangles[triangleWithMaxPerim].c+" p="+triangles
        [triangleWithMaxPerim].getPerim());
        System.out.println(triangles.toString()); //  не выводит
    }


}
