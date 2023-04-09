package SecondEx;
import interfaces.Joiner;
import java.util.ArrayList;

public class Second<R> implements Joiner<R> {

    public static int foldInt(ArrayList<Integer> list){
        int result = 0;
        int count = 0;
        for(int i = 0; i < list.size(); i++){
            result = list.get(i);
            count = result + count;
        }
        return count;
    }
    public static String foldString(ArrayList<String> list){
        String result;
        String count = list.get(0);
        for(int i = 1; i < list.size(); i++){
            result = list.get(i);
            count = count + " " + result;
        }
        return count;
    }

    @Override
    public R join(R first, R second) {
        return (R) (first + " " + second);
    }
}
