/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taba.bubblesort;

import java.util.ArrayList;

/**end of year taba for bubble sort question 4
 *04/05/21
 * @author John RIngrose x19112688
 */
public class MyArrayList<ElemType> extends ArrayList<ElemType> {
    
    public void swap(int position1, int position2){// for swapping
        ElemType obj1 = get(position1);//get the element and hold it
        ElemType obj2 = get(position2);
        
        remove(position1);
        add(position1,obj2);
        remove(position2);
        add(position2, obj1);
    }
    public void bubbleSort(){//creating the method bubblesort
        Comparable elementAtJ;
        Comparable elementAtJplus;
        
        //Returns a negative integer, zero or positive int as this obkject is less than, equal to, or greater than the sepcified object
        
    
        
        for(int i = 0; i<size();i++){
            for(int j=0; j < size()-1-i;j++){  //-1 and -i added as don't want to compare what is already sorted
                elementAtJ = (Comparable)get(j);
                elementAtJplus =(Comparable)get(j+1);
                
                if(elementAtJ.compareTo(elementAtJplus) <0 ){
                    //swap them
                    swap(j, j+1);//this method is called with 2 indexes
                }
            }
        }
    }
}