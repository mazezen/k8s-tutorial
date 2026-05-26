from flask import Flask, jsonify

app = Flask(__name__)

@app.route('/api')
def index():
    ''' app python api `/api` '''

    return jsonify(ok=True)

@app.route('/api/hello')
def hello():
    ''' app python api `/api/hello` '''

    return jsonify(ok="hello app python")

@app.route('/api/health')
def health():
    ''' app python api `/api/health` '''

    return jsonify(ok=1)


if __name__ == "__main__":
    print("app python server listening on 0.0.0.0:8898")
    app.run(host="0.0.0.0", port=8898, debug=False)
