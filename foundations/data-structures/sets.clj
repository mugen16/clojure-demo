; Sets
; Are collections of unique values. Clojure has two kinds of sets: hash sets and sorted sets.
; https://www.braveclojure.com/do-things/#Sets

; Hashed Set notation
#{"kurt vonnegut" 20 :icicle}

; 'hash-set' to create a Set

(hash-set 1 1 2 2)
; => #{1 2}

; If you try to add a value to a set that already contains that value (such as :b in the following code),
; it will still have only one of that value:
(conj #{:a :b} :b)
; => #{:a :b}

; use 'conj' to add a value into the Set

; 'set' to create a Set from an existing list or vector
(set [3 3 3 4 4])
; => #{3 4}

; Check for set membership using the contains?
; function, by using get, or by using a keyword as a function with the set as its argument. contains?
; returns true or false, whereas get and keyword lookup will return the value if it exists,
; or nil if it doesn’t.

; using 'contains?' #hash keyword/value
(contains? #{:a :b} :a)
; => true

(contains? #{:a :b} 3)
; => false

(contains? #{nil} nil)
; => true

; using a keyword as function
(:a #{:a :b})
; => :a

; using 'get'
(get #{:a :b} :a)
; => :a

; Notice that using get to test whether a set contains nil will always return nil, which is confusing.
; 'contains?' may be the better option when you’re testing specifically for set membership.
(get #{:a nil} nil)
; => nil

(get #{:a :b} "kurt vonnegut")
; => nil
