/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

//Drew Oro 301337741 F2025 COMP254 SEC. 001 Lab 2 Sohaib Mohiuddin
/**
 * Code for end-of-chapter exercises on asymptotics.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class Exercises {

  /** Returns the sum of the integers in given array. */
  public static int example1(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j++)       // loop from 0 to n-1
      total += arr[j];  //O(1)
    return total;
  }
  //Big O: O(n)
  //Executing Linearly through the for-loop


  /** Returns the sum of the integers with even index in given array. */
  public static int example2(int[] arr) {
    int n = arr.length, total = 0;
    for (int j=0; j < n; j += 2)    // note the increment of 2
      total += arr[j];
    return total;
  }
//Big O: O(n)
  //Because it's going evenly, it's skipping half of the array, so it's O(1) + n/2 which is O(n)
  /** Returns the sum of the prefix sums of given array. */
  public static int example3(int[] arr) {
    int n = arr.length, total = 0; //O(1)
    for (int j=0; j < n; j++)       // O(n)
      for (int k=0; k <= j; k++)    // O(n)
        total += arr[j]; //O (1)
    return total; //O(1)
  }
//Big O: O(n^2)
  //With another loop involved, it will have to go through n twice, which is O(n) * O(n) which is O(n^2)
  /** Returns the sum of the prefix sums of given array. */
  public static int example4(int[] arr) {
    int n = arr.length, prefix = 0, total = 0; //O(1)
    for (int j=0; j < n; j++) {     // O(n)
      prefix += arr[j]; //O(1)
      total += prefix; //O(1)
    }
    return total; //O(1)
  }
  //Big O: O(n)
  //the calculations from the prefix and to the total, don't apply with big O

  /** Returns the number of times second array stores sum of prefix sums from first. */
  public static int example5(int[] first, int[] second) { // assume equal-length arrays
    int n = first.length, count = 0; //O(1)
    for (int i=0; i < n; i++) {     //0(n)
      int total = 0;
      for (int j=0; j < n; j++)     // 0(n)
        for (int k=0; k <= j; k++)  // O(n)
          total += first[k]; //O(1)
      if (second[i] == total) count++; //O(1)
    }
    return count; //O(1)
  }
  //Big O: O(n^3)
  //With the three for loops, it makes the processing longer with 3 arrays, thus making its complexity very poor.
}
