import Foundation

func findMedian(_ nums: inout [Int]) -> Int {
    // Sort the array in ascending order
    let sortedNumbers = nums.sorted()

    // Count of numbers within the array
    let count = sortedNumbers.count

    let median: Int
    if count % 2 == 0 {
        /**
         * Return the middle value from the array
         * if the length of the array is odd
         */
        median = (sortedNumbers[count / 2] + sortedNumbers[count / 2 - 1]) / 2
    } else {
        /**
         * Return the average of the middle two points
         * if the length of the array is even
         */
        median = sortedNumbers[count / 2]
    }
    return median;
}

var numbers = [1, 3, 2, 6, 4, 5, 8, 9]
let result = findMedian(&numbers);
print(result);