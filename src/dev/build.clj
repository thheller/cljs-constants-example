(ns build
  (:require [shadow.cljs.build :as cljs]
            [cljs.build.api :as cljs-build]
            [clojure.java.io :as io]))


(defn shadow-once []
  (-> (cljs/init-state)
      (cljs/set-build-options
        {:optimizations :advanced
         :pretty-print true
         :public-dir (io/file "out/shadow")
         :public-path "out/shadow"})
      (cljs/find-resources-in-classpath)
      (cljs/configure-module :cljs '[cljs.core] #{})
      (cljs/configure-module :a '[cljs-constants.a] #{:cljs})
      (cljs/configure-module :b '[cljs-constants.b] #{:cljs :a})
      (cljs/configure-module :c '[cljs-constants.c] #{:cljs :a})
      (cljs/compile-modules)
      (cljs/closure-optimize)
      (cljs/flush-modules-to-disk))
  :done)

(defn cljs-once []
  (cljs.build.api/build "src"
    {:output-to "out/main.js"
     :verbose true
     :asset-path "out"
     :optimizations :advanced
     :pretty-print true
     :output-dir "out/cljs"
     :modules {:a
               {:output-to "out/cljs/a.js"
                :entries #{"cljs-constants.a"}}
               :b
               {:output-to "out/cljs/b.js"
                :entries #{"cljs-constants.b"}
                :depends-on #{:a}}
               :c
               {:output-to "out/cljs/c.js"
                :entries #{"cljs-constants.c"}
                :depends-on #{:a}}}}))
