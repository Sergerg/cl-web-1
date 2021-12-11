(ns cl-easy.rome-test
  (:require [clojure.test :refer :all]
            [cl-easy.rome :refer :all]))

;; TODO: (translate-roman-numerals "XXI") ;; should return 21

(deftest translate-roman-numerals-test
  (testing "translate-roman-numerals"
    (is (= 10 (translate-roman-numerals "X")))))

(deftest translate-roman-numerals-I-test
  (testing "translate-roman-numerals"
    (is (not= 0 (translate-roman-numerals "I")))))

(deftest translate-roman-numerals-I-test
  (testing "translate-roman-numerals"
    (is (= 449 (translate-roman-numerals "CDXLIX")))
    (is (= 989 (translate-roman-numerals "CMLXXXIX")))
    (is (= 990 (translate-roman-numerals "CMXC")))
    (is (= 991 (translate-roman-numerals "CMXCI")))
    (is (= 998 (translate-roman-numerals "CMXCVIII")))
    (is (= 999 (translate-roman-numerals "CMXCIX")))
    ))

