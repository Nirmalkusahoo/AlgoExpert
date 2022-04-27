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
