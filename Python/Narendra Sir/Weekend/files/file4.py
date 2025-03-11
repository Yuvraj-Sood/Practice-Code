
file_name = 'hello.txt'

try:
    with open(file_name,'r') as f:
        data = f.read()
        print(data)
except(FileNotFoundError):
    print('The file does not exist')
