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
 (container
   contents

  [:div.text-center 
   (footer
     (link "Github/Pance " "https://github.com/Pance")
     (link (str "@" (:twitter site)) (str "http://twitter.com/" (:twitter site)))
    "&nbsp; 2014")])
 ; /container

 (js ["/js/prettify.js"
      "/js/lang-clj.js"
      (:js site ())])]
; /body
