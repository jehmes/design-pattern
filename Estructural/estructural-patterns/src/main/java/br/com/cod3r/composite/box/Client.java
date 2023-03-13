package br.com.cod3r.composite.box;

import br.com.cod3r.composite.box.model.Box;
import br.com.cod3r.composite.box.model.BoxItemComponent;
import br.com.cod3r.composite.box.model.Product;
import br.com.cod3r.composite.folders.model.Component;
import br.com.cod3r.composite.folders.model.File;
import br.com.cod3r.composite.folders.model.Folder;

import java.util.Arrays;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		BoxItemComponent camisa = new Product("Camisa", 23d);
		BoxItemComponent sapato = new Product("Sapato", 56d);
		BoxItemComponent bermuda = new Product("Bermuda", 50d);
		BoxItemComponent tenis = new Product("Tênis", 45d);
		BoxItemComponent gravata = new Product("Gravata", 32.50);
		BoxItemComponent relogio = new Product("Relogio", 100.50);

		BoxItemComponent box1 = new Box("Caixa 1");
		BoxItemComponent box2 = new Box("Caixa 2");
		BoxItemComponent box3 = new Box("Caixa 3");
		BoxItemComponent armario = new Box("Armário");

		box1.add(Arrays.asList(camisa, sapato, box2));
		box2.add(Arrays.asList(bermuda, tenis));
		box3.add(Arrays.asList(gravata, relogio));

		armario.add(Arrays.asList(box1, box3));

		System.out.println(armario);
		System.out.println("Valor do armário "+ armario.getValue());
		System.out.println("Valor da caixa 1 "+ box1.getValue());
		System.out.println("Valor da caixa 2 "+ box2.getValue());
		System.out.println("Valor da caixa 3 "+ box3.getValue());
		armario.print("");
	}
}
