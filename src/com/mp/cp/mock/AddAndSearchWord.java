package com.mp.cp.mock;

public class AddAndSearchWord {
    class WordDictionary {
        TrieNode root;

        /**
         * Initialize your data structure here.
         */
        public WordDictionary() {
            root = new TrieNode();
        }

        /**
         * Adds a word into the data structure.
         */
        public void addWord(String word) {
            TrieNode curr = this.root;
            for (char ch : word.toCharArray()) {
                if (curr.children[ch - 'a'] == null) {
                    curr.children[ch - 'a'] = new TrieNode();
                }
                curr = curr.children[ch - 'a'];
            }
            curr.word = word;
            curr.isEnd = true;
        }

        /**
         * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
         */
        public boolean search(String word) {
            return search(word.toCharArray(), 0, root);
        }

        private boolean search(char[] word, int i, TrieNode node) {
            if (i == word.length) {
                return node.isEnd;
            }
            if (word[i] != '.') {
                return node.children[word[i] - 'a'] != null && search(word, i + 1, node.children[word[i] - 'a']);
            } else {
                for (int index = 0; index < node.children.length; index++) {
                    if (node.children[index] != null) {
                        if (search(word, i + 1, node.children[index])) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        class TrieNode {
            String word;
            boolean isEnd;
            TrieNode[] children;

            public TrieNode() {
                this.word = null;
                this.isEnd = false;
                this.children = new TrieNode[26];
            }
        }
    }
}
