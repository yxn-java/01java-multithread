package leetcode;

import dataStructure.ListNode;

import java.util.Scanner;

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null,tail=null;
        int carry=0;
        while(l1!=null||l2!=null){
            int num1=l1!=null?l1.val:0;
            int num2=l2!=null?l2.val:0;
            int sum=num1+num2+carry;
            if(head==null){
                head=tail=new ListNode(sum%10);
            }
            else{
                tail.next=new ListNode(sum%10);
                tail=tail.next;
            }
            carry=sum/10;

            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }

            if(carry>0){
                tail.next=new ListNode(carry);
            }

        }
        return head;
    }
    public static void main(String[] args) {
        Solution2 sol=new Solution2();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ListNode node1=new ListNode(2);
        node1.add(3);
        node1.add(4);
        node1.print();
        ListNode node2=new ListNode(5);
        node2.add(6);
        node2.add(7);
        node2.print();
        ListNode result=sol.addTwoNumbers(node1,node2);
        result.print();
    }
}
