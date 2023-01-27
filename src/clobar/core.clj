(ns clobar.core
  (:require [clojure.main :refer :all]))

(defn clobar
  "Open a simple Clojure repl. The argument list is defined as a var named \"context\"."
  [& context]
  (clojure.main/repl
    :init #(def context context)
    :prompt #(print "clobar=> ")))
