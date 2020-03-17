#!/bin/python3

import math
import os
import random
import re
import sys

def solve():
	mealcost = float(input("Enter mealcost: "))
	tipPercent = int(input("Tip Percent: "))
	taxPercent = int(input("Tax Percent: "))

        tip = mealcost * (float(tipPercent)/float(100))
	tax = mealcost * (float(taxPercent)/float(100))
	result = mealcost + tip + tax
        print(int(result))


solve()
