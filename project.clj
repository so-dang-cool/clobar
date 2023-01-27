(defproject so.dang.cool.clobar/clobar "1.0.0"
  :description "A crowbar that lets you pry open your code with Clojure."
  :url "https://github.com/hiljusti/clobar"
  :license {:name "BSD-3-Clause"
            :url "https://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :repl-options {:init-ns clobar.core}
  :source-paths      ["src/main/clojure"]
  :java-source-paths ["src/main/java"]
  :javac-options     ["-target" "1.8" "-source" "1.8"])
