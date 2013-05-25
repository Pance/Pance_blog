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
	"The blog of Peter Barnett. "
	[:br]
  (link "github.com/Pance" "https://github.com/Pance")
  )

;; Sample posts
(page-header "Posts")
(post-list)
(prev-next-page-link)

;; Sample post tags
(page-header "Tags")
(tag-list)

