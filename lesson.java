
public class lesson {

    public static void main(String[] args) {
        int [] array = new int[] { 4,6,8,2};
        System.out.println(getArrayLenght(array, 3));
    }
    public static int getArrayLenght(int[] array, int value){
        if(array.length < value){
            return -1;
        }
        return array.length;
    }
}
