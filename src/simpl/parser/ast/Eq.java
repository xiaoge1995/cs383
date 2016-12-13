package simpl.parser.ast;

import simpl.interpreter.BoolValue;
import simpl.interpreter.IntValue;
import simpl.interpreter.RuntimeError;
import simpl.interpreter.State;
import simpl.interpreter.Value;

public class Eq extends EqExpr {

    public Eq(Expr l, Expr r) {
        super(l, r);
    }

    public String toString() {
        return "(" + l + " = " + r + ")";
    }

    @Override
    public Value eval(State s) throws RuntimeError {
        // 返回v1==v2
        Value v1 = l.eval(s);
        Value v2 = r.eval(s);
        if(!(v1 instanceof IntValue && v2 instanceof IntValue)){
            throw new RuntimeError("must be 2 int values");
        }
        return new BoolValue(v1.equals(v2));
    }
}
