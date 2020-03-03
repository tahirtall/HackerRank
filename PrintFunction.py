'''
Read an integer N.
Without using any string methods, try to print the following:
123...N
Note that "..." represents the values in between.

Input Format:
The first line contains an integer.

Output Format:
Output the answer as explained in the task

Sample Input:

    3

Sample Output:

    123

'''
from __future__ import print_function

def printCounter(a):

    n = 1
    counter = 0
    for n in range(0,a):
        counter+=1
        print(counter, end="")

printCounter(3)
    