(ns fibonacci)

(defn get-fibonacci-number [index]
  "Finds fibonacci number by given index"
  (if (<= index 0) 0)
  (if (<= index 2) 1
    (+ (get-fibonacci-number (- index 1))
       (get-fibonacci-number (- index 2)))))