package com.example.kotlinbasics.challenges
/*
* Description and NOTES at the end of file
* */
fun main() {
    // ALL THE POSSIBILITIES
    val nodeA = SinglyLinkedListNode("A")
    val nodeB = SinglyLinkedListNode("B")
    val nodeC = SinglyLinkedListNode("C")
    val nodeQ = SinglyLinkedListNode("Q")
    val nodeR = SinglyLinkedListNode("R")
    val nodeS = SinglyLinkedListNode("S")
    val nodeW = SinglyLinkedListNode("W")
    val nodeX = SinglyLinkedListNode("X")
    val nodeY = SinglyLinkedListNode("Y")
    val nodeZ = SinglyLinkedListNode("Z")

    // ALL THE CONNECTIONS
    nodeA.next = nodeB
    nodeR.next = nodeS
    nodeB.next = nodeC
    nodeX.next = nodeC
    nodeQ.next = nodeR
    nodeY.next = nodeX
    nodeW.next = nodeZ

    // ALL THE INPUTS
    val list1 = listOf(nodeA, nodeQ, nodeW)
    val list2 = listOf(nodeA, nodeC, nodeR)
    val list3 = listOf(nodeY, nodeZ, nodeA, nodeR)
    val list4 = listOf(nodeA, nodeW)

    // COMPUTE FOR THE RESULT
    println(DoLinkedListsIntersect(list1))
    println(DoLinkedListsIntersect(list2))
    println(DoLinkedListsIntersect(list3))
    println(DoLinkedListsIntersect(list4))
}

// HOLDER FOR THE REFRENCE OF CURRENT NODE AND NEXT CONNECTION/LINK
class SinglyLinkedListNode(val value: String, var next: SinglyLinkedListNode? = null)


// COMPUTE THE COMMON NODES
fun DoLinkedListsIntersect(collection: Collection<SinglyLinkedListNode>): Boolean {
    val visitedNodes = HashSet<SinglyLinkedListNode>()
    for (list in collection) {
        var currentNode = list
        while (currentNode.next != null) {
            if (!visitedNodes.add(currentNode)) {
                return true  // THE FIRST COMMON NODE FOUND SO NO NEED TO CHECK FURTHER
            }
            currentNode = currentNode.next!!
        }
        if (!visitedNodes.add(currentNode)) {
            return true // THE FOUND AT THE END OF THE LIST
        }
    }
    return false // NO MATCHING NODES FOUND
}




/*
* The assessment will be 1 question which tests basic understanding of the area, you can choose what language they want to use – below is the Description that you will receive when opening the question for the first time.



Description

Please watch the video below before starting the test: https://youtu.be/zCezJ8QkUL4

Linked List Intersection Question You are given a collection of singly-linked lists (SLLs). Return true of any if them share a common node (or “intersect”), or false otherwise. Additional notes

·       Please don’t use recursion. Assume the SLLs might be very large in length (in the millions).

·       Stop traversing and return immediately if you detect a common node.

·       If a cycle is detected, please throw an error.

·       Aim to be as efficient as possible from a time complexity perspective.
Implement this function with this signature:
DoLinkedListsIntersect(Collection<SinglyLinkedList>) returns bool


///
Programming challenge description:
Please watch the video below before starting the test: https://youtu.be/zCezJ8QkUL4

Linked List Intersection Question You are given a collection of singly-linked lists (SLLs). Return true of any if them share a common node (or “intersect”), or false otherwise. Additional notes

Please don’t use recursion. Assume the SLLs might be very large in length (in the millions).
Stop traversing and return immediately if you detect a common node.
If a cycle is detected, please throw an error.
Aim to be as efficient as possible from a time complexity perspective.
Implement this function with this signature:
DoLinkedListsIntersect(Collection<SinglyLinkedList>) returns bool
Input:
Your program should read lines of text from the standard input in Codevue. The first lines of the input will describe the singly-linked-lists in a directed acyclic graph (DAG) format. The graph description language is a similar idea to the GraphViz graph description language, see: https://en.wikipedia.org/wiki/DOT_(graph_description_language).
Each node is described as a string token, which is a unique identifier for the node. So “a->b” means a DAG with node “a” directionally connected to node “b”. As we are describing singly-linked-lists, take it as a given that the out degree of every node is either zero or one.
After each of the edges has been described, then each subsequent line will include set of SLL starting nodes to traverse from. We advise that you draw a diagram to help you understand the example more clearly.
Note: we have added an attachment image to show this visually.

Output:
For each SLL print 'True' or 'False' based on the return value of your function

true prints True
false prints False
On throwing an error print Error Thrown!



////

test input:

A -> B
G -> B
B -> C
C -> D
D -> E
H -> J
J -> F

A, G, E
H, A


EXPECTED OUTPUT:
TRUE
FALSE

* */