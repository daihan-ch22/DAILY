코플릿 문제를 풀고 있는데 2시간 동안 끙끙 되었지만 결국 테스트 케이스를 전부 통과하지 못했다.

질문글을 올려놓긴 했는데 답변 달리면 다시 고쳐보자. 

&nbsp;



## 문제
1. 배열로 짐들의 무게를 입력받고, int로 박스의 무게제한 을 받는다. 
2. 박스에는 최대 2개의 짐을 한번에 넣을 수 있다. (무게 제한을 넘지 않을때)       

&nbsp;


## 내 방식

[60, 73, 80, 87, 103, 109, 119, 123, 128, 129, 136, 146, 153, 168, 182], 200 이 주어졌을 때,

(60 + 73) (80 + 87) (103) (109) (119) (123) (128) (129) (136) (146) (153) (168) (182)

이렇게 총 13개의 박스가 필요할거라 생각했는데 답은 11이라고 나온다. 근본적인 부분부터 문제를 이해 못한것 같은데 그게 뭔지 모르겠다.

비공개 케이스도 전부 통과하지 못했다 ㅠ 결국 내 힘으로 풀지는 못했지만 그래도 디버그 하나하나 찍어가며 확인했던건 잘 했다고 생각함. 

&nbsp;&nbsp;

## 코드

```
class Greedy1{
    public int movingStuff(int[] stuff, int limit)
    {
        int count = 0;
        int[] arr = stuff;
        int sum = 0;
        int maxCount = 0;
        Arrays.sort(arr, 0, stuff.length);

        for(int i =0; i<arr.length; i++) {

            if (arr[i] == limit) {  //아이템 하나의 무게가 박스 최대용량이면 박스개수+ 건너뛰기
                count++;
                continue;
            }

            if (arr[i] + sum <= limit) { //limit 보다 합한게 작으면
                sum += arr[i];
                maxCount ++;  //박스 2칸중 1칸 차지함
            } else if(arr[i] + sum > limit){
                count+=1;
                sum = arr[i];
                if(i == arr.length-1 && arr[i]==sum) count+=1; // 마지막 인덱스를 돌고있고 그게 sum값이면 (마지막남은것)
            }

            if(maxCount == 2){  // 박스가 2개까지만 넣을 수 있음
                count ++;
                sum = 0; // 다넣으면 박스 +1 / sum 초기화
                maxCount = 0;
            }

            /*if (sum >= limit) {
                count+=1; //1
                sum = 0;
            }*/
        }
        return count;
    }
}
```
