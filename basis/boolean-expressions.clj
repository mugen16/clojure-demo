; 'nil' indicates not value
; check if a value is 'nil'
(nil? 1)
; => false

(nil? nil)
; => true

; 'nil' and false are falsey values, whereas all other values are logically truthy


; equal '='
(= 1 1)
; => true

(= nil nil)
; => true

(= 1 2)
; => false


; 'or' => returns either the first truthy value or the last value.
(or false nil :large_I_mean_venti :why_cant_I_just_say_large)
; => :large_I_mean_venti

(or (= 0 1) (= "yes" "no"))
; => false

(or nil)
; => nil


; 'and' => returns the first falsey value or, if no values are falsey, the last truthy value
(and :free_wifi :hot_coffee)
; => :hot_coffee

(and :feelin_super_cool nil false)
; => nil
