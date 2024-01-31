package L27;

import java.util.*;
public class Trie {

    private class Node {
        char ch;
        boolean eow;
        HashMap<Character, Node> table;

        public Node(char ch) {
            this.ch = ch;
            this.eow = eow;
            this.table = new HashMap<>();
        }
    }

    private Node root;

    public Trie() {
        this.root = new Node(' ');
    }

    public void addWord(String word){

        addWord(root, word);
    }

    private void addWord(Node parent, String word) {

        if(word.length() == 0) {
            if(!parent.eow) {
                parent.eow = true;
            }
            return;
        }

        char ch = word.charAt(0); //v
        String row = word.substring(1); //""

        Node child = parent.table.get(ch);
        if(child == null) {
            child = new Node(ch);
            parent.table.put(ch, child);
        }

        addWord(child, row); //v , ""

    }

    public boolean searchWord(String word) {

        return searchWord(root, word);

    }

    private boolean searchWord(Node parent, String word) {
        if(word.length() == 0) {
            return parent.eow;
        }

        char ch = word.charAt(0);
        String row = word.substring(1);

        Node child = parent.table.get(ch);

        if(child == null) {
            return false;
        }else{
            return searchWord(child, row);
        }
    }

    //homework -> delete function

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.addWord("apple");
        trie.addWord("app");
        trie.addWord("apricot");

        System.out.println(trie.searchWord("app"));    // Output: true
        System.out.println(trie.searchWord("appl"));   // Output: false
        System.out.println(trie.searchWord("apricot"));
        System.out.println(trie.searchWord("apricota"));// Output: true
    }

}
