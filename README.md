# triangles

check(int a, int b, int c)

| Input | Expected | Actual |
| —---------— |:-------------😐 —---😐
| 1, 2, 2 | isosceles triangle |  |
| 2, 3, 2 | isosceles triangle |  |
| 2, 2, 7 | isosceles triangle |  |
| 2, 2, 2 | equilateral triangle |  |
| 1, 1, 1.1 | Throw exception |  |
| a, 2, 1 | Throw exception |  |
| 1, 2, 3 | scalene triangle |  |
| 2, 1, 3 | scalene triangle |  |
| 3, 2, 1 | scalene triangle |  |
| 1, 3, 2 | scalene triangle |  |
| 0, 0, 0 | NOPE!!! |  |
| -10, 1, 2 | NOPE!!! |  |
| 1, -1, 2 | NOPE!!! |  |
