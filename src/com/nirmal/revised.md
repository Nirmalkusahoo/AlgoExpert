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
- [x] [Monotonic Array](https://www.algoexpert.io/questions/Monotonic%20Array)
  * With two boolean variable isIncreasingOrder=true , isInDecreasingOrder=true it can be done
  * Either arr[i]< arr[i+1] always(then isInDecreasingOrder=false;) OR arr[i]> arr[i+1] always (then
    isIncreasingOrder=false)
  * and return isIncreasingOrder || isInDecreasingOrder;

- [x] [Move Element To End](https://www.algoexpert.io/questions/Move%20Element%20To%20End)
  * Can be done with two pointer L ,R while(L<R);
  * in nested while(L<R && array.get(R) == elementToBeMoved) R--;
  * then if(array.get(L) == toMove) swap (L,R) and L++;

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

- [x] [Minimum Area Rectangle](https://www.algoexpert.io/questions/Minimum%20Area%20Rectangle)
  * One of the easiest solution which looks complex
  * Create a HasSet(pointSet) from int[][] points input using X,Y of coordinates. set.add(String.valueOf(x) + ":" +
    String.valueOf(y))[convert method]
  * run two for loop and get int p1x = points[firstIdx][0]; int p1y = points[firstIdx][1]; int p2x =
    points[secondIdx][0]; int p2y = points[secondIdx][1];
  * check any coordinates shouldn't be in same axis . boolean isPointMatches = p1x == p2x || p1y == p2y; if (
    isPointMatches) { continue;}
  * Then find opposite/diagonal points
  * boolean isOppositeToP1Exist = pointSet.contains(convert(p1x, p2y)); boolean isOppositeToP2Exist =
    pointSet.contains(convert(p2x, p1y));
  * if(isOppositeToP1Exist && isOppositeToP2Exist) then find the area=Math.abs(p1x - p2x)* Math.abs(p1y - p2y); and
    store minArea

- [x] [1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree](https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/)
  ➡ [Reference](https://www.youtube.com/watch?v=Zi9btldKyTM)
  * The problem is doing tree traversal and finding matching node.
  * Do a InOrder traversal and also check if targetNode==original then store it in resultNode.
  * And at the end return resultNode

- [x] [Longest Range](https://www.algoexpert.io/questions/Largest%20Range)
  * Create a map and store all number with boolean true map.put(num,true)
  * Iterate through num array and check if num is not visited then assign currentLength=1
  * then left=num-1 and right=num+1
  * in while loop check if left is present in map then currentLength++; map.put(left,false); left-- and do same for
    right
  * update the if currentLength> largest then update int[] bestRange={left+1 , right-1}

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

- [x] [Longest Peak](https://www.algoexpert.io/questions/Longest%20Peak)
  * i=1; while(i<arr.length-1) if(array[i - 1] < array[i] && array[i] > array[i + 1]) booelan isPeak=true;
  * if(!isPeak)= i++ ;continue
  * left=i-2; right=i+2; while(left >= 0 && array[left] < array[left + 1)   left=left-1; similarly for while( right <
    array.length && array[right - 1] < array[right])
  * int currenLength=right-left-1 and compare with maxLength and store. new i=right and after intital while loop
    return maxLength;


- [x] [694. Number of Distinct Islands](https://leetcode.com/problems/number-of-distinct-islands/)
  ➡ [Reference](https://www.youtube.com/watch?v=u617H2WwR5g&t=5s)
  * Its simple doing bfs operation on matrix node. Storing combination off all nodes indexes in s Set.
  * The trick here is StringBuilder.append(row - baseRow).append(col - baseCol); and storing StringBuilder in to Set.
  * Iterate through all nodes those are islands.
  * Do BFS on each node and store the node row and col value in StringBuilder.append(row - baseRow).append(col -
    baseCol)
  * Find the neighbour nodes and add it to queue only if they are in boundary and a LAND.

- [x] [Line Through Points](https://www.algoexpert.io/questions/Line%20Through%20Points)
  ➡ [Reference](https://www.algoexpert.io/questions/Line%20Through%20Points)
  * Run two for loop and take point1 and point2; and create map inside first for loop
  * find slope by using gcd(the greatest common divisor). then rise=slope[0], run=slope[1];
  * Now make ket using rise and run and store it in map and out side the second for loop find the currentMax
  * and store maxPointsInALine = Math.max(currentMax, maxPointsInALine);

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
