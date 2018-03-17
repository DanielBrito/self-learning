#3.3.1 - Escreva uma função que desenhe uma grade como a seguinte:
"""
        + - - - - + - - - - +

        |         |         |

        |         |         |

        |         |         |

        |         |         |

        + - - - - + - - - - +

        |         |         |

        |         |         |

        |         |         |

        |         |         |

        + - - - - + - - - - +
"""

def print_plus_minus_2by2():
    print('+ ' + ' - '*4 + ' + ' + ' - '*4 + ' +')
    print(' ')

def print_bars_2by2():
    print('|' + ' '*14 + '|' + ' '*14 + '|')
    print(' ')

def print_four_times(f):
    f()
    f()
    f()
    f()

print_plus_minus_2by2()
print_four_times(print_bars_2by2)
print_plus_minus_2by2()
print_four_times(print_bars_2by2)
print_plus_minus_2by2()


#3.3.2 - Escreva uma função que desenhe uma grade semelhante com quatro linhas
#e quatro colunas.

def print_plus_minus_4by4():
    print('+ ' + ' - '*4 + ' + ' + ' - '*4 + ' +', end=' ')
    print(' - '*4 + ' + ' + ' - '*4 + ' +')
    print(' ')


def print_bars_4by4():
    print('|' + ' '*14 + '|' + ' '*14 + '|', end='')
    print(' '*14 + '|' + ' '*14 + '|')
    print(' ')

print_plus_minus_4by4()
print_four_times(print_bars_4by4)
print_plus_minus_4by4()
print_four_times(print_bars_4by4)
print_plus_minus_4by4()
print_four_times(print_bars_4by4)
print_plus_minus_4by4()
print_four_times(print_bars_4by4)
print_plus_minus_4by4()











