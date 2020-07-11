package com.mp.cp;

public class G_Mock_Q003_LongestAbsoluteFilePath {
    /**
     * Suppose we abstract our file system by a string in the following manner:
     * <p>
     * The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
     * <p>
     * dir
     * subdir1
     * subdir2
     * file.ext
     * The directory dir contains an empty sub-directory subdir1 and a sub-directory subdir2 containing a file file.ext.
     * <p>
     * The string "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" represents:
     * <p>
     * dir
     * subdir1
     * file1.ext
     * subsubdir1
     * subdir2
     * subsubdir2
     * file2.ext
     * The directory dir contains two sub-directories subdir1 and subdir2. subdir1 contains a file file1.ext and an empty second-level sub-directory subsubdir1. subdir2 contains a second-level sub-directory subsubdir2 containing a file file2.ext.
     * <p>
     * We are interested in finding the longest (number of characters) absolute path to a file within our file system. For example, in the second example above, the longest absolute path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the double quotes).
     * <p>
     * Given a string representing the file system in the above format, return the length of the longest absolute path to file in the abstracted file system. If there is no file in the system, return 0.
     * <p>
     * Note:
     * The name of a file contains at least a . and an extension.
     * The name of a directory or sub-directory will not contain a ..
     * Time complexity required: O(n) where n is the size of the input string.
     * <p>
     * Notice that a/aa/aaa/file1.txt is not the longest file path, if there is another path aaaaaaaaaaaaaaaaaaaaa/sth.png.
     *
     * @param input
     * @return
     */
    public int lengthLongestPath(String input) {
        if (input == null || input.length() == 0) {
            return 0;
        }
        String[] dirs = input.split("\n");
        int[] stack = new int[dirs.length + 1];
        int maxLen = 0;
        for (String dir : dirs) {
            int numOfTabs = dir.lastIndexOf("\t");
            int level = numOfTabs + 1;
            int curLevel = stack[level + 1] = stack[level] + dir.length() - level + 1;
            if (dir.contains(".")) {
                maxLen = Math.max(maxLen, curLevel - 1);
            }
        }
        return maxLen;
    }
}
