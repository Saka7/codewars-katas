class Route {
  constructor(url, method, func) {
    this.url = url;
    this.method = method;
    this.func = func;
  }
}

class Router {

  constructor() {
    this._routes = [];
  }
  
  bind(url, method, func) {
    const matchedRoute = this.findRoute(url, method);
    
    if(matchedRoute) {
      matchedRoute.func = func;
    } else {
      this._routes.push(new Route(url, method, func));
    }
  }
  
  runRequest(url, method) {
    const matchedRoute = this.findRoute(url, method);
    
    if(matchedRoute) {
      return matchedRoute.func();
    } else {
      return 'Error 404: Not Found';
    }
  }
  
  findRoute(url, method) {
    return this._routes.find(route => {
      return new RegExp(route.url, "gmi").test(url) &&
        !(method && !new RegExp(route.method, "gmi").test(method));
    });
  }

}