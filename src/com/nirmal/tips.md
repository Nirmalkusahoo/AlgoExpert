## All Program solutions in Brief
- [x] [99.RecoverBinarySearchTree](https://leetcode.com/problems/recover-binary-search-tree/) ➡ [Reference](https://www.youtube.com/watch?v=ZWGW7FminDM)
    * four variables prev=Integer.MIN_VALUE,first=middle=last=null
    * if adjacent node then fist and middle , if distance node then first and last
    * Do inorder ,while doing find if current is smaller than prev
    * if yes- then store in first=prev and middle=current and cont. 
    * again if current<prev then last=current
    * then at the end swap first and last OR first and middle
  

