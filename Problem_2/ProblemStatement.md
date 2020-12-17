## Virat posted a puzzle. A matrix N x M containing integers is given. Isosceles triangles can be composed from elements in matrix by selecting elements in each row with formula (2 x row_number – 1). Please note, any row except last row can be labelled as row 1 (and subsequent rows 2, 3 etc.) for purpose of composing triangle.
To make it clear, here is an example. Suppose 3 x 5 matrix contains integers as follows:
```sh
4   5   9   6   7
2   1   9   9   4
3   4   4   5   7
``` 
7 isosceles triangles can be formed as explained below.
### Explanation:
Count of valid triangles having r rows = (N-r+1)(M-2r+2), in matrix with N rows, M columns and r is in range 2 ≤ r ≤ M 
Count of triangles formed with 2 rows = (3 – 2 + 1)(5 – 2x2 + 2)= 2 x 3 = 6
```sh
    5               9               6
2   1   9       1   9   9       9   9   4

    1               9               9
3   4   4       4   4   5       4   5   7
```  
Count of triangles having 3 rows = (3 – 3 + 1)(5 – 2x3 + 2) = 1 x 1 = 1
```sh
        9
    1   9   9
3   4   4   5   7   
```   
Finally, return weight of largest triangle among all possible valid triangles (weight: integer sum of all elements in a valid triangle).
From the example above:
Weight of 1st triangle = 5 + 2 + 1 + 9 = 17
Weight of 2nd triangle = 9 + 1 + 9 + 9 = 28
Weight of 3rd triangle = 6 + 9 + 9 + 4 = 28
Weight of 4th triangle = 1 + 3 + 4 + 4 = 12
Weight of 5th triangle = 9 + 4 + 4 + 5 = 22
Weight of 6th triangle = 9 + 4 + 5 + 7 = 25
Weight of 7th triangle = 9 + 1 + 9 + 9 + 3 + 4 + 4 + 5 + 7 = 51
 
So, 7th triangle has largest weight = 51, which is the correct answer to return.
 
Write a function:
int solution (int Matrix[N][M], int N, int M) that accepts three parameters, a two-dimensional matrix N x M (rows N x columns M) containing integers and return value of triangle with largest weight of all possible triangles.
If no valid triangle is possible from given matrix, then return value -1.

### Assume that:
N and M are integers in the range [1...10000]
Matrix [N][M] contains integer elements in the range [0 ... 1,00,000]
