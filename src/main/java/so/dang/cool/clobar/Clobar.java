package so.dang.cool.clobar;

import clojure.java.api.Clojure;

/**
 * A crowbar that lets you pry open your code with Clojure.
 */
public final class Clobar {
    Clobar() {} // Prevent instantiation.

    /**
     * Subject to change! Starts a Clojure REPL, the parameter passed is bound to 'context' in the REPL.
     * @param context Some object you want to inspect in the REPL.
     */
    public static <A> void pry(A context) {
        Clojure.var("clojure.core", "require").invoke(Clojure.read("clobar.core"));
        Clojure.var("clobar.core", "clobar").invoke(context);
    }
}