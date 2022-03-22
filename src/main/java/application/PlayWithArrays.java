package application;

public class PlayWithArrays {

	public static void main(String[] args) {
		System.out.println("Hello Arrays");
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
		return null;
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
		return 1.0;
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
		return 0;
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
		return null;
	}

}
