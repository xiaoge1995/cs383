package simpl.interpreter;

public class IntValue extends Value {

    public final int n;

    public IntValue(int n) {
        this.n = n;
    }

    public String toString() {
        return "" + n;
    }

    @Override
    public boolean equals(Object other) {
        // 用于判断一个类型是否为int，若是，返回n是否等于这个object的值，否则返回false
        // 不仅判断是否是类型是否是int，还判断值是否相等
        if(other instanceof IntValue){
            return n==((IntValue)other).n;
        }
            return false;
    }
}
