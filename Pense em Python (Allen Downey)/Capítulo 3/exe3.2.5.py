#5. Defina uma função nova chamada do_four que receba um objeto de função
#e um valor e chame a função quatro vezes, passando o valor como um parâmetro.
#Deve haver só duas afirmações no corpo desta função, não quatro.

def do_four(f, value):
    f(value)
    f(value)

def print_value(value):
    print(value)

do_four(print_value, 'daniel')
print('')
do_four(print_value, 'brito')
print('')
do_four(print_value, 'computer')
print('')
do_four(print_value, 'science')

#Apesar do meu código, aparentemente, realizar o que se pede, ele está bastante
#diferente da resposta abaixo. Entendi como o código funciona, no entanto, achei
#que o encadeamente de sub-atividades neste exercício o deixou um tanto confuso.

#http://greenteapress.com/thinkpython2/code/do_four.py
