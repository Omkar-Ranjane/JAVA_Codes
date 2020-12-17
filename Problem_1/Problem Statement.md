## Write a program to find matching groom for a given bride. You have been given an array of grooms by personality-type-number (integer array A), personality-type-number of a bride (integer B), 1st round shortlist count (integer X), 2nd round shortlist count (integer Y). Write a program to find the matched groom's personality-type-number.
#### Input
```sh 
10
5 10 20 2 4 5 1 9 50 8
6
5
3
```
where
•	First line denotes number of grooms (integer N)
•	Second line contains list of grooms denoted by personality-type-number (integer array A)
•	Third line denotes a bride's personality-type-number (integer B)
•	Fourth line contains 1st round shortlist count (integer X)
•	Fifth line contains 2nd round shortlist count (integer Y)
#### Output
```sh
9
```
## Selection process
Selection of groom by personality-type-number is a 3-round elimination process.
Round 1: Find X grooms by personality-type-number out of array A closest matching to B. 
e.g.
    Bride’s personality-type-number B = 6
    Array of grooms of personality-type-number A = [5, 10, 20, 2, 4, 5, 1, 9, 50, 8]
    1st round shortlist count X = 5
 
Here 5 grooms closest to bride are 0th (5), 4th (4), 5th (5), 7th (9) and 9th (8). These grooms are shortlisted for 2nd round.
Note: If matched number of candidates is more than shortlist value X, return -1.
 
Round 2: Find Y grooms out of shortlisted candidates ranked by quantity of 1 in their binary representation of personality-type-number. 
e.g.    
    Array after round 1 = [5, 4, 5, 9, 8]
    2nd level shortlist count Y = 3
    
    Binary codes of the array is:
    [0101, 0100, 0101, 1001, 1000]
    
The 3 shortlisted grooms are 0th (5), 2nd (5) and 3rd (9). These grooms denoted by their personality-type-number are shortlisted for 3rd round.
Note: If matched number of candidates exceeds shortlist value Y, return -2.
 
Round 3: Find the groom who has highest GCF(Greatest Common Factor) value in common with the bride’s personality-type-number.
e.g.
    Array after round 2 = [5, 5, 9]
    Bride’s personality-type number B = 6
   
GCF of groom with personality-type number (9) and the bride’s personality-type number (6) is greater than of grooms with personality-type number (5) and the bride’s personality-type number (6)
        = GCF of (9, 6) > GCF of (5, 6)
        = 3 > 1
If only 1 groom is remaining, the function should return selected groom's personality-type value 9.
Note: If matched number of candidates is more than 1, return -3.
 
### Assumptions:
•	Personality-type-number values is in the range [1 to 100000].
•	Number of grooms who can participate is in the range 1 to 1000.
