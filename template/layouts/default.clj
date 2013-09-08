; @title  default title
; @format html5

[:head
 [:meta {:charset (:charset site)}]
 [:meta {:name    "viewport"
         :content "width=device-width, initiali-scale=1.0, user-scalable=yes"}]

 [:title
  (if (= (:title site) "home")
    (:site-title site)
    (str (:site-title site) " - " (:title site)))]

 [:link {:rel   "shortcut icon"
         :href  "/favicon.ico"}]
 [:link {:href  "/atom.xml"
         :rel   "alternate"
         :title (:title site)
         :type  "application/atom+xml"}]

 (css [(:css site ())])
 #_(css {:media "only screen and (max-device-width:480px)"} (:device-css site))]
; /head

[:body
   ;navbar
 (container
  [:nav.navbar.navbar-default {:role "navigation"}
    [:div.navbar-header
      [:button.navbar-toggle {:type "button"
                              :data-toggle "collapse"
                              :data-target ".navbar-ex1-collapse"}
        [:span.sr-only "Toggle navigation"]
        [:span.icon-bar]
        [:span.icon-bar]
        [:span.icon-bar]]
      [:a.navbar-brand {:href "#"}
                       "Pance's Blog"]]
    [:div.collapse.navbar-collapse.navbar-ex1-collapse
      [:ul.nav.navbar-nav
        [:li.active
          [:a {:href "#"} "Linksomewhere"]]
        [:li
          [:a {:href "#"} "Anotherlink"]]]
      [:ul.nav.navbar-nav.navbar-right
        [:li
          [:a {:href "#"} "Linkhere"]]
        [:li
          [:a {:href "#"} "Anotherlink"]]]]
   ]
   contents

  (footer
    (link (str "@" (:twitter site)) (str "http://twitter.com/" (:twitter site)))
    "&nbsp; 2013"))
 ; /container

 (js ["/js/prettify.js"
      "/js/lang-clj.js"
      (:js site ())])]
; /body
