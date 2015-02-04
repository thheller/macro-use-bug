(ns macro-use.core
  (:require-macros [macro-use.core :as m]))

(defn not-a-macro []
  :foo)
