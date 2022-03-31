package main

import (
	"fmt"
	"time"
	"math/rand"
)
var n int
n := 1000


func bubble_sort(inputlist [] int){

	swapped := true
	
	for swapped{
		swapped = false

		for i:=1; i<n; i++{
			if inputlist[i-1]> inputlist[i]{
				inputlist[i-1], inputlist[i] = inputlist[i], inputlist[i-1]
				swapped = true
			}
		}
	}
	fmt.Println(inputlist)

}


func main(){
	var mylist [n]int

	for{
		for i:=0; i < n; i++{
			inputlist = append(inputlist, rand.Intn(100))
		}

		start:= time.Now()
		bubble_sort(inputlist)
		duration := time.Since(start)
	
		fmt.Println(duration)
	}
}