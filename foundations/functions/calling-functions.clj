; function calls are expressions that have a funtion expression as operator
; sintax => opening parenthesis operator operands closing parenthesis
(+ 1 2 3 4)
(* 1 2 3 4)
(first [1 2 3 4])


(or + -)
; => #<core$_PLUS_ clojure.core$_PLUS_@76dace31> representation of additions function

; return addition function and operates with the others values
((or + -) 1 2 3)
; => 6

((and (= 1 1) +) 1 2 3)
; => 6

((first [+ 0]) 1 2 3)
; => 6


; inc increments number by 1
(inc 1.1)
; => 2.1

(map inc [0 1 2 3])
; => (1 2 3 4)
; map doesn't return a vector

; order of evaluation
(+ (inc 199) (/ 100 (- 7 2)))
(+ 200 (/ 100 (- 7 2))) ; evaluated "(inc 199)"
(+ 200 (/ 100 5)) ; evaluated (- 7 2)
(+ 200 20) ; evaluated (/ 100 5)
220 ; final evaluation

; Function Calls, Macro Calls, and Special Forms