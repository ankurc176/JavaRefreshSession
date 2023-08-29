package Exception;



public class ThrowsTest {

    static int area(int l, int b) throws Exception {
        int res;

        if(l<0 || b<0) {
            throw new Exception();
        }
        else {
            res= l*b;
        }
        return res;
    }

    static int meth2(int a, int b) throws Exception {

       return area(a,b);

    }

    public static void main(String[] args) throws Exception {

        int a= -10, b =9;
        try {
            meth2(a,b);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("BYE");
    }

}
