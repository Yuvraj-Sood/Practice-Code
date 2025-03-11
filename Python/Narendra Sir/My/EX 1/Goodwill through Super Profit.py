NO=float(input('NO. of years purchased ='))
CI=int(input('Capital Invested ='))
NRR=int(input('Normal Rate of Return ='))
AP1=int(input('Average Profit of 2016 ='))
AP2=int(input('Average Profit of 2017 ='))
AP3=int(input('Average Profit of 2018 ='))
AP4=int(input('Average Profit of 2019 ='))
AP=(AP1+AP2+AP3+AP4)/4
NP=(CI*NRR)/100
SP=AP-NP
GW=SP*NO
print(AP)
print(NP)
print(SP)
print(GW)