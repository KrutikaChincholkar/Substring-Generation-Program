string = input("Enter a string: ")

print("All substrings are:")
for i in range(len(string)):
    for j in range(i, len(string)):
        print(string[i:j+1])
