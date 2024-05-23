package vn.tvn.data.type;

public class BooleanDemo {
    //java naming convention
    public static void main(String[] args) {
        boolean isChecked = true; // chi co 2 gia tri true/false
        //  khong de gia tri gi (boolean isChecked;) thi ngau nhien la false
// why?
        if (isChecked) {
        }

        Boolean objectBoolean = true;
        //Co 3 gtri: true, false, null

        Boolean data = null;
//        boolean dataNull = null;


        boolean value = objectBoolean.booleanValue();
        /** Ve nh tim hieu :Method duoi ( Boolean. ) dung lam gi*/
        // Boolean.
        boolean parseValue = Boolean.parseBoolean("true");
    }
}
