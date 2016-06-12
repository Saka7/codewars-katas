(ns fibonacci-test
  (:require [clojure.test :refer :all]
            [fibonacci :refer [get-fibonacci-number]]))
            
(deftest get-fibonacci-number-test
  (is (get-fibonacci-number (- 10)) 0)
  (is (get-fibonacci-number 0) 0)
  (is (get-fibonacci-number 1) 1)
  (is (get-fibonacci-number 2) 1)
  (is (get-fibonacci-number 3) 2)
  (is (get-fibonacci-number 4) 3)
  (is (get-fibonacci-number 5) 5)
  (is (get-fibonacci-number 10) 55)
  (is (get-fibonacci-number 30) 832040))