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
        (let [f1 (first lst1)]
          (loop [lst2 (rest lst1)]
            (println " > pos1=" (- size (count lst1)) ;; 1-я позиция
                     "pos2=" (- size (count lst2));; 2-я позиция
                     )
            (when (and lst2 
                       (not= sum (+ f1 (first lst2))))
              (println "- =" lst2
                       (count lst2)
                       "f1=" f1)
              (recur (next lst2)))
            ))
        (recur (next lst1))))
    (when f
      (println
       "===" res)
      res)
    ))



