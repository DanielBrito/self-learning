#2.2.1 - O volume de uma esfera com raio r é (4/3)*3.14*r^3. Qual é o volume da esfera com raio 5?

print((4/3)*3.14*(5*5*5));

#2.2.2 - Suponha que o preço de capa de um livro seja R$24,95, mas as livrarias
#recebem um desconto de 40%. O transporte custa R$3,00 para o primeiro
#exemplar e 75 centavos para cada exemplar adicional. Qual é o custo total
#de atacado para 60 cópias?

print(60*(24.95 - (24.95*0.40)) + 3 + (59*0.75));

#2.2.3 - Se eu sair da minha casa às 6:52 e correr 1 quilômetro a um certo passo
#(8min15s por quilômetro), então 3 quilômetros a um passo mais rápido
#(7min12s por quilômetro) e 1 quilômetro no mesmo passo usado em primeiro
#lugar, que horas chego em casa para o café da manhã?

tempoCorrida = (((8*60)+15)+(3*((60*7)+12))+((8*60)+15))/60;

print('Chegará após', tempoCorrida, 'minutos. Às 7:30, aproximadamente.');
