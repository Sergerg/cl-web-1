(defproject web "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 
                 [compojure "1.6.1"]

                 [ring/ring-core "1.7.1"]
                 [ring/ring-jetty-adapter "1.7.1"]

                ;;  [metosin/reitit "0.7.0-alpha7"]
                ;;  [metosin/ring-swagger-ui "5.9.0"]
                 ]
              ;[aleph "0.4.7-alpha5"]
  :main ^:skip-aot web.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}}
  :repl-options {:init-ns example.server})
