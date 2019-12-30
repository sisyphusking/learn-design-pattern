package iterator;

public class Iterate {

    public static void exec(Iterator iterator){
        for(iterator.First(); !iterator.IsDone();){
            int i = iterator.Next();
            System.out.println("i："+ i);
        }
    }
}
