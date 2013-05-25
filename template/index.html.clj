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
  (link "Jekyll" "https://github.com/mojombo/jekyll")
  " inspired static site generator in Clojure")

;; Sample posts
(page-header "Posts")
(post-list)
(prev-next-page-link)

;; Sample post tags
(page-header "Tags")
(tag-list)

