(ns cl-easy.twosum
  (:gen-class))

(defn chk-sum-log [lst1 size sum]
  (let [first1 (first lst1)]
    (loop [lst2 (next lst1)]
      (let [pos1 (- size (count lst1))
            pos2 (- size (count lst2))
            flag (not= sum (+ first1 (first lst2)))]
        (println "   > pos1=" pos1  ;; 1-я позиция
                 "pos2=" pos2     ;; 2-я позиция
                 "flag=" flag)
        (println "  =" lst2
                 (count lst2)
                 "first1=" first1)
        (if (and lst2 flag (next lst2))
          (recur (next lst2))
          (when (not flag)
            (vector pos1 pos2))
          )))))

;; 
(defn twosum-log [arr sum]
  (let [size (count arr)]
    (println "size=" size
             "sum=" sum)
    (loop [lst1 arr]
      (println "-" lst1
               (count lst1)
               (- size (count lst1)))
      (let [res (chk-sum-log lst1 size sum)]
        (println "- res=" res)
        (if (and (not res) lst1)
          (recur (next lst1))
          (when res
            res))))))

(defn chk-sum [lst1 size sum]
  (let [first1 (first lst1)]
    (loop [lst2 (rest lst1)]
      (let [pos1 (- size (count lst1))
            pos2 (- size (count lst2))
            flag (not= sum (+ first1 (first lst2)))]
        (if (and lst2 flag (next lst2))
          (recur (next lst2))
          (when (not flag)
            (vector pos1 pos2)))))))

;; TODO: here
(defn twosum [numbers target]
  (let [size (count numbers)]
    (loop [lst1 numbers]
      (let [res (chk-sum lst1 size target)]
        (if (and (not res) lst1)
          (recur (next lst1))
          (when res
            res))))))

