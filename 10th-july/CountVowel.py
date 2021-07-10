#@purposeOfCode  to count the no of each vowel
#@ techCategory python
#@code

# string of vowels
vowels = 'aeiou'

ip_str = 'Hello, have you tried our tutorial section yet?'

# make it suitable for caseless comparisions
ip_str = ip_str.casefold()

# make a dictionary with each vowel a key and value 0
count = {}.fromkeys(vowels,0)

# count the vowels
for char in ip_str:
   if char in count:
       count[char] += 1

print(count)

#@output {'o': 5, 'i': 3, 'a': 2, 'e': 5, 'u': 3}
