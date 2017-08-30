Test.expect(csvColumns( "1,2\n3,4\n5,6", [5, 6, 7] ) === "", 'Expected: ""');
Test.expect(csvColumns( "1,2,3\n4,5,6" , [0, 1] ) === "1,2\n4,5", 'Expected: 1,2\\n4,5');