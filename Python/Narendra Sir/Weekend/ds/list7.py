import random

nums = []
count = 0

while(count<10):
    x = random.randint(1,20)
    if(x not in nums):
        nums.append(x)
        count += 1
    
print(nums)

print(sum(nums))
print(max(nums))
print(min(nums))






    
    