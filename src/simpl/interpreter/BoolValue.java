package simpl.interpreter;

public class BoolValue extends Value {

    public final boolean b;

    public BoolValue(boolean b) {
        this.b = b;
    }

    public String toString() {
        return "" + b;
    }

    @Override
    public boolean equals(Object other) {
        // 用于判断一个类型是否为Bool，若是，返回b是否等于这个object的值，否则返回false
        // 不仅判断是否是类型是否是Bool，还判断值是否相等
        if(other instanceof BoolValue){
            return b==((BoolValue)other).b;
        }
        return false;
    }
}
