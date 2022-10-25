


![App Screenshot](https://user-images.githubusercontent.com/1555022/34961473-1c9daf82-f9f4-11e7-90f2-45715b015edf.jpg)


As per above shown illustration, following are the important points to be considered.

• LinkedList contains an link element called first.  
• Each Link carries a data field(s) and a Link Field called next.  
• Each Link is linked with its next link using its next link.  
• Last Link carries a Link as null to mark the end of the list.

__Types of Linked List__

Following are the various flavours of linked list.   
• __Simple Linked List__ − Item Navigation is forward only.  
• __Doubly Linked List__ − Items can be navigated forward and backward way.  
• __Circular Linked List__ − Last item contains link of the first element as next and and first element has link to last element as prev.

____Basic Operations____  

Following are the basic operations supported by a list.

• __Insertion__ − add an element at the beginning of the list.  
• __Deletion__ − delete an element at the beginning of the list.  
• __Display__ − displaying complete list.  
• __Search__ − search an element using given key.  
• __Delete__ − delete an element using given key.

__Insertion Operation__

Insertion is a three step process:
1. Create a new Link with provided data.
2. Point New Link to old First Link.
3. Point First Link to this New Link

![App Screenshot](https://www.tutorialspoint.com/data_structures_algorithms/images/dsa_linkedlist_insertfirst.jpg)

__Deletion Operation__  
Deletion is a two step process:
1. Get the Link pointed by First Link as Temp Link.
2. Point First Link to Temp Link's Next Link.

![App Screenshot](https://www.tutorialspoint.com/dsa_using_java/images/dsa_linkedlist_deletefirst.jpg)


