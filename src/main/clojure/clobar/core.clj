(ns clobar.core
  (:require [clojure.main :only [repl]]))
(defn contextual-eval
  "Evaluate with a passed context. Originates from Joy of Clojure chapter 8."
  [ctx expr]
  (eval
    `(let [~@(mapcat (fn [[k v]] [k `'~v]) ctx)]
       ~expr)))

(defmacro local-context
  "Collect the local context. Originates from Joy of clojure chapter 13."
  []
  (let [symbols (keys &env)]
    (zipmap (map (fn [sym] `(quote ~sym)) symbols) symbols)))

(defn clobar
  "Open a simple Clojure repl. The first argument is bound as \"context\"."
  [context]
  (clojure.main/repl
    :prompt #(print "\nclobar=> ")
    :eval (partial contextual-eval (local-context))))
