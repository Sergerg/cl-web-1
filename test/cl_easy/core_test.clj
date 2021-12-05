(ns cl-easy.core-test
  (:require [clojure.test :refer :all]
            [cl-easy.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest str-to-vector-test
  (testing "str-to-vector"
    (is (= ["1" "2" "Ss"] (str-to-vector "1 2 ss")))))
