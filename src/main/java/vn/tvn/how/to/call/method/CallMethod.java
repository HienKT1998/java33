package vn.tvn.how.to.call.method;

import vn.tvn.how.to.define.method.DefineMethod;

public class CallMethod {

    public static void main(String[] args) {
       int max = getMax( 100, 200);

        DefineMethod defineMethod = new DefineMethod();//new object
       int sum =  defineMethod.sumTwoNumbersAndReturn(100, 200);


//telegram cuủa thầy : 0934003156


    }


    //same class của main

    public static int getMax(int a, int b){
        return Integer.max(a, b);

    }

    //từ method static call other method
    //1. other method đó phải là static
    // 2. new object other meathod

    // từ method no static call other method;
    //--> no cần add static
    //new object gọi nếu khác class


}


