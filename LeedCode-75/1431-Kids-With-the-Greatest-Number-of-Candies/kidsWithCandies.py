class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        n = len(candies)
        maximum = max(candies)
        answerList = []
        for i in range(n):
            sumValue = candies[i] + extraCandies
            if sumValue >= maximum:
                answerList.append(True)
            else:
                answerList.append(False)

        return answerList
        
