package com.daniel.cursojava.aula46;

public class TestaFiguraGeometrica {

	public static void main(String[] args) {

		Quadrado quadrado = new Quadrado("Quadrado", "Vermelho", 4);

		Circulo circulo = new Circulo("Círculo", "Verde", 3);

		Triangulo triangulo = new Triangulo("Triângulo", "Amarelo", 3, 4);

		Cubo cubo = new Cubo("Cubo", "Preto", 4);

		Cilindro cilindro = new Cilindro("Cilindro", "Marrom", 6, 4);

		Piramide piramide = new Piramide("Piramide", "Azul", 3, 2, 4, 4, new Quadrado("Quadrado", "Azul", 4));

		FiguraGeometrica[] figuras = new FiguraGeometrica[6];

		figuras[0] = quadrado;
		figuras[1] = circulo;
		figuras[2] = triangulo;
		figuras[3] = cubo;
		figuras[4] = cilindro;
		figuras[5] = piramide;

		for (FiguraGeometrica figura : figuras) {
			
			System.out.println(figura.getNome());
			System.out.println("Cor: " + figura.getCor());

			if (figura instanceof Figura2D) {
				
				Figura2D f2d = (Figura2D) figura;
				System.out.println("Área: " + f2d.calcularArea());
				
				System.out.println();
			}

			if (figura instanceof Figura3D) {
				
				Figura3D f3d = (Figura3D) figura;
				System.out.println("Área: " + f3d.calcularArea());
				System.out.println("Volume: " + f3d.calcularVolume());
				
				System.out.println();
			}
		}
	}
}
