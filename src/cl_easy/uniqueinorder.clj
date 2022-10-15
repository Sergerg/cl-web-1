(ns cl-easy.uniqueinorder
  (:require [clojure.string :as str])
  (:gen-class))

;; AAABCCcAAA -> [\A \B \C \c \A]

(defn uniqueInOrder
  [l]
  (seq l))

(defn str-to-vector "не нужна -> seq"
  [s]
  (str/split s #""))

(defn lll "HZ-func"
  [l] 
  (vector (last l) 1))

(comment
  ;; Отладка?
  (str/split "123" #"")
  (lll [1 2 3])

  ;;(str-to-vector "aaaa") ;; X
  ;;(str-to-vector [1 2]) ;; !!! X
  (uniqueInOrder "aaasss")
  (uniqueInOrder [1 2 3])

  (set [1 2 2])
  
  (set (str-to-vector "aaaSSSwwwЫЫЫ1ыЦЦЦЦ"))

  (seq "123")
  (seq "aaaSSSwwwЫЫЫ1ыЦЦЦЦ")
  (seq [1 2 3])
  (seq '(1 2 3))

  )


