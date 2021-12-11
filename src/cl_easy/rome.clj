(ns cl-easy.rome
  (:require [clojure.string :as str])
  (:gen-class))

;; Римские цифры! Kata2
;; I - 1
;; V - 5
;; X - 10
;; L - 50
;; C - 100
;; D - 500
;; M - 1000

;; 449 CDXLIX
;; 989 CMLXXXIX
;; 990 CMXC 
;; 991 CMXCI 
;; 992 CMXCII 
;; 993 CMXCIII 
;; 994 CMXCIV 
;; 995 CMXCV 
;; 996 CMXCVI 
;; 997 CMXCVII 
;; 998 CMXCVIII 
;; 999 CMXCIX

(defn char-to-num
  "Символ в число"
  [c]
  (case c
   "I" 1 "V" 5 "X" 10 "L" 50 "C" 100 "D" 500 "M" 1000 
    nil))

;; (char-to-num "I")
;; (char-to-num "V")
;; (char-to-num nil)
;; (char-to-num 1)

(defn translate-roman-numerals
  "Римские цифры в арабские"
  [str]
  (reduce + (map char-to-num (str/split str #""))))

;; (translate-roman-numerals "XXX")

