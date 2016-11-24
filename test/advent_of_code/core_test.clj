(ns advent-of-code.core-test
  (:require [clojure.test :refer :all]
            [advent-of-code.day1 :refer :all]
            [advent-of-code.day2 :refer :all]
            [advent-of-code.day3 :refer :all]
            [advent-of-code.day4 :refer :all]
            [advent-of-code.day5 :refer :all]))

(deftest a-day1-1-test
  (testing "Day 1-1 task"
    (is (= (day1-1 (slurp "resources/day1.txt")) 138))))

(deftest a-day1-2-test
  (testing "Day 1-2 task"
    (is (= (day1-2 (slurp "resources/day1.txt")) 1771))))

(deftest a-day2-1-tests
  (testing "Day 2-1 test"
    (is (= (day2-1 "2x3x4") 58))
    (is (= (day2-1 "1x1x10") 43))
    (is (= (day2-1 (slurp "resources/day2.txt")) 1588178))))

(deftest a-day2-2-tests
  (testing "Day 2-2 test"
    (is (= (day2-2 "2x3x4") 34))
    (is (= (day2-2 "1x1x10") 14))
    (is (= (day2-2 (slurp "resources/day2.txt")) 3783758))))

(deftest a-day3-1-tests
  (testing "Day 3-1 test"
    (is (= (day3-1 ">") 2))
    (is (= (day3-1 "^>v<") 4))
    (is (= (day3-1 "^v^v^v^v^v") 2))
    (is (= (day3-1 (slurp "resources/day3.txt")) 2081))))

(deftest a-day3-2-tests
  (testing "Day 3-2 test"
    (is (= (day3-2 "^v") 3))
    (is (= (day3-2 "^>v<") 3))
    (is (= (day3-2 "^v^v^v^v^v") 11))
    (is (= (day3-2 (slurp "resources/day3.txt")) 2341))))


(deftest a-day4-tests
  (testing "Day 4 test"
    (is (= (day4 "abcdef" "00000") 609043))
    (is (= (day4 "pqrstuv" "00000") 1048970))
    (is (= (day4 "ckczppom" "00000") 117946))
    (is (= (day4 "ckczppom" "000000") 3938038))))

(deftest a-day5-tests
  (testing "Day 5 test"
    (is (true? (day5 "ugknbfddgicrmopn")))
    (is (true? (day5 "aaa")))
    (is (false? (day5 "jchzalrnumimnmhp")))
    (is (false? (day5 "haegwjzuvuyypxyu")))
    (is (false? (day5 "dvszwmarrgswjxmb")))))
