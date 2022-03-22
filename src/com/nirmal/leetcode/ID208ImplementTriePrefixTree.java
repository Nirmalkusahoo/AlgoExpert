package com.nirmal.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ID208ImplementTriePrefixTree {
    public static class TrieNode{
        Map<Character,TrieNode> children= new HashMap();
    }

    TrieNode root=new TrieNode();
    public void Trie() {

    }


    public void insert(String word) {
        for(int i=0;i<word.length();i++){
            insert(i,word);
        }
    }

    public void insert(int index,String word){
        TrieNode node= root;
        for(int j=index;j<word.length();j++){
            char letter=word.charAt(j);
            if(!node.children.containsKey(letter)){
                TrieNode newNode = new TrieNode();
                node.children.put(letter,newNode);
            }
            node= node.children.get(letter);
        }
        node.children.put('*',null);
    }
    public boolean search(String word) {
        TrieNode node=root;

        for(int i=0;i<word.length();i++){
            char letter=word.charAt(i);
            if(!node.children.containsKey(letter)){
                return false;
            }
            node=node.children.get(letter);
        }
        return node.children.containsKey('*');
    }

    public boolean startsWith(String prefix) {
        TrieNode node=root;

        for(int i=0;i<prefix.length();i++){
            char letter=prefix.charAt(i);
            if(!node.children.containsKey(letter)){
                return false;
            }
            node=node.children.get(letter);
        }
        return node !=null ? true :false;
    }
}
