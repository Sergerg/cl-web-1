(ns web.core
   (:require
    [ring.adapter.jetty :as jetty]
    [compojure.core :refer [GET defroutes]]

    ;; [muuntaja.core :as m]
    ;; [reitit.ring :as ring]
    ;; [reitit.coercion.spec]
    ;; [reitit.ring.coercion :as rrc]
    ;; [reitit.ring.middleware.muuntaja :as muuntaja]
    ;; [reitit.ring.middleware.parameters :as parameters]
    )
  )

(defn page-index [request]
  {:status 200
   :headers {"content-type" "text/plain"}
   :body "11111"})

(defn page-hello [request]
  {:status 200
   :headers {"content-type" "text/plain"}
   :body "Hello"})

(defn page-404 [request]
  {:status 404
   :headers {"content-type" "text/plain"}
   :body "404 - страница не найдена!"})


(defroutes app
  (GET "/" request (page-index request))
  (GET "/hello" request (page-hello request))
  (GET "/hello1" request (page-hello request))
  page-404
  )


(def server
  (jetty/run-jetty app {:port 3000, :join? false
                          ;; , :async true
                          })
  ;(aleph/start-server (aleph/wrap-ring-async-handler #'app) {:port 3000})
  ; (println "server running in port 3000")
  )

(comment
  (server)
  (.stop server)
  )

;;;;;;;;;;;;;;;
