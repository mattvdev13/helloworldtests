package main

import (
	"fmt"
	"time"
	"math/rand"
)


func bubble_sort(inputlist [] int){

	swapped := true
	
	for swapped{
		swapped = false

		for i:=1; i<1000; i++{
			if inputlist[i-1]> inputlist[i]{
				inputlist[i-1], inputlist[i] = inputlist[i], inputlist[i-1]
				swapped = true
			}
		}
	}
	fmt.Println(inputlist)

}


func main(){
	var inputlist []int

	for{
		rand.Seed(time.Now().UnixNano())
		for i:=0; i < 1000; i++{
			inputlist = append(inputlist, rand.Intn(1000))
		}

		start:= time.Now()
		bubble_sort(inputlist)
		duration := time.Since(start)
	
		fmt.Println(duration)
	}
}
