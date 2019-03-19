price = 99
discount = 0
quantity = int(input('Please enter the quantity of packages you want: '))

if quantity >= 1 and quantity <= 9:
    price = price * quantity
else:
    if quantity >= 10 and quantity <= 19:
        price = price * quantity
        discount = price * 0.10
        price = price - discount
    else:
        if quantity >= 20 and quantity <= 49:
            price = price * quantity
            discount = price * 0.20
            price = price - discount
        else:
            if quantity >= 50 and quantity <= 99:
                price = price * quantity
                discount = price * 0.30
                price = price - discount
            else:
                if quantity >= 100:
                    price = price * quantity
                    discount = price * 0.40
                    price = price - discount
               
print('The price of your purchase is', format(price, '.2f'))
print('The amount of your discount was', format(discount, '.2f'))
