; basic declaration
{:first-name "Charlie"
 :last-name "McFishwich"}

; fuction binded to a key
{"string-key" +}

; nested
{:name {:first "John" :middle "Jacob" :last "Jingleheimerschmidt"}}

; create a map
(hash-map :a 1 :b 2)
; => {:a 1 :b 2}

; get function
(get {:a 0 :b 1} :b)
; => 1

(get {:a 0 :b {:c "ho hum"}} :b)
; => {:c "ho hum"}

; get will return nil if it doesn’t find your key, or you can give it a default value to return, such as "unicorns?":

(get {:a 0 :b 1} :c)
; => nil

(get {:a 0 :b 1} :c "unicorns?")
; => "unicorns?"

; The get-in function lets you look up values in nested maps:

(get-in {:a 0 :b {:c "ho hum"}} [:b :c])
; => "ho hum"

;Another way to look up a value in a map is to treat the map like a function with the key as its argument:

({:name "The Human Coffeepot"} :name)
; => "The Human Coffeepot"
