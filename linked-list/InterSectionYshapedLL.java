class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
         // code here
         Node temp1 = headA;
         Node temp2 = headB;

         int countA = 0;
         int countB = 0;
         while(temp1 != null){
           countA++;
           temp1 = temp1.next;
         }

         while(temp2 != null){
           countB++;
           temp2 = temp2.next;
         }

         temp1 = headA;
         temp2 = headB;
         int diff = 0;
         if(countA>countB){
            diff = countA - countB;
            for(int i = 0; i < diff; i++ ){
              temp1 = temp1.next;
            }
            while(temp1 != null && temp2 != null){
              if(temp1.data == temp2.data)
                return temp1.data;

              else
                {
                  temp1 = temp1.next;
                  temp2 = temp2.next;
                }
            }
          return -1;
        }
          else{
            diff = countB - countA;
            for(int i = 0; i < diff; i++ ){
              temp2 = temp2.next;
            }
            while(temp1 != null && temp2 != null){
              if(temp1.data == temp2.data)
                return temp1.data;

              else{
                temp1 = temp1.next;
                temp2 = temp2.next;
              }
            }
          return -1;
          }

	}
}
