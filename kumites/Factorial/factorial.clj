(ns factorial)

(defn get-factorial [n]
  "takes n as a paramenter and returns n!"
  (if (<= n 0) 0)
  (if (<= n 1) 1
   (* n (get-factorial (dec n)))))