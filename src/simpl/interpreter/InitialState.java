package simpl.interpreter;

import static simpl.parser.Symbol.symbol;
import simpl.interpreter.lib.hd;
import simpl.interpreter.lib.tl;
import simpl.interpreter.lib.fst;
import simpl.interpreter.lib.snd;
import simpl.interpreter.pcf.iszero;
import simpl.interpreter.pcf.pred;
import simpl.interpreter.pcf.succ;

public class InitialState extends State {

    public InitialState() {
        super(initialEnv(Env.empty), new Mem(), new Int(0));
    }

    private static Env initialEnv(Env E) {
        return 
            new Env(
            new Env(
            new Env(
            new Env(
            new Env(
            new Env(
            new Env(E,symbol("fst"),new fst()),
            symbol("snd"),new snd()),
            symbol("hd"),new hd()),
            symbol("tl"),new tl()),
            symbol("iszero"),new iszero()),
            symbol("pred"),new pred()),
            symbol("succ"),new succ())
            ;
    }
}
