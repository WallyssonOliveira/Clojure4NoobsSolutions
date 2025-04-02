(ns http-simples.core
  (:require [org.httpkit.server :refer [run-server]])
  (:gen-class))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str "Salve He4rt Developers <3")})

(defn -main [& args]
  (run-server app {:port 3000})
  (println "Server inicializando na porta 3000"))
