package so.dang.cool.clobar;

import clojure.java.api.Clojure;

/**
 * A crowbar that lets you pry open your code with Clojure.
 */
public final class Clobar {
    Clobar() {} // Prevent instantiation.

    public static void pry(Object... context) {
        Clojure.var("clojure.core", "require").invoke(Clojure.read("clobar.core"));
        Clojure.var("clobar.core", "clobar").invoke(context);
    }
}