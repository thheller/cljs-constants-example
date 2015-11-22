(ns cljs-constants.b
  (:require [cljs-constants.a :as a]))

(js/console.log ::TEST-KEYWORD)
(js/console.log ::a/TEST-KEYWORD)
(js/console.log :TEST-KEYWORD)