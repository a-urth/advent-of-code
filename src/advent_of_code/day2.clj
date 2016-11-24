(ns advent-of-code.day2
  (:require [clojure.string :as str])
  (:gen-class))

(defn get-sizes [row]
  (map #(Integer. %) (str/split row #"x")))

(defn day2-1 [input]
  (defn calc-paper [row]
    (let [[a b c]
          (get-sizes row)]
     (let [[s1 s2 s3]
           (map (fn [[x y]] (* x y))
                [[a b] [a c] [b c]])]
       (+ (min s1 s2 s3)
          (* (+ s1 s2 s3) 2)))))
  (reduce + (map calc-paper
                 (str/split-lines input))))

(defn day2-2 [input]
  (defn calc-ribbon [row]
    (let [[a b c] (get-sizes row)]
     (let [[p1 p2 p3]
           (map (fn [[x y]] (* (+ x y) 2))
                [[a b] [a c] [b c]])]
       (+ (min p1 p2 p3)
          (* a b c)))))
  (reduce + (map calc-ribbon (str/split-lines input))))
