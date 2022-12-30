package com.mycompany.simplestsearchengine;

import java.util.List;

/**
 *
 * @author Tirth
 */
public class TermFrequency {
    public void printList(List<String> doc){
        for(String word: doc){
            System.out.println(word + " ");
        }
        System.out.print("\n");
    }
    
    public void printListofLists(List<List<String>> docs){
        for(List<String> doc:docs){
            for(String word: doc){
                System.out.print(word + " ");
            }
        }    
    }
}
