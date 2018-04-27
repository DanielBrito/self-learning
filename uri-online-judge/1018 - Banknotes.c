#include <stdio.h>

/* https://www.urionlinejudge.com.br/judge/en/problems/view/1018 */

int main(){

	int n, div, mod;

	scanf("%d", &n);

	div = n/100;
	n = n%100;

	printf("%d nota(s) de R$ 100,00\n", div);

	div = n/50;
	n = n%50;

	printf("%d nota(s) de R$ 50,00\n", div);

	div = n/20;
	n = n%20;

	printf("%d nota(s) de R$ 20,00\n", div);

	div = n/10;
	n = n%10;

	printf("%d nota(s) de R$ 10,00\n", div);

	div = n/5;
	n = n%5;

	printf("%d nota(s) de R$ 5,00\n", div);

	div = n/2;
	n = n%2;

	printf("%d nota(s) de R$ 2,00\n", div);

	printf("%d nota(s) de R$ 1,00\n", n);

	return 0;
}