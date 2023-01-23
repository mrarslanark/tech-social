function findMedian(nums) {
  // Sort the array in ascending order
  nums.sort((a, b) => a - b);

  /**
   * Return the middle value from the array
   * if the length of the array is odd
   */
  if (nums.length % 2 !== 0) {
    return nums[Math.floor(nums.length / 2)];
  }

  /**
   * Return the average of the middle two points
   * if the length of the array is even
   */
  const mid1 = nums[nums.length / 2 - 1];
  const mid2 = nums[nums.length / 2];
  return (mid1 + mid2) / 2;
}

const result = findMedian([1, 3, 2, 6, 4, 5, 7]);
console.log(result);
