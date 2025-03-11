import os
from os import path
    
file_name = r'D:\D:\Programming\Python\Weekend\files\Yuvraj.txt'

print(path.exists(file_name))
print(path.getsize(file_name))
print(path.isdir(file_name))
print(path.isfile(file_name))
 
print(os.getcwd())
os.chdir('..')
print(os.getcwd())
os.mkdir('alpha')
#os.rmdir('alpha')

#os.remove(file_name)
#os.rename('new','old')
