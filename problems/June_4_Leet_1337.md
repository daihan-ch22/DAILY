https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/

## 문제 

You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest

---

주어진 row의 병사 수를 배열에 담는데 까지는 성공했고, 이제 거기서 약한 순서대로 새 배열에 담아야한다.
row의 병사 수를 나타내는 배열 [2 4 1 2 5] 이 있는데 정답대로면 [2, 0, 3] 이 나와야한다.

하지만 출력은 [2, 0, 0] , [1, 1, 1] 처럼 나오고 있다. 다음 반복에서 두번째, 세번째로 가장 작은 값을 담는 부분에서 막힌듯.

일단 내일 또 고민해보기 


## 코드 

```
import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        
        int result = 0;
        int count = 0;
        
        int[] answerArr = new int[mat.length];
        int[] finalArr = new int[k];
  
        
        for(int i=0; i<mat.length; i++)  
        {
            for(int j=0; j<mat.length; j++)
            {
                      if(mat[i][j] == 1)
                      {
                          count++; 
                      }
            } 
            answerArr[i] = count; 
            count = 0;
        }
        // soldiers:    [2, 4, 1, 2, 5]
        //     row#:    [0, 1, 2, 3, 4]
            
            int minIndex = 100;
            int pivot = 0;
        
        
            for(int i=0; i<finalArr.length; i++)
            {
                for(int j=0; j<answerArr.length; j++)
                    {
                            if(minIndex >= answerArr[j] && answerArr[j] >= pivot)
                            {
                                minIndex = answerArr[j];
                                
                            }        
                    }
                finalArr[i] = minIndex;
                pivot = minIndex;
                minIndex = 100;
            }
        return finalArr;
    }
}
```
