/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Node {
    int info;
    Node next,pre;

    public Node() {
    }

    public Node(int info, Node next, Node pre) {
        this.info = info;
        this.next = next;
        this.pre = pre;
    }

    public Node(int info) {
        this.info = info;
        this.next = null;
        this.pre = null;
    }
    
    
}
