package simpl.interpreter;

class NilValue extends Value {

    protected NilValue() {
    }

    public String toString() {
        return "nil";
    }

    @Override
    public boolean equals(Object other) {
        // 如果一个类型等于NilValue，返回true，否则返回false
        if(other instanceof NilValue){
            return true;
        }
        return false;
    }
}
