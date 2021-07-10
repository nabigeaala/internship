#@purposeOfCode to delete an element from dictionary
#@techCategory python
#@code
#1 using del keyword
my_dict = {31: 'a', 21: 'b', 14: 'c'}

del my_dict[31]

print(my_dict)

#@output {21: 'b', 14: 'c'}

#2 using pop
my_dict = {31: 'a', 21: 'b', 14: 'c'}

print(my_dict.pop(31))

print(my_dict)

#@output 
#a
#{21: 'b', 14: 'c'}
