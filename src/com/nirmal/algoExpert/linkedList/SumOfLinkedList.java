package com.nirmal.algoExpert.linkedList;

public class SumOfLinkedList {
    public static class LinkedList {
        private int value;
        private LinkedList next;

        public LinkedList(int value) {
            this.value = value;
        }
    }
        //Solution 2:
        public static LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
            // Write your code here.
            LinkedList head=new LinkedList(0);
            LinkedList currentNode=head;
            int carry=0;

            LinkedList nodeOne=linkedListOne;
            LinkedList nodeTwo=linkedListTwo;
            while(nodeOne !=null || nodeTwo != null || carry != 0){
                int valueOne=nodeOne !=null ? nodeOne.value :0;
                int valueTwo=nodeTwo !=null ? nodeTwo.value :0;

                int sum=valueOne + valueTwo+ carry;

                int actualValue=sum%10;

                LinkedList newNode=new LinkedList(actualValue);
                currentNode.next=newNode;
                currentNode = newNode;

                carry=sum/10;

                nodeOne= nodeOne !=null ? nodeOne.next : null;
                nodeTwo= nodeTwo !=null ? nodeTwo.next : null;
            }

            return  head.next;

        }
        // Solution1:
        /*public static LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
            // Write your code here.
            LinkedList node=linkedListOne;
            LinkedList result=null;
            LinkedList head=linkedListOne;
            int counter=1;
            int sum=0;
            int firstSum=0;
            int mod=1;
            while(node !=null){
                    sum=sum+node.value*counter;
                    counter=counter*10;
                    node=node.next;

            }
            firstSum= sum;

            node=null;
            node=linkedListTwo;
            counter=1;
            sum=0;
            while(node !=null){
                sum=sum+node.value*counter;
                counter=counter*10;
                node=node.next;
            }

            sum=sum+firstSum;

            while(mod !=0){
                mod =sum%10;
                LinkedList newNode=new LinkedList(mod);
                if(result ==null){
                    result=newNode;
                    head=newNode;
                } else {
                    result.next=newNode;
                }
                sum=sum/10;
            }
            return head;
        }*/

    public static void main(String[] args) {
        LinkedList one= new LinkedList(1);
        LinkedList three= new LinkedList(3);
        one.next=three;

        LinkedList four= new LinkedList(4);
        LinkedList onee= new LinkedList(1);
        four.next=onee;

        System.out.println(SumOfLinkedList.sumOfLinkedLists(one,four).value);
    }

}
