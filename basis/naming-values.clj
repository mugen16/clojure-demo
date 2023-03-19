; (def severity :mild)
; (def error-message "OH GOD! IT'S A DISASTER! WE'RE ")
; (if (= severity :mild)
;   (def error-message (str error-message "MILDLY INCONVENIENCED!"))
;   (def error-message (str error-message "DOOOOOOOMED!")))
; (println error-message)

;-----------------

(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER! WE'RE "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED!"
         "DOOOOOOOMED!")))

(error-message :mild)
; => "OH GOD! IT'S A DISASTER! WE'RE MILDLY INCONVENIENCED!"
