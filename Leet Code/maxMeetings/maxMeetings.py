def maxMeetings(effectiveness):
    effectiveness.sort(reverse=True)  
    totalEffect = 0
    meetings = 0

    for i in effectiveness:
        if totalEffect + i > 0: 
            totalEffect += i
            meetings += 1
        else:
            break 

    return meetings

# Example usage:
n = 4
effectiveness = [3, -3, -0, -2]
print(maxMeetings(effectiveness)) 
