#@purposeOfCode to convert decimal to binary
#@techCategory python
#@code
def convertToBinary(n):
   if n > 1:
       convertToBinary(n//2)
   print(n % 2,end = '')

# decimal number
dec = 34

convertToBinary(dec)
print()

#output  100010
