class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a_b = (a+""+b);
        int ab = 2 * a * b;
        if(Integer.parseInt(a_b) < ab){
            answer = ab;
        }else{
            answer = Integer.parseInt(a_b);
        }
        return answer;
    }
}