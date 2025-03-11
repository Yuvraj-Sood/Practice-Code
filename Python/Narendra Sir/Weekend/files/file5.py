
try:
    with open('hello.txt','r') as f1, open('temp.txt','a') as f2:
        data = f1.read()
        f2.write(data)
except(FileNotFoundError):
    print('The file does not exist')
