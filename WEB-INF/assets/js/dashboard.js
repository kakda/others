
requirejs.config({
    "baseUrl": resourceUrl + "/js/lib",
    "urlArgs": { 'bust': Date.now() },
    "paths": {
      "app": "../app"
    },
    "shim": {
        "bootstrap": ["jquery"]
    }
});

requirejs(["app/controller/dashboard"]);