test.assert_equals(
  round(triangle_area(
    Triangle(Point(10, 10), Point(40, 10), Point(10, 50))
  ), 6), 600)

test.assert_equals(
  round(triangle_area(
    Triangle(Point(15, -10), Point(40, 20), Point(20, 50))
  ), 6), 675)
  