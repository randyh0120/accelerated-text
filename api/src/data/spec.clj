(ns data.spec
  (:require [clojure.spec.alpha :as s]
            [data.spec.language :as language]
            [data.spec.result :as result]))

(s/def ::result (s/keys ::req [::result/id ::result/status]
                        ::opt [::result/rows ::result/error-message]))

(s/def ::results (s/coll-of ::result))

(s/def ::language (s/keys ::req [::language/code ::language/name ::language/enabled?]))

(s/def ::languages (s/coll-of ::language))
