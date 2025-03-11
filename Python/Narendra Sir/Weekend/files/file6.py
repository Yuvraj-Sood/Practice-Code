
try:
    with open('bg.jpg','rb') as f1, open('bg1.jpg','wb') as f2:
        data = f1.read()
        f2.write(data)
except(FileNotFoundError):
    print('The file does not exist')
