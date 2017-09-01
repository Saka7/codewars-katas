Test.describe("Basic tests", _=>{
  Test.assertSimilar(findArray(['a', 'a', 'a', 'a', 'a'], [2, 4]), ['a', 'a'])
  Test.assertSimilar(findArray([0, 1, 5, 2, 1, 8, 9, 1, 5], [1, 4, 7]), [1, 1, 1])
  Test.assertSimilar(findArray([1, 2, 3, 4, 5], [0]), [1])
  Test.assertSimilar(findArray([1, 2, 3, 4, 5], [4,2,0]), [5,3,1])
  Test.assertSimilar(findArray([1, 2, 3, 4, 5], [2,2,2]), [3,3,3])
  Test.assertSimilar(findArray(['this', 'is', 'test'], [0, 1, 2]), ['this', 'is', 'test'])
});

Test.describe("Less basic tests", _=>{
  Test.assertSimilar(findArray([1,2,3], []), [])
  Test.assertSimilar(findArray([], [2,1,3]), [])
  Test.assertSimilar(findArray([], []), [])
});

