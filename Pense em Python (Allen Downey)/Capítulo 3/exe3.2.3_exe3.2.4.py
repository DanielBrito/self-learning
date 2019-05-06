#3. Copie a definição de print_twice que aparece anteriormente neste capítulo
#no seu script.

def print_twice(bruce):
    print(bruce)
    print(bruce)

#4. Use a versão alterada de do_twice para chamar print_twice duas vezes,
#passando 'spam' como um argumento.

def do_twice(f, value):
    f(value)
    f(value)

do_twice(print_twice, 'spam')
