(defproject so.dang.cool/clobar "1.0.1"
  :description "A crowbar that lets you pry open your code with Clojure."
  :url "https://github.com/hiljusti/clobar"
  :license {:name "BSD-3-Clause"
            :url "https://opensource.org/licenses/BSD-3-Clause"}
  :scm {:name "git" :url "https://github.com/hiljusti/clobar"}
  :pom-addition ([:developers
                  [:developer
                   [:id "hiljusti"]
                   [:name "J.R. Hill"]
                   [:url "https://so.dang.cool"]]])
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :repl-options {:init-ns clobar.core}
  :source-paths      ["src/main/clojure"]
  :java-source-paths ["src/main/java"]
  :javac-options     ["-target" "1.8" "-source" "1.8"]
  :deploy-repositories [["central" {:url "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                                    :creds :gpg}]]
  :classifiers {:javadoc {:java-source-paths ^:replace []
                          :source-paths      ^:replace []
                          :resource-paths    ^:replace ["javadoc"]}
                :sources {:source-paths   ^:replace ["src"]
                          :resource-paths ^:replace []}})
