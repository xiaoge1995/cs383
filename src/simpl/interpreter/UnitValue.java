package simpl.interpreter;

class UnitValue extends Value {

    protected UnitValue() {
    }

    public String toString() {
        return "unit";
    }

    @Override
    public boolean equals(Object other) {
        // 判断一个类型是否为UnitValue，若是返回true，否则返回false
        if(other instanceof UnitValue){
            return true;
        }
        return false;
    }
}
