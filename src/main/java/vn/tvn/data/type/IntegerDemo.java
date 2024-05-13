package vn.tvn.data.type;

public class IntegerDemo   {
    //byte, short, int, long
    //4 type trên đều là số nguyeen, khac nhau o do luu trữ

    public static void main(String[] args) {
         byte age = 10; // co gtri tuw -128 den 127

        Byte ageObject = 10; // co them gtr Null
//        Byte.MIN_VALUE
//        Byte.MAX_VALUE
        /** Ve nha tim hieu them method khac*/



        short value = 300;// < 3k
        Short ShortObject = 400;// Co gtri Null
       int a = ShortObject.intValue();
        System.out.println(a);



        int totalOrder = 1000;
        Integer intObject = 1000;

        var max = Integer.MAX_VALUE;
        System.out.println(max);


        long totalSalary = 800000000;
        Long longObject = 80000L;






    }
}
