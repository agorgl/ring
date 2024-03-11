(defproject ring/ring-devel "1.12.0"
  :description "Ring development and debugging libraries."
  :url "https://github.com/ring-clojure/ring"
  :scm {:dir ".."}
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring/ring-core "1.12.0"]
                 [hiccup "1.0.5"]
                 [clj-stacktrace "0.2.8"]
                 [ns-tracker "0.4.0"]]
  :aliases {"test-all" ["with-profile" "default:+1.10:+1.11:+1.12" "test"]}
  :profiles
  {:1.10 {:dependencies [[org.clojure/clojure "1.10.3"]]}
   :1.11 {:dependencies [[org.clojure/clojure "1.11.2"]]}
   :1.12 {:dependencies [[org.clojure/clojure "1.12.0-alpha9"]]}})
