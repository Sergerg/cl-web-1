(ns cl-easy.highandlow
  (:require [clojure.string :as str]))

(defn vector-to-text
  [v]
  (str/join " " v))

(defn str-to-vector
  [s]
  (map #(read-string %)
       (str/split s #" ")))

(println (str-to-vector "1 2 3"))
(println (apply min (str-to-vector "1 2 3")))
(println (apply max (str-to-vector "1 2 3")))

(defn h-a-l
  [s]
  (let [l (str-to-vector s)]
    (vector-to-text
     (list (apply min l) (apply max l)))))

(h-a-l "1 2 3")

(defn high-and-low [s]
  (let [l (str-to-vector s)]
    (str/join
     " "
     (list (apply max l) (apply min l)))))

(high-and-low "-1 23 -23 34")

;(+ (read-string  "123") -11)
