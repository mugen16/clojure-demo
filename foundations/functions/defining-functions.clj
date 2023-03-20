; Defining functions
; Are composed of five main parts:
; 1. defn
; 2. Function name
; 3. A docstring describing the function (optional)
; 4. Parameters listed in brackets
; 5. Function body

; Example:
; ➊ (defn too-enthusiastic
;   ➋   "Return a cheer that might be a bit too enthusiastic"
;   ➌   [name]
;   ➍   (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY LIKE THE BEST "
;            "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))

; (too-enthusiastic "Zelda")
; ; => "OH. MY. GOD! Zelda YOU ARE MOST DEFINITELY LIKE THE BEST MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"

; Docstring
; (doc 'f-nname')
; (doc map)

; A function can have 0 or more parameters. 0-arity n-arity
; Values passed to the functions are called 'arguments' and can be any type

(defn no-params
  []
  "I take no parameters!")

(defn one-param
  [x]
  (str "I take one parameter: " x))

(defn two-params
  [x y]
  (str "Two parameters! That's nothing! Pah! I will smoosh them "
       "together to spite you! " x y))


; provide default values
(defn x-chop
  "Describe the kind of chop you're inflicting on someone"
  ([name chop-type]
   (str "I " chop-type " chop " name "! Take that!"))
  ([name]
   (x-chop name "karate")))

(x-chop "Kanye West" "slap")
; => "I slap chop Kanye West! Take that!"

(x-chop "Kanye East")
; => "I karate chop Kanye East! Take that!"

; Can also make each arity do something completely unrelated:
(defn weird-arity
  ([]
   "Destiny dressed you this morning, my friend, and now Fear is
     trying to pull off your pants. If you give up, if you give in,
     you're gonna end up naked with Fear just standing there laughing
     at your dangling unmentionables! - the Tick")
  ([number]
   (inc number)))

; rest parameter
; pull the rest of these arguments in a list with a given name
; '[& variable-name]' => '&' ampersand + name

(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper "!!!"))

(defn codger
  [& whippersnappers]
  (map codger-communication whippersnappers))

(codger "Billy" "Anne-Marie" "The Incredible Bulk")
; => ("Get off my lawn, Billy!!!"
      ; "Get off my lawn, Anne-Marie!!!"
      ; "Get off my lawn, The Incredible Bulk!!!")

; when you provide arguments to variable-arity functions, the arguments are treated as a list.
; You can mix rest parameters with normal parameters, but the rest parameter has to come last

(defn favorite-things
  [name & things]
  (str "Hi, " name ", here are my favorite things: "
       (clojure.string/join ", " things)))

(favorite-things "Doreen" "gum" "shoes" "kara-te")
; => "Hi, Doreen, here are my favorite things: gum, shoes, kara-te"

; Destructuring

;; Return the first element of a collection
(defn my-first
  [[first-thing]] ; Notice that first-thing is within a vector
  first-thing)

(my-first ["oven" "bike" "war-axe"])
; => "oven"

; More than one destructuring
(defn chooser
  [[first-choice second-choice & unimportant-choices]]
  (println (str "Your first choice is: " first-choice))
  (println (str "Your second choice is: " second-choice))
  (println (str "We're ignoring the rest of your choices. "
                "Here they are in case you need to cry over them: "
                (clojure.string/join ", " unimportant-choices))))

; Here, the rest parameter unimportant-choices handles any number of
; additional choices from the user after the first and second.

(chooser ["Marmalade", "Handsome Jack", "Pigpen", "Aquaman"])
; => Your first choice is: Marmalade
; => Your second choice is: Handsome Jack
; => We're ignoring the rest of your choices. Here they are in case \
;     you need to cry over them: Pigpen, Aquaman

; Destructuring maps
(defn announce-treasure-location
  [{lat :lat lng :lng}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(announce-treasure-location {:lat 28.22 :lng 81.33})

; Break the keywords our of the map
(defn announce-treasure-location2
  [{:keys [lat lng]}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(defn receive-treasure-location
  [{:keys [lat lng] :as treasure-location}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng))
  (steer-ship! treasure-location))
  ;; One would assume that this would put in new coordinates for your ship

; In general, you can think of destructuring as instructing Clojure on how to associate
; names with values in a list, map, set, or vector.

; Function Body

; The function body can contain forms of any kind. Clojure automatically returns
; the last form evaluated. This function body contains just three forms,
; and when you call the function, it spits out the last form, "joe":

(defn illustrative-function
  []
  (+ 1 304)
  30
  "joe")

(illustrative-function)
; => "joe"

; example
(defn number-comment
  [x]
  (if (> x 6)
    "Oh my gosh! What a big number!"
    "That number's OK, I guess"))

(number-comment 5)
; => "That number's OK, I guess"

(number-comment 7)
; => "Oh my gosh! What a big number!"

