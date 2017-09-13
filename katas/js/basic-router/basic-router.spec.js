Test.describe('Should handle GET routes', function()
{
  var router = new Router;

  router.bind('/hello', 'GET', function() { return 'hello world'; });
  router.bind('/login', 'GET', function() { return 'Please log-in.'; });
  
  Test.assertEquals(router.runRequest('/hello', 'GET'), 'hello world');
  Test.assertEquals(router.runRequest('/login', 'GET'), 'Please log-in.');
});

Test.describe('Should handle POST routes', function()
{
  var router = new Router;

  router.bind('/vote', 'POST', function() { return 'Voted.'; });
  router.bind('/comment', 'POST', function() { return 'Comment sent.'; });
  
  Test.assertEquals(router.runRequest('/vote', 'POST'), 'Voted.');
  Test.assertEquals(router.runRequest('/comment', 'POST'), 'Comment sent.');
});

Test.describe('Should handle mixed routes.', function()
{
  var router = new Router;
  
  router.bind('/login', 'GET', function() { return 'Please log-in.'; });
  router.bind('/login', 'POST', function() { return 'Logging-in.'; });
  
  Test.assertEquals(router.runRequest('/login', 'GET'), 'Please log-in.');
  Test.assertEquals(router.runRequest('/login', 'POST'), 'Logging-in.');
});

Test.describe('Should return 404 for non-existing routes.', function()
{
  var router = new Router;
  
  Test.assertEquals(router.runRequest('/this-url-does-not-exist', 'GET'), 'Error 404: Not Found');
});

Test.describe('Should modify existing routes', function()
{
  var router = new Router;
  
  router.bind('/page', 'GET', function() { return 'First binding.'; });
  router.bind('/page', 'GET', function() { return 'Modified binding.'; });
  
  Test.assertEquals(router.runRequest('/page', 'GET'), 'Modified binding.');
});