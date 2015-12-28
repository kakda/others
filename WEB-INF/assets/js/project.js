
requirejs.config({
    "baseUrl": resourceUrl + "/js/lib",
    "urlArgs": { 'bust': Date.now() },
    "paths": {
      "app": "../app"
    }
});

requirejs(["app/controller/project"]);