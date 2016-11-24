(ns advent-of-code.day4
  (:gen-class))

(defn md5
  "Generate a md5 checksum for the given string"
  [token]
  (let [hash-bytes
         (doto (java.security.MessageDigest/getInstance "MD5")
               (.reset)
               (.update (.getBytes token)))]
    (let [sig (.toString (BigInteger. 1 (.digest hash-bytes)) 16)
          padding (apply str (repeat (- 32 (count sig)) "0"))]
       (str padding sig))))

(defn valid-hash? [n sk prefix]
  (let [h (md5 (str sk n))]
    (= (subs h 0 (count prefix)) prefix)))

(defn day4 [sk prefix]
  (let [n 0]
    (loop [n n]
      (if (valid-hash? n sk prefix)
        n
        (recur (inc n))))))
