/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvlTree;

/**
 *
 * @author Usuario
 */
public class Node {
    
        int key;
        Node left;
        Node right;
        int height;

        public Node(){
        }
        
        
        public Node(int key){
            this.key = key;
            this.height = 0;
        }
    
    }
