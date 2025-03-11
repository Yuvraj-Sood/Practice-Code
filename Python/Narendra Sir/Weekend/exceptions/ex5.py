#Resource : file, database, network connection
    
try:
    print('File Opened..')
    print('Task in Progress..')
    r = 4/2
except ZeroDivisionError as e:
    print(e)
finally:
    print('File Close..')    
print('End of Program..')

