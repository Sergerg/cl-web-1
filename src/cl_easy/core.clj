(ns cl-easy.core
  (:gen-class))

(defn sss
  "Easy func! Concat 2 param"
  [a b] 
  (str a b))

(defn mmm
  "Easy func! Concat 2 param"
  [a b c]
  (* a b c))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println 
    (sss "Hello, World! " 
         "Str\n"))
  (println (mmm 11 22 33))
  (println (mmm 12 12 12)))
