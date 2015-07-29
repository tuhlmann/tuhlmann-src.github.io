(ns cryogen.server
  (:require [compojure.core :refer [GET defroutes]]
            [compojure.route :as route]
            [ring.util.response :refer [redirect]]
            [cryogen-core.watcher :refer [start-watcher!]]
            [cryogen-core.plugins :refer [load-plugins]]
            [cryogen-core.compiler :refer [compile-assets-timed read-config]]
            [selmer.parser :refer [add-tag!]]))

(defn define-tags []
  (add-tag! :foo
    (fn [args context-map]
      (str "foo " (first args)))))

(defn init []
  (load-plugins)
  (define-tags)
  (compile-assets-timed)
  (let [ignored-files (-> (read-config) :ignored-files)]
    (start-watcher! "resources/templates" ignored-files compile-assets-timed)))

(defroutes handler
  (GET "/" [] (redirect (str (:blog-prefix (read-config)) "/index.html")))
  (route/resources "/")
  (route/not-found "Page not found"))
