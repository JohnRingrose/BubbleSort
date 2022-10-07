/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taba.bubblesort;

/**end of year taba for bubble sort question 4 and question 5
 *04/05/21
 * @author John Ringrose x19112688
 */
public class BubbleTestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyArrayList<Integer> numbers = new MyArrayList<>();//creating the ArrayList
        //adding all the number to the list
        numbers.add(16);
        numbers.add(21);
        numbers.add(88);
        numbers.add(32);
        numbers.add(1);
        numbers.add(5);
        numbers.add(99);
        numbers.add(18);
        numbers.add(77);
        numbers.add(17);
        System.out.println("Question 5 ");
        System.out.println("Here's the list pre bubble sort " +numbers);//printing out the list before I use bubble osrt on it
        numbers.bubbleSort();//using the method bubble sort on the ArrayList
         System.out.println("Here's the list post bubble sort....hopefully " +numbers);
         
         //Question 5 measure the efficency of the implemented osrting algorithim in terms of numbers of comparisons
         
         int numToSort = 100050;
         MyArrayList<Integer> list4Test1 = new MyArrayList<>();//declaring and creating the array
         MyArrayList<Integer> list4Test2 = new MyArrayList<>();
         
         for(int i = 0; i < numToSort; i++){
            Integer oneNum = new Integer((int)Math.random()*200000);//declared oneNum and using math.random to create a random number
            list4Test1.add(oneNum);
        }
         //I am copying that over to the second arrayList
         for(int i =0; i < numToSort; i++){
             list4Test2.add(i, list4Test1.get(i));
         }
         Long startTime, endTime;
          //getting the time from the system seeign the variable startTime to the whatever the time is in miili seconds
         startTime = System.currentTimeMillis();
         
         //runnign the bubblesort alogrithim
         list4Test1.bubbleSort();
         //getting the current time again and assigning it to endTime
         endTime = System.currentTimeMillis();
         
         //subtracting the two times to get ho miuch time it took
         System.out.println("The bubble sort took: "+(startTime-endTime)+"millisecomds on "+numToSort+ " items.");
         
         //Question 6, three comparisons of the algorithm for excel file
         
         int numForTest1 = 50000;
         MyArrayList<Integer> list4Test3 = new MyArrayList<>();//declaring and creating the array
         MyArrayList<Integer> list4Test4 = new MyArrayList<>();
         
         
         
         
         
            MyArrayList<Integer> numbersTest1 = new MyArrayList<>();//creating the ArrayList
        //adding all the number to the list
        numbersTest1.add(100);
        numbersTest1.add(201);
        numbersTest1.add(488);
        numbersTest1.add(6632);
        numbersTest1.add(991);
        numbersTest1.add(526);
        numbersTest1.add(9912);
        numbersTest1.add(1845);
        numbersTest1.add(7799);
        numbersTest1.add(1711);
        
         
           for(int i = 0; i < numForTest1; i++){
            Integer oneNum1 = new Integer((int)Math.random()*200000);//declared oneNum and using math.random to create a random number
            list4Test3.add(oneNum1);
        }
         //I am copying that over to the second arrayList
         for(int i =0; i < numForTest1; i++){
             list4Test4.add(i, list4Test3.get(i));
         }
         Long startTime1, endTime1;
          //getting the time from the system seeign the variable startTime to the whatever the time is in miili seconds
         startTime1 = System.currentTimeMillis();
         
         //runnign the bubblesort alogrithim
         list4Test3.bubbleSort();
         //getting the current time again and assigning it to endTime
         endTime1 = System.currentTimeMillis();
         
         //subtracting the two times to get ho miuch time it took
         System.out.println("Question 6 results");
         System.out.println("The bubble sort test for test 1 took: "+(startTime1-endTime1)+"millisecomds on "+numForTest1+ " items.");
         
         
         int numForTest2 = 100000;
          MyArrayList<Integer> list4Test5 = new MyArrayList<>();//declaring and creating the array
         MyArrayList<Integer> list4Test6 = new MyArrayList<>();
         
           MyArrayList<Integer> numbersTest2 = new MyArrayList<>();//creating the ArrayList
        //adding all the number to the list
        numbersTest2.add(100);
        numbersTest2.add(201);
        numbersTest2.add(488);
        numbersTest2.add(6632);
        numbersTest2.add(991);
        numbersTest2.add(526);
        numbersTest2.add(9912);
        numbersTest2.add(1845);
        numbersTest2.add(7799);
        numbersTest2.add(1711);
        
        
         
           for(int i = 0; i < numForTest2; i++){
            Integer oneNum1 = new Integer((int)Math.random()*200000);//declared oneNum and using math.random to create a random number
            list4Test5.add(oneNum1);
        }
         //I am copying that over to the second arrayList
         for(int i =0; i < numForTest2; i++){
             list4Test6.add(i, list4Test5.get(i));
         }
         Long startTime2, endTime2;
          //getting the time from the system seeign the variable startTime to the whatever the time is in miili seconds
         startTime2 = System.currentTimeMillis();
         
         //runnign the bubblesort alogrithim
         list4Test5.bubbleSort();
         //getting the current time again and assigning it to endTime
         endTime2 = System.currentTimeMillis();
         
         //subtracting the two times to get ho miuch time it took
         System.out.println("The bubble sort test for test 2 took: "+(startTime2-endTime2)+"millisecomds on "+numForTest2+ " items.");
         
         int numForTest3 = 150000;
          MyArrayList<Integer> list4Test7 = new MyArrayList<>();//declaring and creating the array
         MyArrayList<Integer> list4Test8 = new MyArrayList<>();
         
           MyArrayList<Integer> numbersTest3 = new MyArrayList<>();//creating the ArrayList
        //adding all the number to the list
        numbersTest3.add(100);
        numbersTest3.add(201);
        numbersTest3.add(488);
        numbersTest3.add(6632);
        numbersTest3.add(991);
        numbersTest3.add(526);
        numbersTest3.add(9912);
        numbersTest3.add(1845);
        numbersTest3.add(7799);
        numbersTest3.add(1711);
        
        
         
           for(int i = 0; i < numForTest3; i++){
            Integer oneNum1 = new Integer((int)Math.random()*200000);//declared oneNum and using math.random to create a random number
            list4Test7.add(oneNum1);
        }
         //I am copying that over to the second arrayList
         for(int i =0; i < numForTest3; i++){
             list4Test8.add(i, list4Test7.get(i));
         }
         Long startTime3, endTime3;
          //getting the time from the system seeign the variable startTime to the whatever the time is in miili seconds
         startTime3 = System.currentTimeMillis();
         
         //runnign the bubblesort alogrithim
         list4Test7.bubbleSort();
         //getting the current time again and assigning it to endTime
         endTime3 = System.currentTimeMillis();
         
         //subtracting the two times to get ho miuch time it took
         System.out.println("The bubble sort test for test 2 took: "+(startTime3-endTime3)+"millisecomds on "+numForTest3+ " items.");
    }
}