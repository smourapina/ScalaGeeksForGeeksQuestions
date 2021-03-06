package com.tree.binarytree.test

import com.tree.binarytree.BinaryTree._
import com.tree.binarytree.BinaryTree
import com.tree.binarytree.BuildTreeFromPostAndInOrder.buildTree
import com.tree.binarytree.PreOrderTraversal.preOrderTraversalRecursive

object BuildTreeFromInAndPostOrderTest {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val in1 = Array(4, 8, 2, 5, 1, 6, 3, 7)         //> in1  : Array#909[Int#1107] = Array(4, 8, 2, 5, 1, 6, 3, 7)
  val post1 = Array(8, 4, 5, 2, 6, 7, 3, 1)       //> post1  : Array#909[Int#1107] = Array(8, 4, 5, 2, 6, 7, 3, 1)
  
  val hgh:BinaryTree[Int] = buildTree(in1,post1,in1.length)
                                                  //> hgh  : com#9.tree#17797.binarytree#17799.BinaryTree#17824[Int#1107] = Node(1
                                                  //| ,Node(2,Node(4,EmptyTree,Node(8,EmptyTree,EmptyTree)),Node(5,EmptyTree,Empty
                                                  //| Tree)),Node(3,Node(6,EmptyTree,EmptyTree),Node(7,EmptyTree,EmptyTree)))
                                          
                                                  
  //preOrderTraversalRecursive(tree1)
  preOrderTraversalRecursive(hgh)
  
  
}


//																																		1
//																												2                       3
//																								    4       5	               6      7
//                                                       8
//
//
//                                     1,2,4,8,5,3,6,7
//
//
//
//
//
//
//