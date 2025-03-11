#Key-Value Pair

product={'id':101,'name':'Mouse','company':'Intex','price':300}
print(product)

print(product['price'])

product['price'] = 500   #Update a key value
print(product)

product['quantity'] = 10        #Add a new key
print(product)

del product['quantity']          #Remove key
print(product)

product.clear()
print(product)

cars = [{'name':'Hundai', 'price': 400000 },{'name': 'Swift', 'price': 500000}]

print(cars)






    
    