from operator import itemgetter

'''
Task:
    Given the names and grades for each student in a Physics class of N students, 
    store them in a nested list and print the name(s) of any student(s) 
    having the second lowest grade.
    Note: If there are multiple students with the same grade, order their names 
    alphabetically and print each name on a new line.
Input format:
    The first line contains an integer, N, the number of students.
    The 2N subsequent lines describe each student over 2 lines; the 
    first line contains a student's name, and the second line contains 
    their grade.
Constraints:
    There will always be one or more students having the second lowest grade.
Output Format:
    2 <= N <= 5
    Print the name(s) of any student(s) having the second lowest grade in Physics; 
    if there are multiple students, order their names alphabetically and print each one on a new line.
Sample Input:
    5
    Harry
    37.21
    Berry
    37.21
    Tina
    37.2
    Akriti
    41
    Harsh
    39
Sample Output:
    Berry
    Harry
'''


def nestedLists():
    arr = []
    # will allow multiple input entry
    for _ in range(int(input())):
        name = input()
        score = float(input())
        arr.append([name,score])

    arr.sort(key=itemgetter(1))
    

nestedLists()