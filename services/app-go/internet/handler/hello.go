package handler

import (
	"encoding/json"
	"net/http"
)

func Hello(w http.ResponseWriter, r *http.Request) {
	json.NewEncoder(w).Encode(map[string]string{"ok": "hello app go"})
}
