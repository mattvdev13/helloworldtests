import time, random

def bub_sort(inputlist):
    
    swapped = True
    while swapped:
        swapped = False
        for i in range(1,len(inputlist)):
            if inputlist[i-1] > inputlist[i]:
                inputlist[i], inputlist[i-1] = inputlist[i-1], inputlist[i]
                swapped=True
    print(inputlist)

n = 1000

while n > 0:
    inputlist = []
    sortedlist = []

    for _ in range(n):
        inputlist.append(random.randint(0,n))

    start = time.time()
    sortedlist = bub_sort(inputlist)
    end = time.time()

    print(f"{(end-start)*1000}ms")