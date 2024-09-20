(ns cl-easy.last
  (:require [clojure.string :as str])
  (:gen-class))

;; Find the last element of the given argument(s). If a single argument is passed and is a list/array or a string, return its last element. It is guaranteed that there will be at least one argument and that single-argument arrays/lists/strings will not be empty.

;; Examples
;; (last [1, 2, 3, 4]) ; => 4
;; (last "xyz")        ; => \z

(defn last
  "Last element"
  [list]
  (if (= (count list) 0)
    nil
    (nth list (dec (count list))))
  )

'()

(last '(1 2 3 4))
(last "sssssssssss23")

(= (last [1 9 13 1 99 9 9 13]) 13)

(= (last '()) nil)
(= (last "") nil)
(= (last nil) nil)

(= (last "\"I suppose I should learn Lisp, but it seems so foreign.\" - Paul Graham, Nov 1983") \3)


