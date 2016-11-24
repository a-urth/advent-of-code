(ns advent-of-code.day1
  (:gen-class))

(defn day1-1 [input]
  (reduce + (map #(if (= \( %) 1 (if (= \) %) -1 0)) input)))

(defn day1-2 [input]
  (loop [sum 0
         i 1
         [pred & more] input]
    (let [sum
          (+ sum (if (= \( pred) 1 (if (= \) pred) -1 0)))]
      (if (= sum -1) i
        (if (empty? more) -1
          (recur sum (+ i 1) more))))))
