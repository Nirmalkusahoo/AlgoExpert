- [x] [844. Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/)
  ➡ [Reference](https://www.youtube.com/watch?v=vgog1EuEJYQ)
    * two solution are there 1. using stack with O(M+N) space , 2.using while loop with O(1)
    * iterate over string ->toCharArray() -> if !='#' insert into stack else stack.pop()
    * at the end compare two stacks ->if equals return true;
    * In Second approach create two pointers from end of strings and check

- [x] [1046. Last Stone Weight](https://leetcode.com/problems/last-stone-weight/)
  ➡ [Reference](https://www.youtube.com/watch?v=-1jxt_DPl48)
    * its a game of max heap,add all stones maxheap(in java new PriorityQueue<>(Comparator.reverseOrder()))
    * Run a while loop till heap size>1 , fetch top two weights and if both weight are not equal then add difference to
      heap
    * if heap.isEmpty() return 0 , else return heap.remove()

- [x] [392. Is Subsequence](https://leetcode.com/problems/is-subsequence/)
  ➡ [Reference](https://www.youtube.com/watch?v=vgog1EuEJYQ)
    * Same as [Algo expert - Validate Subsequence](https://www.algoexpert.io/questions/Validate%20Subsequence)
    * in while  (sequenceIdx<sequence.size() && arrIdx < array.size()
    * if (sequence.get(seqIdx) == array.get(arrIdx)) then seqIdx++
    * arrIdx++; at the end return seqIdx==sequence.size();

- [x] [792. Number of Matching Subsequences](https://leetcode.com/problems/number-of-matching-subsequences/)
    * to params given 1. String[] words and 2. String match
    * for(String word:words) check if word.IsSubsequecne.OF(match) the count ++
    * to check word is subsequence of match for(char c:word.toCharArray) int index= match.indexOf(c);
    * if(index==-1) return false else index= index+1; and at the end return true

- [x] [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)
  ➡ [Reference](https://www.algoexpert.io/questions/Sorted%20Squared%20Array)
    * Same as [Algo expert - Sorted Squared Array](https://www.algoexpert.io/questions/Sorted%20Squared%20Array)
    * tricky parts is when array is [-9,2,4,6]. so two with pointers it can be solved. int
      smallerIdx=0,largerIdx=length-1
    * for(int i=length-1;i>=0;i--) if(Math.abs(valueAtSIndex) > valueAtLIndex) then result[i]=valueAtSIndex * valueAtSIndex ;
      smallerIdx++
    * else arr[i]=valueAtLIndex * valueAtLIndex; largerIdx--;

- [x] [99.RecoverBinarySearchTree](https://leetcode.com/problems/recover-binary-search-tree/)
  ➡ [Reference](https://www.youtube.com/watch?v=ZWGW7FminDM)
  * four variables prev=Integer.MIN_VALUE,first=middle=last=null
  * if adjacent node then fist and middle , if distance node then first and last
  * Do inorder ,while doing find if current is smaller than prev
  * if yes- then store in first=prev and middle=current and cont.
  * again if current<prev then last=current
  * then at the end swap first and last OR first and middle

- [x] [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)
  * Its basically search-> So that leeds to binary search
  * do binary search and if match found return middle
  * else at the end of while loop return L

- [x] [12. Integer to Roman](https://leetcode.com/problems/integer-to-roman/)
  ➡ [Reference](https://www.youtube.com/watch?v=f_F9ItFyiEg)
  * create num array and add all numbers respective to roman string to it(add 10 for X) in ascending order
  * Create String array and all roman strings . Note both int array and string array should be in descending order
  * iterate through num array and in while loop check if input number >= numArray[i] then add stringArray[i] to
    stringBuilder
  * and make num=num-numArray[i]

- [x] [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/)
  ➡ [Reference](https://www.youtube.com/watch?v=dlATMslQ6Uc)
  * create a map <Character,Integer> and put all roman char and respective numbers as value.
  * iterate the input strings from last char and check id number for charAt(i) < number for charAt(i+1)
  * then subtract charAt(i) number from result else add charAt(i) + result number

- [x] [1641. Count Sorted Vowel Strings](https://leetcode.com/problems/count-sorted-vowel-strings/)
  ➡ [Reference](https://www.youtube.com/watch?v=IEIeC0b02HA)
  * it is equals to levenstein distance problem.
 ```
     int[][] count = new int[n + 1][6];
        for (int i = 1; i < count.length; i++) {
            for (int j = 1; j < count[0].length; j++) {
                if (i == 1) { count[i][j] = j;
                } else { count[i][j] = count[i - 1][j] + count[i][j - 1];
                
        return count[n][5];
``` 

- [x] [92. Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/)
  ➡ [Reference](https://www.youtube.com/watch?v=GSJuwQzKSnI)
  * You have two pointer in between which you need to reverse. left and right
  * iterate(while left>1) and reach at left and then currentNode= left pointer node and prevNode=left-1 pointer node;
    left--; right--
  * in above loop right-- is required because while reversing you will require right in while loop.
  * now connectionNode=prevNode and tailNode=currentNode
  * Now do reverse linked list logic till right>0 and also do right--
  * at the end connectionNode.next=prev and tail.next=currentNode and return head
  * 
- [x] [1302. Deepest Leaves Sum](https://leetcode.com/problems/deepest-leaves-sum/)
  ➡ [Reference](https://www.youtube.com/watch?v=hM9tzzlRcnM)
  * We need the deepest leaves sum which means basically we need last level element sum.
  * Do a level order traversal using Queue and find sum of elements at each level.
  * levelSum value should be reset to 0 before eachLevel loop starts
  * return level sum which basically last level sum

- [x] [135. Candy](https://leetcode.com/problems/candy/)
  ➡ [Reference](https://www.algoexpert.io/questions/Min%20Rewards)
  * Same as [Algo expert - Min Rewards](https://www.algoexpert.io/questions/Min%20Rewards)
  * create rewards array with value 1 in all. Array.fill(rewards,1).
  * in for (int i=1;i<len-1;i++) if(arr[i]>arr[i-1]) then rewards[i]=rewards[i-1]+1
  * in second for loop need to iterate in reverse
  * for(int i=len-2;i>=0;i--) if(arr[i]>arr[i+1]) rewards[i]= Math.max(arr[i],arr[i+1]+1)
  * and next return sum of rewards array

- [x] [1470. Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
  * its game of two pointer
  * first pointer 2*i and second 2*i + 1
  ```
  for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
  ```

- [x] [Cycle in Graph](https://www.algoexpert.io/questions/Cycle%20In%20Graph)
  * Using int[] array and color code it will be solved. int WHITE = 0, GRAY = 1, BLACK = 2;
  * int[] colors = new int[numberOfNodes]; Arrays.fill(colors, WHITE);
  * Need to iterate through all nodes and if its color[node] ==WHITE
  * boolean containsCycle = traverseAndColorNodes(node, edges, colors); if (containsCycle) { return true }
  * and traverseAndColorNodes , change node color to GRAY and find neighbours
  * iterate through neighbours and while iterating if found gray then return true. If BLACK then continue
  * OtherWise,( WHITE) again call do DFS by calling traverseAndColorNodes(neighbour, edges, colors)
  * if it returns true then return true else make colors[node] = BLACK; and return false

- [x] [2016. Maximum Difference Between Increasing Elements](https://leetcode.com/problems/maximum-difference-between-increasing-elements/)
  ➡ [Reference](https://leetcode.com/problems/maximum-difference-between-increasing-elements/discuss/1486323/JavaPython-3-Time-O(n)-space-O(1)-codes-w-brief-explanation-and-a-similar-problem.)
  ```
         int min = nums[0]; int maxDiff = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) { maxDiff = Math.max(maxDiff, nums[i] - min) }
            min = Math.min(min, nums[i]);
        }
        return maxDiff == Integer.MIN_VALUE ? -1 : maxDiff;

- [x] [1290. Convert Binary Number in a Linked List to Integer](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)
  ➡ [Reference](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/discuss/629087/Detailed-explanation-Java-%3A-faster-than-100.00)
  * Its just based on a easy formula binary -> decimal
  * int sum = 0;
    while (head != null)
    sum = sum * 2;  sum = sum + head.val;  head = head.next;
    return sum;

- [x] [456. 132 Pattern](https://leetcode.com/problems/132-pattern/)
  ➡ [Reference](https://leetcode.com/problems/132-pattern/solution/)
  * create a min array by using condition min[i]= Math.min(nums[i],min[i-1])
  * Solution is based on mono stack(elements are stored in ascending order from top to bottom).
  ``` for (int j = nums.length - 1; j >= 0; j--) {
      while (!stack.isEmpty() && nums[j] > stack.peek()) {
      if (stack.peek() > min[j])  return true;
      stack.pop();
      }
      stack.push(nums[j]);

- [x] [Non-Constructible Change](https://www.algoexpert.io/questions/Non-Constructible%20Change)
  * Sort coin array. int totalChangeCreated=0
  * for(int coin:coins) if(coin>totalChangeCrated +1) then return totalChangeCreated +1
  * else totalChangeCreated=totalChangeCreated+coin;

- [x] [Minimum Passes Of Matrix](https://www.algoexpert.io/questions/Minimum%20Passes%20Of%20Matrix)
  * It is simple problem with extra variable i.e. passes and you need to return passes-1 as ans;
  * iterate over the matrix and get all positive numbers in to a queue;
  * and the while (!queue.isEmpty()) { int size = queue.size(); while (size > 0) {
  * get the individual position and get there neighbour elements .If any neighbour <0 make them positive and it to
    queue
  * and then size-- and also passes++ at then end return passes-1. because last iteration will always iterate only
    through positive integers.
  * And then check if matrix contains Negatives value then return -1 otherwise passes;


- [x] [1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree](https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/)
  ➡ [Reference](https://www.youtube.com/watch?v=Zi9btldKyTM)
  * The problem is doing tree traversal and finding matching node.
  * Do a InOrder traversal and also check if targetNode==original then store it in resultNode.
  * And at the end return resultNode


- [x] [Waterfall Streams](https://www.algoexpert.io/questions/Waterfall%20Streams)
  * Iteration of two rows will lead us to solution. rowAbove=array[0], rowAbove[source]=-1;
  ```
  for (int row = 1; row < array.length; row++) {
        double[] currentRow = array[row];
        for (int idx = 0; idx < rowAbove.length; idx++) {
              double valueAbove = rowAbove[idx]; boolean hasWater = valueAbove < 0; boolean hasBlock = currentRow[idx] == 1.0;
              if (!hasWater) { continue;}
              if (!hasBlock) { currentRow[idx] = currentRow[idx] + valueAbove;continue;}
              double splitWater = valueAbove / 2;

              int rightIdx = idx;
              while (rightIdx + 1 < rowAbove.length) {
                  rightIdx = rightIdx + 1;
                  if (rowAbove[rightIdx] == 1.0) {break;}
                  if (currentRow[rightIdx] != 1.0) { currentRow[rightIdx] = currentRow[rightIdx] + splitWater; break; } }
  
              int leftIdx = idx;
              while (leftIdx - 1 >= 0) {
                  leftIdx = leftIdx - 1;
                  if (rowAbove[leftIdx] == 1.0) { break; }
                  if (currentRow[leftIdx] != 1.0) { currentRow[leftIdx] = currentRow[leftIdx] + splitWater; break; }}
          }
          rowAbove = currentRow;
      }
          
   double[] finalValue = new double[rowAbove.length];
    for (int i = 0; i < rowAbove.length; i++) {
        double value = rowAbove[i];
        if (value == 0) { finalValue[i] = value;} 
        else { finalValue[i] = -100 * value;}}
    return finalValue;



- [x] [694. Number of Distinct Islands](https://leetcode.com/problems/number-of-distinct-islands/)
  ➡ [Reference](https://www.youtube.com/watch?v=u617H2WwR5g&t=5s)
  * Its simple doing bfs operation on matrix node. Storing combination off all nodes indexes in s Set.
  * The trick here is StringBuilder.append(row - baseRow).append(col - baseCol); and storing StringBuilder in to Set.
  * Iterate through all nodes those are islands.
  * Do BFS on each node and store the node row and col value in StringBuilder.append(row - baseRow).append(col -
    baseCol)
  * Find the neighbour nodes and add it to queue only if they are in boundary and a LAND.
  

- [x] [63. Unique Paths II](https://leetcode.com/problems/unique-paths-ii/)
  ➡ [Reference](https://www.youtube.com/watch?v=nZSXWXzn1aM)
  * Its not that complex. Basic fundamental logic is for each position find how many ways are there to reach.And at the end you
    will have value for reaching the bottom right position.
  * Find the ways to reach for first column and row values in if condition
  * and then using these values you can get other values position obstacleGrid[i][j] = obstacleGrid[i - 1][j] +
    obstacleGrid[i][j - 1];

- [x] [Permutations](https://www.algoexpert.io/questions/Permutations) [/ LeetCode - Permutations](https://leetcode.com/problems/permutations/)
  ➡ [Reference](https://www.youtube.com/watch?v=f2ic2Rsc9pU)
  ➡ [Reference](https://www.algoexpert.io/questions/Permutations)
  * Two ways present using backtracking. 1. using Has Map 2. Not using hasmap to avoid space
  ```
   public static void getPermutations(int i, int[] array, List<List<Integer>> list) {
        if (array.length - 1 == i) {
            List<Integer> finalList = new ArrayList<Integer>();
            for (int num : array) { finalList.add(num);}  list.add(finalList);
        } else {
            for (int j = i; j < array.length; j++) {
                swap(i, j, array);
                getPermutations(i + 1, array, list);
                swap(i, j, array);
            }
        }
    }

- [x] [Rectangle Mania](https://www.algoexpert.io/questions/Rectangle%20Mania)
  * Boom it is also one of the simplest algo but looks complex.
  * Store each coordinate in a Set in String format.
  * Now for(nested for loop) each coordinate check whether it has upperRight coordinate.
  * then if both upperCoordinate and rightCoordinate exist increase the count

- [x] [32. Longest Valid Parentheses](https://leetcode.com/problems/longest-valid-parentheses/)
  ➡ [Reference:1](https://www.youtube.com/watch?v=VdQuwtEd10M) [Reference:2](https://www.youtube.com/watch?v=qC5DGX0CPFA)
  * Since its parenthesis problem then yehh Stack will be coming.  stack.push(-1);
  ```
  for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') { stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) { stack.push(i);
                } else { maxLength = Math.max(maxLength, i - stack.peek()); } }
        } 

- [x] [Generate-div-tags](https://www.algoexpert.io/questions/generate-div-tags)
  * It's an easy to remember recursive solution.
  ```
  generate("", numberOfTags, numberOfTags, list);
  public static void generate(String str, int open, int close, ArrayList<String> list) {
        if (open > 0) { String newStr = str + "<div>"; generate(newStr, open - 1, close, list) }
        if (open < close) { String newStr =  str + "</div>"; generate(newStr, open, close - 1, list) }
        if (close == 0) { list.add(str) }
    }
  
- [x] [329. Longest Increasing Path in a Matrix](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/)
  ➡ [Reference](https://www.youtube.com/watch?v=WiEqhI7v2FY)
  * Its is simple matrix traversal problem. Its just that we need memorise the value to improve TC.
  * see at each node the path value =1, and if we go to next node then it will be prev path+ current path.
  * So the whole logic depends on this only. Do matrix traversal get the adjacent nodes and if adjacent nodes >
    currentNode
  * then call dfs on that node . Since a node can go in to 4 direction we need to save max among all 4 direction.

- [x] [867. Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)
  * We don't need any special algorithms to do this.
  * You just need to know what the transpose of a matrix looks like. Rows become columns and vice versa!

- [x] [Boggle Board](https://www.algoexpert.io/questions/Boggle%20Board)
  *


- [x] [160. Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/)
  * traverse first one and store in set then traverse second one.
  * if found in set then return that.

- [x] [1197. Minimum Knight Moves](https://leetcode.com/problems/minimum-knight-moves/)
  ➡ [Reference](https://www.youtube.com/watch?v=XhYVY6PQSxs)
  ➡ [Reference](https://leetcode.com/problems/minimum-knight-moves/discuss/401580/Clean-Java-BFS-solution)
  * Again same graph/matrix traversal using BFS.
  * Points to note int[][] directions {{2, 1},{2, -1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}};
  * x = Math.abs(x); y = Math.abs(y);
  * and while add neighbour nodes condition should be if (newRow >= -1 && newCol >= -1) to move from (0,0) to (1,1) we
    need to start from (-1,2) or (1,-1)
- [x] [Merge Overlapping Intervals](https://www.algoexpert.io/questions/Merge%20Overlapping%20Intervals)
  * create List<int[]> merged; int[]currentInterval=intervals[0]; merged.add(currentInterval)
  * iterate in intervals ; for(int[] nextInterval:intervals) if(currentEnd>nextStart) then currentEnd=Math.max(
    currentEnd,nextEnd)
  * else merged.add(nextInterval); currentInterval=nextInterval;

- [x] [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)
  * find odd longest (i-1,i+1) , find even longest (i-1,i) Store longest
  * Points to remember-> u need to store index int[] odd,int[] even and return new int[]{left + 1, right};
  
- [x] [266. Palindrome Permutation](https://leetcode.com/problems/palindrome-permutation/)
  * Use HasSet , then add and remove char ,at the end return set.size() <= 1.
  * if (!set.add(s.charAt(i))) { set.remove(s.charAt(i)); }

- [x] [304. Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/)
  ➡ [Reference-Actual Solution](https://www.youtube.com/watch?v=rkLDDxOcJxU)
  ➡ [Reference- concept](https://www.youtube.com/watch?v=KE8MQuwE2yA)
  * get column sum and row sum. left most will hold the sum value of square/rectangele.
  * remove the left column(dp[row2][col1 - 1]) and above row value(dp[row1 - 1][col2]) and plus (r1-1,c1-1) since its
    duplicated.
  * and return dp[row2][col2]

- [x] [1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
  ➡ [Reference](https://www.youtube.com/watch?v=M_dpZ8IS_70)
  * Concept is similar to levestein distance problem.
  * The difference is you need to find the common subsequence while traversing in the 2D array.
  * if (text1.charAt(i - 1) == text2.charAt(j - 1)) { dp[i][j] = 1 + dp[i - 1][j - 1]; } else { dp[i][j] = Math.max(
    dp[i - 1][j], dp[i][j - 1]); }

- [x] [583. Delete Operation for Two Strings](https://leetcode.com/problems/delete-operation-for-two-strings/)
  ➡ [Reference](https://www.youtube.com/watch?v=VSrsUkoG0bk)
  * Again Concept is similar to levestein distance problem.
  * The difference is you need to find the number of char you need to delete while traversing in the 2D array.
  * if (i == 0 || j == 0) => dp[i][j] = i + j; else if (word1.charAt(i - 1) == word2.charAt(j - 1)) =>  dp[i][j] =
    dp[i - 1][j - 1]; else => dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]);

- [x] [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
  ➡ [Reference](https://www.youtube.com/watch?v=C4oBXLr3zos)
  * Whenever it comes to array creation on sorted array it is wise to start from end.
  * So again it's a game of two pointer and for loop started from end index.
  * If you simply consider one element each at a time from the two arrays and insert it and decrease the respective
    pointer then it's done

- [x] [83. Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)
  * its Simple east problem , can be solver using 2nodes or single node
  * in while loop eash time currentNode.val == currentNode.next.val then  currentNode.next = currentNode.next.next;
- [x] [745. Prefix and Suffix Search](https://leetcode.com/problems/prefix-and-suffix-search/)
  ➡ [Reference](https://www.youtube.com/watch?v=3JVlE66WxW0&t=0s)
  ➡ [Reference](https://www.youtube.com/watch?v=X630KoSDkeQ)
  * Create all the possible strings with prefix + # + suffix and store it in Map.
  * and then check if exist return else return -1;

- [x] [346. Moving Average from Data Stream](https://leetcode.com/problems/moving-average-from-data-stream/)
  * Simple problem can be solved using Deque. store in Dqueue till the size given if crosee then remove from begining
  * and by this you can keep on finding average. Pont return (sum * 1.0) / Math.min(size, count);

- [x] [2096. Step-By-Step Directions From a Binary Tree Node to Another](https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/)
  ➡ [Reference](https://www.youtube.com/watch?v=gtsZqtdA6Lc&t=583s)
  * There were two ways 1.using Graph with BFS but gave TLE(Simple solution)
  * 2.way- using recursion

- [x] [665. Non-decreasing Array](https://leetcode.com/problems/non-decreasing-array/)
  ➡ [Reference](https://www.youtube.com/watch?v=iL7oSNc3OXA)
  * some logic you need to remember bro...

- [x] [1423. Maximum Points You Can Obtain from Cards](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/)
  ➡ [Code](https://www.youtube.com/watch?v=U0utLw_vWGM)
  ➡ [Understood from](https://www.youtube.com/watch?v=TsA4vbtfCvo)
  * Its a siliding window problem. You need to find out the total sum and the window sum.
  * Now in a for loop you need increase windowSum(- from back , +from front) and subtract from total sum
  * and save Max(ans, totalSum-windowSum)
- [x] [1268. Search Suggestions System](https://leetcode.com/problems/search-suggestions-system/)
  ➡ [Reference](https://www.youtube.com/watch?v=D4T2N0yAr20)
  * Can be done using two pointer.
  * Points :(list[L].length <= i || list[L].charAt(i) != c) , maxWindow= R-L + 1; upperBound = Math.min(maxWindow, 3)



- [x] [1642. Furthest Building You Can Reach](https://leetcode.com/problems/furthest-building-you-can-reach/)
  ➡ [Reference](https://www.youtube.com/watch?v=wAxhnUhXvHE)
  * Can be done using PriortiyQueue. PriortiyQueue.size shoule be always smaller then ladders
  * Store height difference in PriortiyQueue if slot available(pq.size() < ladders)
  * if not then check diff > pq.peek() then br = pq.remove(); pq.offer(diff);
    * if (bricks - br >= 0) { bricks = bricks - br; }
- [x] [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)
  ➡ [Reference](https://www.youtube.com/watch?v=ockS2ZKh7j8&t=316s)
  * Three solutions - 1. Sorting 2.using MinHeap 3. Quick sort
  * First Solution: Sort the array and return kth element from end
  * Crate Min Heap , Iterate the input array and store till heap.size> k , so that it will always store largest k
    numbers
  * and then return heap.poll(), so it will return the min number
  * 3: Using quick sort(not explored in details)

- [x] [1091. Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/)
  ➡ [Reference](https://www.youtube.com/watch?v=CABaqOkWbgQ)
  * It's a simple matrix traversal program using BFS where we need to find next 8 direction positions.
  * Add first node -> queue.offer(new int[]{0, 0, 1}), here third value is node/path count and make first node as
    visited by marking grid[0][0] = 1;
  * now while loop thorough queue and again in inner while loop through size.
  * Take row and col value if (r == height - 1 && c == width - 1) return path;
  * count 8 direction nodes int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};
  * Add it to queue only if if (row >= 0 && row < height && col >= 0 && col < width && grid[row][col] == 0)
  * If condition true then queue.add(new int[]{row, col, path + 1}), don't forget to decrease the path/node count.
  * And also don't forget to mark the node as visited. grid[newRow][newCol] = 1; And at the end of return -1;
- [x] [43. Multiply Strings](https://leetcode.com/problems/multiply-strings/)
  ➡ [Reference](https://www.youtube.com/watch?v=rUVg2Vewbo8)
  * Anhha need to remember the logic a bit.

```
  int[] result = new int[n + m];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                product = product + result[i + j + 1];
                result[i + j + 1] = product % 10;
                result[i + j] = result[i + j] + product / 10;
            }
        }
```

- [x] [630. Course Schedule III](https://leetcode.com/problems/course-schedule-iii/)
  ➡ [Reference](https://www.youtube.com/watch?v=ey8FxYsFAMU)
  * ITs a simple problem ,can be solved by sorting and then using priorityQueue
  * Sort the array based on last days. Create max heap which will return the course with max duration.
  * if consumed time is less than last day then insert in PQ or else peek from PQ(don't forget time-pq.poll()) and
    exchange
  * Arrays.sort(courses, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]); PriorityQueue<Integer> pq = new
    PriorityQueue<>((a, b) -> b - a);
- [x] [539. Minimum Time Difference](https://leetcode.com/problems/minimum-time-difference/)
  ➡ [Reference](https://www.youtube.com/watch?v=c5ecNf7JM1Q) [Solution from ](https://leetcode.com/problems/minimum-time-difference/discuss/100640/Verbose-Java-Solution-Bucket)
  * It's a very interesting problem. You need to rember this simple logic.
  * convert all time to boolean array times[ hr * 60 + min]=true;
  * iterate array and find first = Math.min(first, i), last = Math.max(last, i) and min = Math.min(min, i - prev);
    store prev =i always.
  * at the end return min = Math.min(min, 1440 - last + first);


- [x] [disk-stacking](https://www.algoexpert.io/questions/disk-stacking)
  * Its not that complex, but just that simple logic u need to remember.
  * Sort the array based on height. disks.sort((disk1, disk2) -> disk1[2].compareTo(disk2[2]));
  * Create height array fill with all disk initial height.
  * now iterate and store the maxHeight if (heights[i] <= heights[j] + currentDisk[2]) in height array if condition
    satisfies.
  * and also you need to store last max height index sequences[i] = j;
  * and while building sequence you need to use sequences array.

- [x] [1691. Maximum Height by Stacking Cuboids](https://leetcode.com/problems/maximum-height-by-stacking-cuboids/)
  * Some confusion is there but its similar to
    aLogExpert [disk-stacking](https://www.algoexpert.io/questions/disk-stacking)

- [x] [845. Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/)
  ➡ [Reference](https://www.algoexpert.io/questions/Longest%20Peak)
  * Same as [Algo expert - Longest Peak](https://www.algoexpert.io/questions/Longest%20Peak)

- [x] [numbers-in-pi](https://www.algoexpert.io/questions/numbers-in-pi)
  * See solution code is simple , you just need to map the recursion call and there closing conditions and retrun
    value.
  * And from the return value calculate ur logic. that's it. But still since its first time ..so bit unhappy.

- [x] [349. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/)
  * **_Yehh did it by my own_**. Can be done using two pointer and since they want unique so use Set.
  * if two pointer num matches add to set else increse the pointer for the num which is smaller

- [x] [maximize-expression](https://www.algoexpert.io/questions/maximize-expression)
  * Again a simple problem which looks complex ,but post explanation it looks awsome.
  * You just need to count the last maximum value while iterating through the array.
  * Since its a-b+c-d ,4 expression ,so you need to do in 4 for loop to find out last expression max value for 4
    different expression

- [x] [All kinds of node depths](https://www.algoexpert.io/questions/all-kinds-of-node-depths)
  * Create stack insert each node and on pull call nodeDepthRecursive() method and keep on adding returned value.
  * recursive method logic=> return depth + findDepth(root.left, depth + 1) + findDepth(root.right, depth + 1);
- [x] [Four Number Sum](https://www.algoexpert.io/questions/Four%20Number%20Sum)
  * create Map<Integer,List<Integer[]> and List<Integer[]> fourNumberSum
  * two for loop inside one for parent for loop
  ```
  for (int i = 1; i < array.length - 1; i++) {
          for (int j = i+1; j < array.length; j++) {
              int currentSum = array[i] + array[j]; int diff = targetSum - currentSum;
              if (allPairSum.containsKey(diff)) {
                  for (Integer[] pair : allPairSum.get(diff)) {
                      Integer[] fourSum = {pair[0], pair[1], array[i], array[j]}; fourSumList.add(fourSum);
          } }}
  
          for (int k = 0; k < i; k++) {
              int currentSum = array[i] + array[k]; Integer[] pair = {array[i], array[k]};
              if (!allPairSum.containsKey(currentSum)) {
                  List<Integer[]> pairGroup = new ArrayList<>(); pairGroup.add(pair); allPairSum.put(currentSum, pairGroup);
              } else  { allPairSum.get(currentSum).add(pair) };
          }
      }
- [x] [subarray-sort](https://www.algoexpert.io/questions/subarray-sort)
  * find minOutOfOrder and maxOutOfOrder number by iterating .int minOutOfOrder = Integer.MAX_VALUE; and Int.MIN for
    max
  * minOutOfOrder = Math.min(minOutOfOrder, num); maxOutOfOrder = Math.max(maxOutOfOrder, num);
  * find the index of minOutOfOrder and maxOutOfOrder

- [x] [298.Binary Tree Longest Consecutive ](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/)
  ➡ [Reference](https://leetcode.com/problems/binary-tree-longest-consecutive-sequence/solution/)
  * Use a variable length to store the current consecutive path length and pass it down the tree.
  * As we traverse, we compare the current node with its parent node to determine if it is consecutive. If not, we
    reset the length. and every step store the maxlength

- [x] [zigzag-traverse](https://www.algoexpert.io/questions/zigzag-traverse)
  * Need to remember first half of logic and then write reverse of it in next part. and while writing you can compare
    the flow with logic

```
            if (isGoingDown) {
                if (col == 0 || row == maxRow) {
                    isGoingDown = false;
                    if (row == maxRow) {
                        col++;
                    } else {
                        row++;
                    }
                } else {
                    row++;
                    col--;
                }
            }
```
