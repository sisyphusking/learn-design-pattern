package iterator;

public class Number implements Iterator {

    private int start;
    private int end;

    private int n;

    public Number(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public void First() {
        this.n = this.start;
    }

    @Override
    public int Next() {
        if (!IsDone()){
            int temp = this.n ;
            this.n ++;
            return temp;
        }
        return 0;
    }

    @Override
    public boolean IsDone() {
        if (this.n<=this.end){
            return false;
        }
        return true;
    }
}
