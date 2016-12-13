package simpl.parser.ast;

import simpl.interpreter.BoolValue;
import simpl.interpreter.IntValue;
import simpl.interpreter.RuntimeError;
import simpl.interpreter.State;
import simpl.interpreter.Value;

public class Mod extends ArithExpr {

    public Mod(Expr l, Expr r) {
        super(l, r);
    }

    public String toString() {
        return "(" + l + " % " + r + ")";
    }

    @Override
    public Value eval(State s) throws RuntimeError {
        // 检查两数是否为整数，检查分母是否为0
        Value v1 = l.eval(s);
        Value v2 = r.eval(s);
        if(!(v1 instanceof IntValue && v2 instanceof IntValue)){
            throw new RuntimeError("must be 2 int values");
        }
        if(v2.equals(0)){
            throw new RuntimeError("0 can not be the denominator");
        }
        
        return new IntValue(((IntValue)v1).n % ((IntValue)v2).n);        
    }
}
