package vn.tvn.how.to.define.method;

public class DefineMethod {

//1.public
    //2. void: method ko tra ve gtri nào
    //3. method_name: tên của method
    //4 (...) parameters: là giá trị đưa vào để xử lý
    //5. {...} body của method, nơi xử lý

   // public  void method_name(String parameter,....) {
    //câu lệnh
    //  }


    //viết method tiính tổng 2 số mà không có gtri trả về

    public void sumTwoNumber(int a, int b){
      int total = Integer.sum(a, b);
        System.out.println(total);

    }
    // method có gtri trả về

    public  int sumTwoNumbersAndReturn(int a, int b){

        int total = Integer.sum(a, b);
        return  total;
    }


    // Method không có parameter
public  void    sumTwoNumberNoParameter(){

        int a = 10;
        int b = 100;
        int total = a + b;
    System.out.println(total);
}

}
