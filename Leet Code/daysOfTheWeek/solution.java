class Solution {
    public String solution(String S, int K) {
    // write your code in Java SE 11
    List<String> dayOfweek = List.of("Mon","Tue","Wed","Thu","Fri","Sat","Sun");
    int num = dayOfweek.indexOf(S);
    return dayOfweek.get((num + K)%7);
    }
