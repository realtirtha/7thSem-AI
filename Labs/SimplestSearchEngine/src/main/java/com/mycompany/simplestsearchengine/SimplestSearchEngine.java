package com.mycompany.simplestsearchengine;

import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Tirth
 */
public class SimplestSearchEngine {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        TermFrequency freq = new TermFrequency();
        List<String> doc1 = Arrays.asList("the","sky","is","blue","and","what");
        List<String> doc2 = Arrays.asList("the","sun","is","bright");
        List<String> doc3 = Arrays.asList("the","sun","in","the","sky","is","bright");
        List<List<String>> corpus = Arrays.asList(doc1,doc2,doc3);
        
        freq.printList(doc1);
        freq.printList(doc2);
        
        System.out.println("Document Collection: ");
        freq.printListofLists(corpus);
    }
}
