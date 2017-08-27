function Event() {
  
  let emitted, callbacks = [], executionQueue = [];
  
  this.subscribe = function() {
    if(emitted) return executionQueue.push([this.subscribe, arguments]);
    [...arguments].forEach(func => typeof func === "function" && callbacks.push(func));
  };
  
  this.unsubscribe = function(){
    if(emitted) return executionQueue.push([this.unsubscribe, arguments]);
    [...arguments].forEach(func => {
      for(let i = callbacks.length; i >= -1; i--) {
        if(callbacks[i] === func) return callbacks.splice(i, 1);
      }
    });
  };
  
  this.emit = function() {
    emitted = true;
    callbacks.forEach(callback => callback.apply(this, arguments));
    emitted = false;
    executionQueue.forEach(tuple => tuple[0].apply(null, tuple[1]));
    executionQueue = [];
  };
  
}