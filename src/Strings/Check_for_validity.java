package Strings;

public class Check_for_validity {
    //ввести с консоли строку-имя и проверить ее на допустимость:имя должно состоять из буквенно-цифровых символов
    //длинной от 5-15 символов
    public static boolean check_option(String value){
        if (value.length()>=5||value.length()<=25){
            String pattern="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,w,v,x,y,z,1,2,3,4,5,6,7,8,9,0";
            for (char symbol:value.toCharArray()) { //value.toCharArray() преобр в массив символов
                if (pattern.indexOf(symbol)==-1){
                    return  false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        String row="helloiamyourdriver";
        if (check_option(row)){
            System.out.println("name is correct");
        }else {
            System.out.println("name isn't correct");
        }

    }
}
