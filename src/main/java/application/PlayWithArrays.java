package application;

import java.util.Arrays;

public class PlayWithArrays {

	public static void main(String[] args) {
		System.out.println("Hello Arrays");

		int[] nums = { 4, 6, 8, 10 };
		int target = 5;

		System.out.println(Arrays.toString(twoSum(nums, target)));

		int[] nums1 = { 1, 3, 5, 7 };
		int[] nums2 = { 2, 4, 6, 8 };
		System.out.println(findMedianSortedArrays(nums1, nums2));

		int[] prices = { 5, 2, 2, 7, 1 };
		System.out.println(maxProfit(prices));

		System.out.println(Arrays.toString(getPrimeNumbers(nums)));
	}

	/**
	 * 
	 * TODO: Two Sum
	 * 
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because
	 * nums[0] + nums[1] == 9, we return [0, 1].
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [3,3], target = 6 Output: [0,1]
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [3,2,4], target = 6 Output: [1,2]
	 * 
	 * @param nums
	 * @param target
	 * @return indices of the two numbers such that they add up to target.
	 */
	public static int[] twoSum(int[] nums, int target) {
		// initialise return array for exactly 2 numbers within an array (nums) that add
		// up to target
		int[] returnArray = new int[2];
		// initialise counter for current return array value
		int n = 0;

		// check every item in the array
		for (int i = 0; i < nums.length; i++) {
			if (target - nums[i] >= 0) { // if target-item < 0
				returnArray[n] = i; // write current item placement to return array
				target = target - nums[i]; // override target with target- current item (only happens if result is >= 0)
				n++; // add 1 to return array value counter
				if (n > 1) { // if array counter reaches the limit (both return array values have been
								// written to) -> exit loop
					break;
				}
			}
		}
		return returnArray;
	}

	/**
	 * TODO: Median of Two Sorted Arrays
	 * 
	 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
	 * the median of the two sorted arrays.
	 * 
	 * Example 1:
	 * 
	 * Input: nums1 = [1,3], nums2 = [2] Output: 2.00000 Explanation: merged array =
	 * [1,2,3] and median is 2.
	 * 
	 * Example 2:
	 * 
	 * Input: nums1 = [1,2], nums2 = [3,4] Output: 2.50000 Explanation: merged array
	 * = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
	 * 
	 * @param nums1
	 * @param nums2
	 * @return the median of two sorted arrays.
	 */
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		// merge arrays into one array
		int[] merged = new int[nums1.length + nums2.length];

		for (int i = 0; i < merged.length; i++) {
			if (i < nums1.length) {
				merged[i] = nums1[i];
			} else {
				merged[i] = nums2[i - nums1.length];
			}
		}

		// sort merged array
		Arrays.sort(merged);

		// find array centre
		int centre = merged.length / 2;

		// check if array length is even
		if (merged.length % 2 == 0) { // if even, return both middle numbers
			return (merged[centre - 1] + merged[centre]) / 2.0;
		}
		// if odd, return centre item only
		return merged[centre];
	}

	/**
	 * TODO: Best Time to Buy and Sell Stock
	 * 
	 * You are given an array prices where prices[i] is the price of a given stock
	 * on the ith day.
	 * 
	 * You want to maximize your profit by choosing a single day to buy one stock
	 * and choosing a different day in the future to sell that stock.
	 * 
	 * Return the maximum profit you can achieve from this transaction. If you
	 * cannot achieve any profit, return 0.
	 * 
	 * Example 1:
	 * 
	 * Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1)
	 * and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2
	 * and selling on day 1 is not allowed because you must buy before you sell.
	 * 
	 * Example 2:
	 * 
	 * Input: prices = [7,6,4,3,1] Output: 0 Explanation: In this case, no
	 * transactions are done and the max profit = 0.
	 * 
	 * @param prices
	 * @return maximum profit, if you cannot achieve profit return 0
	 */
	public static int maxProfit(int[] prices) {
		// initializing necessary ints
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int positionMin = 0;
		int positionMax = 0;
		// find minimum and its position
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
				positionMin = i;
			}
		}
		// if the minimum is on the last day, return 0
		if (positionMin == prices.length) {
			return 0;
		}
		// find maximum and its position
		for (int i = positionMin; i < prices.length; i++) {
			if (prices[i] > max) {
				max = prices[i];
				positionMax = i;
			}
		}
		// return profit (gains - expenses)
		return prices[positionMax] - prices[positionMin];
	}

	/**
	 * TODO: Jump Game
	 * 
	 * You are given an integer array nums. You are initially positioned at the
	 * array's first index, and each element in the array represents your maximum
	 * jump length at that position.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [3,2,1,0,4] Output: false Explanation: You will always arrive
	 * at index 3 no matter what. Its maximum jump length is 0, which makes it
	 * impossible to reach the last index.
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [2,3,1,1,4] Output: true Explanation: Jump 1 step from index 0
	 * to 1, then 3 steps to the last index.
	 * 
	 * @param nums
	 * @return true if you can reach the last index, or false otherwise.
	 */
	public static boolean canJump(int[] nums) {
		return false;
	}

//	@formatter:off
	/**
	 * TODO: Candy -- caution this is a hard problem
	 * 
	 * There are n children standing in a line. Each child is assigned a rating
	 * value given in the integer array ratings.
	 * 
	 * You are giving candies to these children subjected to the following
	 * requirements:
	 * 
	 * - Each child must have at least one candy. 
	 * - Children with a higher rating get more candies than their neighbors.
	 * 
	 * Return the minimum number of candies you need to have to distribute the
	 * candies to the children.
	 * 
	 * Example 1:
	 * 
	 * Input: ratings = [1,0,2] Output: 5 Explanation: You can allocate to the
	 * first, second and third child with 2, 1, 2 candies respectively.
	 * 
	 * Example 2:
	 * 
	 * Input: ratings = [1,2,2] Output: 4 Explanation: You can allocate to the
	 * first, second and third child with 1, 2, 1 candies respectively. The third
	 * child gets 1 candy because it satisfies the above two conditions.
	 * 
	 * @param ratings
	 * @return minimum number of candies you need to have to distribute the candies
	 *         to the children.
	 */
	//	@formatter:on
	public static int candy(int[] ratings) {
		return 0;
	}

	/**
	 * TODO: Burst Balloons
	 * 
	 * You are given n balloons, indexed from 0 to n - 1. Each balloon is painted
	 * with a number on it represented by an array nums. You are asked to burst all
	 * the balloons.
	 * 
	 * If you burst the ith balloon, you will get nums[i - 1] * nums[i] * nums[i +
	 * 1] coins. If i - 1 or i + 1 goes out of bounds of the array, then treat it as
	 * if there is a balloon with a 1 painted on it.
	 * 
	 * @param nums
	 * @return the maximum coins you can collect by bursting the balloons wisely.
	 */
	public static int maxCoins(int[] nums) {
		return 0;
	}

	/**
	 * TODO: Contains Duplicates
	 * 
	 * Given an integer array nums, return true if any value appears at least twice
	 * in the array, and return false if every element is distinct.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [1,2,3,4] Output: false
	 * 
	 * @param nums
	 * @return true if any value appears at least twice in the array, and return
	 *         false if every element is distinct
	 */
	public static boolean containsDuplicate(int[] nums) {

		return false;
	}

	/**
	 * TODO: Filter prime numbers
	 * 
	 * Given an integer array nums, filter all prime number in it an save it to a
	 * new array with primes only. There should not be any free spaces int the
	 * array. If there are no prime numbers in nums return an empty array.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,10,3,77,97,35,53] Output: [2, 3, 97, 53]
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [91,92,93] Output: []
	 * 
	 * @param nums
	 * @return all prime numbers filtered from the input
	 */
	public static int[] getPrimeNumbers(int[] nums) {
		// count how many non-prime numbers
		int noPrimeCounter = 0;
		for (int i = 0; i < nums.length; i++) {
			// set every non-prime number equals 0
			for (int j = 2; j < nums[i]; j++) {
				if (nums[i] % j == 0) {
					nums[i] = 0;
					noPrimeCounter++;
					break;
				}
			}

		}
		// counter for the position of items in primesFinal
		int counter2 = 0;
		// new array with adjusted length based on prime numbers
		int[] primesFinal = new int[nums.length - noPrimeCounter];
		// pass every number above 0
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				primesFinal[counter2] = nums[i];
				counter2++;

			}
		}

		return primesFinal;
	}

}
