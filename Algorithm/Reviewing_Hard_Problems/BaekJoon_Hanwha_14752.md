https://www.acmicpc.net/problem/14652

1. [문제](#문제)
2. [코드](#코드)
3. [해결 한 방법](#해결-한-방법)
5. [수정 후 코드](#수정-후-코드)

## 문제

가로 길이가 M인 N≤M 크기의 관중석을 가지고 있다. 관중석의 왼쪽 위는 (0, 0), 오른쪽 아래는 (N-1, M-1)으로 표시된다. 
각 관중석에는 번호가 아래 그림처럼 매겨져있다. (0, 0)에서부터 0번으로 시작하여 오른쪽으로, 
끝에 다다르면 그 아래에서 또 오른쪽으로 숫자가 증가해나가는 식이다. 

수 K를 입력받으면 해당 위치를 숫자로 표현하기 

        ----- M-----
      | 0   1   2   3 
    N | 4   5   6   7
      | 8   9   10  11



---

쉬운문제라고 생각해서 바로 배열로 Matrix를 만들어 풀었는데 메모리초과가 계속 떴다....
N,M의 범위가 30000까지인데, 이를 배열로 만들면 256mb를 초과하는 것 같다.

배열을 안쓰고 하는 방법이 도저히 떠오르지 않아서 검색을 해보았더니 배열이 필요 없었고 
특정한 패턴을 찾아내기만 한다면 매우 쉽게 풀 수 있었다. 



## 코드

```
메모리 초과
        for(int i =0; i< N; i++){
            for(int j=0; j<M; j++){
                if(fillCount == K) {
                    System.out.printf("%d %d",i, j);
                }
                matrix[i][j] = fillCount;
                fillCount++;
            }
        }
        
```

## 해결 한 방법
N M K가  3 4 6일때 배열의 인덱스로 상상해본다면 [1][2] 일 것이다.
         6 4 14인 경우, [3][2]가 된다. 

잘 보면 K/M과 K%M으로 각각의 인덱스가 나오는것을 알 수 있다. 
6/4 = 1
6%4 = 2

14/4 = 3
14%4 = 2

따라서 이렇게 구현이 가능함. 
K/M + " " + K%M


## 수정 후 코드
```
import java.util.*;
public class HanwahSong_14652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        System.out.println(K/M + " " + K%M);
        ```      
