; array - are 0-indexed
[3 2 1]

; getting a value from a position
(get [3 2 1] 0)

(get ["a" {:name "Pugsley Winterbottom"} "c"] 1)

; vectors can have multiples elements types

; use 'vector' reserved-word to create a vector
(vector "creepy" "full" "moon")
; => ["creepy" "full" "moon"]

; use 'conj' to add additional elements to the vector
(conj [1 2 3] 4)
; => [1 2 3 4]
