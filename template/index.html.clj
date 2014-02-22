;; Define template options here
; @layout  default
; @title   Hello!

;; Your own function in template
(defn page-header [[fs & rs]]
  [:div {:class "page-header"}
   [:h1 [:span fs] rs]])

; Template is compiled with hiccup
(header
  [:div.text-center (:title site)]
    [:p.text-center "I am Peter Barnett"]
    [:p.text-center
      "I am a "
      (link "developer" "https://github.com/Pance/")
      " who believes that code and design can be beautiful."]
    [:p.text-center "I work in an accelerated development program as a software developer at "
      (link "HEB Grocery Company" "http://www.heb.com/index.jsp")]
    [:p.text-center
      (link "Github.com/Pance" "https://github.com/Pance")
      "  "
      "PBarnett888@gmail.com"
      "  "
      (link "SoundCloud.com/DJPance" "https://soundcloud.com/djpance")]
    [:p.text-center "I am a Texan, hacker, gamer and a bedroom DJ. I am interested in the web, personal data tracking, automation, people, cars, fitness and electronic dance music."]
    [:p.text-center "I'm currently building a todo-list web app using "
     (link "Clojure" "http://clojure.org/")
     " called "
     (link "todo-repl" "https://github.com/Pance/todo-repl-webapp")]

	[:br]
  [:div.text-center
    (img "../img/photon_cannon.png")])

[:div.text-center
  (page-header "Posts")
  (post-list)
  (prev-next-page-link)]

;; Sample post tags
(page-header "Tags")
(tag-list)

