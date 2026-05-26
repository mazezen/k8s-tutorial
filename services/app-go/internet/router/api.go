package router

import (
	"github.com/gorilla/mux"
	"github.com/mazezen/k8s-tutorial/services/app-go/internet/handler"
)

func CreateRouter() *mux.Router {
	r := mux.NewRouter()

	r.Methods("GET").Path("/api").HandlerFunc(handler.Index)
	r.Methods("GET").Path("/api/hello").HandlerFunc(handler.Hello)
	r.Methods("GET").Path("/api/health").HandlerFunc(handler.Health)

	return r
}
