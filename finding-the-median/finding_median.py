import math;

def find_median(nums):
    # Sort the array in ascending order
    nums.sort()

    # Return the middle value from the array
    # if the length of the array is odd
    if (len(nums) % 2 != 0):
        return nums[math.floor(len(nums) / 2)]

    # Return the average of the middle two points
    # if the length of the array is even
    mid_1 = nums[len(nums) / 2 - 1];
    mid_2 = nums[len(nums) / 2];
    return (mid_1 + mid_2) / 2;
    

result = find_median([1, 3, 2, 6, 4, 5, 8, 9])
print(result);