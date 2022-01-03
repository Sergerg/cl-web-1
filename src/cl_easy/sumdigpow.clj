(ns cl-easy.sumdigpow
  (:gen-class))

(defn dig1-log
  [num1]
  (loop [num num1 sum 0 cnt 0]
    (println num sum cnt)
    (if (> num 0)
      (recur (quot num 10)
             (+ sum (mod num 10))
             (inc cnt))
      sum)
    ))

(defn dig-log
  [num1]
  (loop [num num1 
         lst ()]
    (println num lst)
    (if (> num 0)
      (recur (quot num 10)
             (conj lst (mod num 10)))
      (reduce +
              (for [i (range (count lst))]
                (int (Math/pow (nth lst i) (+ i 1))))))))

(defn dig
  [num1]
  (loop [num num1 
         lst ()]
    (if (> num 0)
      (recur (quot num 10)
             (conj lst (mod num 10)))
      (reduce +
              (for [i (range (count lst))]
                (int (Math/pow (nth lst i) (+ i 1))))))))


;; 89 = 8^1+9^2
(defn sum-dig-pow [a b]
  (for [i (range a (+ b 1)) 
        :when (= i (dig i))] 
    i)
  )

;; Best
(defn sum-dig-pow1 [a b]
  (filter (fn [x]
            (= (reduce + 0 (map-indexed 
                            (fn [i a] 
                              (reduce * 1 (repeat (+ i 1) (- (int a) (int \0))))) 
                            (str x))) x))
          (range a (+ b 1))))
