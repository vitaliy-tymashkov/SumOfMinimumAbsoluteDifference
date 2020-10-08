#Sum of minimum absolute difference of Array of ints
 * Program to find the sum of minimum absolute difference of the array is discussed here.
 * An array of distinct elements is given as input and the sum of minimum absolute difference
 * of each array element has to be found.
 * The minimum absolute difference is calculated using the formula,
 * Minimum Absolute Difference (a) = min(abs(a - arr[j])) ;
 * where 1 <= j <= n and j != i, abs is the absolute value.

##Naive approach:
 Using two loops. Pick an element of the array using outer loop and calculate its absolute 
 difference with rest of the array elements using inner loop.
 Find the minimum absolute value and add it to the sum. 
 <p>Time Complexity O(n2).
 
##Efficient Approach:
 The following steps are:
 * Sort the array of size n.
 * For the 1st element of array its min absolute difference is calculated 
 using the 2nd array element.
 * For the last array element its min absolute difference is calculated 
 using the 2nd last array element.
 * For the rest of the array elements, 1 <= i <= n-2, 
 minimum absolute difference for an element at index i is calculated as:
 minAbsDiff = min( abs(arr[i] – arr[i-1]), abs(ar[i] – arr[i+1]) ).
 <p>Time Complexity: O(n logn)
 
 <p>
 Note: to be analysed
 <p>
 For example, consider the following array given as input : arr = {1, 3, 9, 3, 6}
 <p>
 The optimal solution is to choose x = 3, which produces the sum
 
  * |1 - 3| + |3 - 3| + |9 - 3| + |3 - 3| + |6 - 3| = 2 + 0 + 6 + 0 + 3 = 11
  * Output : 11