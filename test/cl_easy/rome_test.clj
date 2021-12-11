(ns cl-easy.rome-test
  (:require [clojure.test :refer :all]
            [cl-easy.core :refer :all]))

;; TODO: (translate-roman-numerals "XXI") ;; should return 21

(deftest translate-roman-numerals-test
  (testing "translate-roman-numerals"
    (is (= 0 (translate-roman-numerals "")))))

(deftest translate-roman-numerals-I-test
  (testing "translate-roman-numerals"
    (is (= 0 (translate-roman-numerals "I")))))
