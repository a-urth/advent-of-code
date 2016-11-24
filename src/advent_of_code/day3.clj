(ns advent-of-code.day3
  (:gen-class))

(defn get-coords [sym x y]
  (case sym
    \^ [x (+ y 1)]
    \v [x (- y 1)]
    \> [(+ x 1) y]
    \< [(- x 1) y]
    [x y]))

(defn day3-1 [input]
  (count
    (loop [x 0 y 0
           res #{[x y]}
           [pred & more] input]
      (if (nil? pred)
        res
        (let [[x y] (get-coords pred x y)]
          (recur x y
                 (conj res [x y])
                 more))))))

(defn day3-2 [input]
  (count
    (loop [x-s 0 y-s 0
           x-r 0 y-r 0
           res #{[x-s y-s]}
           [pred-santa pred-robo & more] input]
      (if (nil? pred-santa)
        res
        (let [[x-s y-s] (get-coords pred-santa x-s y-s)
              [x-r y-r] (get-coords pred-robo x-r y-r)]
          (recur x-s y-s
                 x-r y-r
                 (conj (conj res [x-s y-s]) [x-r y-r])
                 more))))))
