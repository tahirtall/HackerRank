'''
Task:
Read an integer N. For all non-negative integers i < N, print i^2. See the sample for details.

Constrains:

1 <= N <= 20

Sample Input:

    5

Sample Output:

    0
    1
    4
    9
    16

'''

if __name__=='__main__':
    #N = (int(input()))
    N = 5

for i in range(0,N):
    i = i*i
    print(i)
