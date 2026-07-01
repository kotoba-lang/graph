(ns graph-test
  (:require [clojure.test :refer [deftest is testing]]
            [graph]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? graph))))
