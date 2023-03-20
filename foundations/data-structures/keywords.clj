; are primarily used as keys in maps

:a
:rumplestiltsken
:34
:_?

; keyword as function
(:a {:a 1 :b 2 :c 3})
; => 1

; equivalent to

; using get
(get {:a 1 :b 2 :c 3} :a)
; => 1

;keyword as function using a default value
(:d {:a 1 :b 2 :c 3} "No gnome knows homes like Noah knows")
; => "No gnome knows homes like Noah knows"

