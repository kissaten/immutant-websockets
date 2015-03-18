(defproject demo "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.6.0"]
                  [org.immutant/web "2.0.0-beta2"]
                  [compojure "1.1.8"]
                  [ring/ring-core "1.3.0"]
                  [environ "1.0.0"]]
  :main demo.core
  :uberjar-name "demo-standalone.jar"
  :profiles {:uberjar {:aot [demo.core]}}
  :min-lein-version "2.4.0")
