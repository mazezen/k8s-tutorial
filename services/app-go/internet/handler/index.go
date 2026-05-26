package handler

import (
	"encoding/json"
	"net/http"
)

func Index(w http.ResponseWriter, r *http.Request) {
	json.NewEncoder(w).Encode(map[string]bool{"ok": true})
}
