package handler

import (
	"encoding/json"
	"net/http"
)

func Health(w http.ResponseWriter, r *http.Request) {
	json.NewEncoder(w).Encode(map[string]int{"ok": 1})
}
