#@purposeOfCode to choose a random element from list
#@techCategory python
#@code
#using random
import random

my_list = [1, 'a', 32, 'c', 'd', 31]
print(random.choice(my_list))

#@output 1

#using secrets module
import secrets

my_list = [1, 'a', 32, 'c', 'd', 31]
print(secrets.choice(my_list))

#@output c
