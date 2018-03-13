package com.rodrigopeleias.lists

import com.rodrigopeleias.numbers.numbers

def nums = [1,2,3,4,5,6,7,8,4,5,3,6,8,9]
println nums
println nums.class.name

List eNums = [1,2,3,4,5,6,7,8,4,5,3,6,8,9] as LinkedList
println eNums
println eNums.class.name

// add | remove | get | clear

// add
nums.push(99)
nums.putAt(0,77)
// or
nums[1] = 78 // bracket notation

println nums

// nums + another list - overloading
println nums + [3,4,6]

// left shift operator in lists
nums << 66
println nums

// remove
nums.pop() // remove the last element of list
nums.removeAt(3)
def newList = nums - 2
println nums
println newList

println nums.getAt(0..3)

// list clear
//nums = []
//println nums

for (x in nums) {
    println x
}

// flatten
nums << [3,4,5]
nums << [1,2]

println nums
println nums.flatten() // lists unions
println nums.unique()

def setNumbers = [1,2,3,4,5,6,7,8,9,1,2,4,5,6,7] as Set
println setNumbers
println numbers.class.name