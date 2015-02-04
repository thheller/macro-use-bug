(ns macro-use.bug
  (:require [macro-use.core :as core :refer (a-macro)]))

;; ¯\_(ツ)_/¯

(a-macro)
