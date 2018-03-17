#2. Altere do_twice para que receba dois argumentos, um objeto de função e um
#valor, e chame a função duas vezes, passando o valor como um argumento.

def do_twice(f, num):
    f(num)
    f(num)

def print_spam(num):
    print('spam', num)

do_twice(print_spam, 13)
