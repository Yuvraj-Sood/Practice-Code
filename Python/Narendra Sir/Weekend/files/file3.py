
file_name = 'hello1.txt'

try:
    f = open(file_name,'r')             # r, w , a
    data = f.read()
    print(data)
except(FileNotFoundError):
    print('The file does not exist')
finally:
    f.close()
