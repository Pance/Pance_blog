;; Define template options here
; @layout  default
; @title   home

;; Your own function in template
(defn page-header [[fs & rs]]
  [:div {:class "page-header"}
   [:h1 [:span fs] rs]])

; Template is compiled with hiccup
(header
  (:title site)
    [:p.text-center "Hello, I'm Peter Barnett"]
    [:p.text-center "I am a developer[github] who believes code and design can be beautiful."]
    [:p.text-center "I work in an accelerated development program as a software developer at HEB Grocery Company[link]."]
    [:p.text-center
      (link "github.com/Pance" "https://github.com/Pance")
      "  "
      "PBarnett888@gmail.com"
      "  "
      (link "soundcloud.com/DJPance" "https://soundcloud.com/djpance")]
    [:p.text-center "I am a Texan, hacker, gamer and a bedroom DJ. I am interested in the web, personal data tracking, automation, people, cars, fitness and electronic dance music."]
    [:p.text-center "I'm currently building a todo-list web app using Clojure called todo-repl[link]."]

	[:br]
  )

;; Sample posts
(page-header "Posts")
(post-list)
(prev-next-page-link)

;; Sample post tags
(page-header "Tags")
(tag-list)

