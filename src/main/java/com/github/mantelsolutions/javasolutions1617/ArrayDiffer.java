package com.github.mantelsolutions.javasolutions1617;

/**
 * ArrayDiffer task.
 */
public class ArrayDiffer {

    /**
     * This method checks if there are string inside left array which are 2 or more characters longer than the string in rightArray
     *
     * @param leftArray  a non null Array of {@link String}.
     * @param rightArray a non null Array of {@link String}.
     * @return number of differences.
     */
    public int diffArrays(String[] leftArray, String[] rightArray) {
        int numberOfDiffs = 0;
        for (int i = 0; i < leftArray.length; i++) {
            String leftString = leftArray[i];
            String rightString = rightArray[i];
            if (leftString.length() >= rightString.length() + 2) {
                numberOfDiffs++;
            }
        }

        return numberOfDiffs;
    }
}
