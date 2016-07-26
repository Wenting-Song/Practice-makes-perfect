
# Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

def addDigits(number):
    addthem = 0
    while number > 0 :
        a = number % 10 
        number = number // 10 
        addthem += a 
        
    if addthem >= 10:
    	return addDigits(addthem)
    return addthem


print(addDigits(38))
