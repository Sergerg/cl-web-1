(ns cl-easy.twosum
  (:gen-class))

;; first rest
(defn t1 [arr sum]
  (let [pos (count arr)])
  )

;; TODO: here
(defn twosum [numbers target]
  [1 1]
  )

(defn bbb [lst1 size sum]
  (let [first1 (first lst1)]
    (loop [lst2 (rest lst1)]
      (let [pos1 (- size (count lst1))
            pos2 (- size (count lst2))
            flag (not= sum (+ first1 (first lst2)))]
        (println "   > pos1=" pos1  ;; 1-я позиция
                 "pos2=" pos2     ;; 2-я позиция
                 "flag=" flag
                 )
        (when (and lst2 flag)
          (println "- =" lst2
                   (count lst2)
                   "first1=" first1)
          (recur (next lst2)))))
    ))

;; TEST!
(defn aaa [arr sum]
  (let [size (count arr) 
        f false
        res []]
    (println "size=" size
             "sum=" sum)
    (loop [lst1 arr]
      (when lst1
        (println "-" lst1
                 (count lst1)
                 (- size (count lst1))
                 "f=" f)
        (bbb lst1 size sum)
        (recur (next lst1))))
    (when f
      (println
       "===" res)
      res)
    ))



