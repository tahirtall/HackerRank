#!/bin/python3

'''
Task:
Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird 
If n is even and greater than 20, print Not Weird
'''

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    n = 20

if n%2==1:
    print("Weird")
else:
    if n in range(2,5):
        print("Not Weird")
    if n in range(6,21):
        print("Weird")
    if n >= 21:
        print("Not Weird")