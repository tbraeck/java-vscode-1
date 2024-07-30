public class FunctionsWithReturnValue {
    public static void main(String[] args) {
        
        // create instance of the class here and store in object
        FunctionsWithReturnValue obj = new FunctionsWithReturnValue();

        int x = 160;
        int y = 270;

        int get_result = obj.add(x,y);

        System.out.println(get_result);
        
    }

    public int add(int c, int d) {

        int result = c + d;
        return result;
    }
}
