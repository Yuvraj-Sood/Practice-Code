#http://localhost/phpmyadmin
#conda install pymysql

import pymysql

conn = pymysql.connect(host='localhost',user='root',password='',db='alpha')

cursor = conn.cursor()

sql = "insert into products values(2,'Cordless Keyboard','Logitech',450)"
cursor.execute(sql)

conn.commit()

conn.close()
