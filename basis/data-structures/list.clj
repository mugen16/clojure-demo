; Lists
; Are similar to vectors in that they’re linear collections of values.
; But there are some differences. For example, you can’t retrieve list elements with get.
; To write a list literal, just insert the elements into parentheses and use a single quote at the beginning

'(1 2 3 4)
; => (1 2 3 4)

; use 'nth' to retreive an element from the list

(nth '(:a :b :c) 0)
; => :a

(nth '(:a :b :c) 2)
; => :c

; 'nth' is slower is list than 'get' in vectors
; Clojure has to traverse all n elements of a list to get to the nth,
; whereas it only takes a few hops at most to access a vector element by its index.

; Lists can have any type
; Number, String, Map
(list 1 "two" {3 4})

; With 'conj' elements are addded to the beginning of the list
(conj '(1 2 3) 4)
; => (4 1 2 3)

; When should you use a list and when should you use a vector?
; If you need to easily add items to the beginning of a sequence or if you’re writing a macro, you should use a list.
; Otherwise, you should use a vector.