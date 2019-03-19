import pickle

end_of_file = False

dct = {'Cookies':'Oreos', 'Chocolate':'Hersheys'}

output_file = open('mydata.txt', 'wb')

pickle.dump(dct, output_file)

input_file = open('mydata.txt', 'rb')

try:    

   dct = pickle.load(input_file)

except EOFError:    

   end_of_file = True

for key, value in dct.items():    

   print(key, value)

output_file.close()

input_file.close()