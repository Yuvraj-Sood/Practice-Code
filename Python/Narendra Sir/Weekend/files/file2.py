
file_name = r'D:\Programming\Python\Weekend\files\hello.txt'

f = open(file_name,'r')             # r, w , a

#content = f.read();
#print(content)

#lines = f.readlines()

#for line in lines:
#    print(line)
    
    
data = f.read(20)
print(data)

f.close()
