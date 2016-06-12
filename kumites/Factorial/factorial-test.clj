(ns factorial-test
  (:require [clojure.test :refer :all]
            [factorial :refer [get-factorial]]))
            
(deftest get-factorial-test
  (is (get-factorial (- 10)) 0)
  (is (get-factorial 0) 0)
  (is (get-factorial 1) 1)
  (is (get-factorial 2) 2)
  (is (get-factorial 3) 6)
  (is (get-factorial 4) 24)
  (is (get-factorial 5) 120)
  (is (get-factorial 10) 3628800)
  (is (get-factorial 15) 1307674368000)
  (is (get-factorial 20) 2432902008176640000))