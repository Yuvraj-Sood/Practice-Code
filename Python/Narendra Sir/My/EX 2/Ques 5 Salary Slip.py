bs=int(input('Basic Salary : '))
if(bs>=30000):
    da=(50/100)*bs
    hra=(20/100)*bs
    ta=(10/100)*bs
    ts=bs+da+hra+ta
    tax=(8/100)*ts
elif(bs<30000 and bs>=18000):
    da=(45/100)*bs
    hra=(18/100)*bs
    ta=(8/100)*bs
    ts=bs+da+hra+ta
    tax=(6/100)*ts
else:
    da=(40/100)*bs
    hra=(15/100)*bs
    ta=(5/100)*bs
    ts=bs+da+hra+ta
    tax=(4/100)*ts
ns=ts-tax
print(bs)
print(da)
print(hra)
print(ta)
print(ts)
print(tax)
print(ns)