#3.2 - Um objeto de função é um valor que pode ser atribuído a uma variável
#ou passado como argumento. Por exemplo, do_twice é uma função que toma um objeto
#de função como argumento e o chama duas vezes:
#
#def do_twice(f):
#    f()
#    f()
#
#Aqui está um exemplo que usa do_twice para chamar uma função chamada print_spam duas vezes:
#
#def print_spam():
#    print('spam')
#
#do_twice(print_spam)

#3.2.1. Digite este exemplo em um script e teste-o.

def do_twice(f):
    f()
    f()

def print_spam():
    print('spam')

do_twice(print_spam)
