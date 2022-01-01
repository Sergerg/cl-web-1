(ns cl-easy.twosum-test
  (:require [clojure.test :refer :all]
            [cl-easy.twosum :refer :all]))

(deftest translate-roman-numerals-test
  (testing "test"
    (is (= 10 10))))

(deftest twosum-example-tests
  (is (= (sort < (twosum '[1 2 3] 4)) '[0 2]))
  (is (= (sort < (twosum '[1234 5678 9012] 14690)) '[1 2]))
  (is (= (sort < (twosum '[2 2 3] 4)) '[0 1])))


